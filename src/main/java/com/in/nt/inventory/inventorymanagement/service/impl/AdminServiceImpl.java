package com.in.nt.inventory.inventorymanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.nt.inventory.inventorymanagement.dto.UserDto;
import com.in.nt.inventory.inventorymanagement.entity.UserEntity;
import com.in.nt.inventory.inventorymanagement.exception.ValidationException;
import com.in.nt.inventory.inventorymanagement.mapper.UserMapper;
import com.in.nt.inventory.inventorymanagement.repository.UserRepository;

import com.in.nt.inventory.inventorymanagement.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDto> getAllUsers() {
        List<UserEntity> userList = userRepository.findAll();
        List<UserDto> userDtoList = new ArrayList<>();
        for(UserEntity userEntity: userList) {
            userDtoList.add(userMapper.userToUserDto(userEntity));
        }
        return userDtoList;
    }
    
    @Override
    public UserDto create (UserDto userDto) {
        UserEntity userEntity = userMapper.userDtoToUser(userDto);
        userEntity.setFirstLogin(true);
        userEntity = userRepository.save(userEntity);
        return userMapper.userToUserDto(userEntity);
    }
    
    @Override
    public UserDto update(UserDto userDto) {
        UserEntity userEntity = userRepository.findById(userDto.getId()).orElseThrow(() -> new ValidationException("Employee not found"));

        userEntity = userMapper.userDtoToUser(userDto);
        userEntity.setId(userDto.getId());
        userRepository.save(userEntity);

        return userDto;
    }
}
