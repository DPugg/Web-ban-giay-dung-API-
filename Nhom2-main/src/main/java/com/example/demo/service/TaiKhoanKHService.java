package com.example.demo.service;


import com.example.demo.DTO.TaiKhoanKHDto;
import com.example.demo.DTO.ThuongHieuDto;
import com.example.demo.entity.TAI_KHOAN_KH;
import com.example.demo.repository.TaiKhoanKHRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TaiKhoanKHService {
    @Autowired
    private TaiKhoanKHRepository repo;
    @Autowired
    private ModelMapper modelMapper;

    public List<TAI_KHOAN_KH> ListAll(){
        return (List<TAI_KHOAN_KH>) repo.findAll();
    }

    public Optional<TAI_KHOAN_KH> get(String id){
        return repo.findById(id);
    }

    public void delete(String id){
        repo.deleteById(id);
    }

    public void save(TAI_KHOAN_KH TaiKhoanKH){
        repo.save(TaiKhoanKH);
    }

    public TaiKhoanKHDto findByUsername(String username){
        List<TAI_KHOAN_KH> KH =repo.findByUsername(username);
        TaiKhoanKHDto dto = modelMapper.map(KH.get(0), TaiKhoanKHDto.class);
        return dto;
    }

    public void insert(String username, String password, String maKH){
        repo.insert(username, password, maKH);
    }
}
