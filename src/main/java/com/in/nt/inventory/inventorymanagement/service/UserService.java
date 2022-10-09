package com.in.nt.inventory.inventorymanagement.service;

import com.in.nt.inventory.inventorymanagement.dto.ResetInputDto;
import com.in.nt.inventory.inventorymanagement.dto.UserLoginDto;
import com.in.nt.inventory.inventorymanagement.dto.UserDto;
import com.in.nt.inventory.inventorymanagement.dto.UserResponseDto;

/**
 * @author User service
 *
 */
public interface UserService {
    /**
     * @param usersDto : User Dto.
     * @return : return user information.
     */
    String userRegistration(UserDto usersDto);

    /**
     * @param userLoginDto has user login details.
     * @return : return user information.
     */
    UserResponseDto login(UserLoginDto userLoginDto);

    /**
     * @param resetInputDto : reset Input Dto.
     */
    void reset(ResetInputDto resetInputDto);
}
