package com.example.demo.controller;

import com.example.demo.DTO.TaiKhoanKHDto;
import com.example.demo.entity.TAI_KHOAN_KH;
import com.example.demo.service.TaiKhoanKHService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/TKKH/")
public class TaiKhoanKHController {
    @Autowired
    private TaiKhoanKHService taiKhoanKHService ;

    @GetMapping("get/{username}")
    public TaiKhoanKHDto getUser(@PathVariable String username){
        TaiKhoanKHDto dto = taiKhoanKHService.findByUsername(username);
        return dto;
    }

//    @PostMapping("register")
//    public void insert( @RequestBody @NotNull TAI_KHOAN_KH tkkh){
//        taiKhoanKHService.insert(tkkh.getUsername(), tkkh.getPassword());
//    }

}
