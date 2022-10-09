package com.in.nt.inventory.inventorymanagement.service;

import java.util.List;
import com.in.nt.inventory.inventorymanagement.dto.UserDto;

public interface AdminService {
    
    UserDto create(UserDto userDto);
    
    List<UserDto> getAllUsers();

    UserDto update(UserDto userDto);
    
}
