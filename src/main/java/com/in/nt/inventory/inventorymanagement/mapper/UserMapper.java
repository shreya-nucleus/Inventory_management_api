package com.in.nt.inventory.inventorymanagement.mapper;

import org.springframework.stereotype.Component;
import com.in.nt.inventory.inventorymanagement.dto.UserDto;
import com.in.nt.inventory.inventorymanagement.entity.UserEntity;

/**
 * UserMethods Class
 *
 */
@Component
public class UserMapper {
    public UserEntity userDtoToUser(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(userDto.getFirstName());
        userEntity.setLastName(userDto.getLastName());
        userEntity.setEmployeeId(userDto.getEmployeeId());
        userEntity.setEmail(userDto.getEmail());
        userEntity.setPassword(userDto.getPassword());
        userEntity.setDateOfBirth(userDto.getDateOfBirth());
        userEntity.setContact(userDto.getContact());
        userEntity.setDesignation(userDto.getDesignation());
        userEntity.setDateOfJoining(userDto.getDateOfJoining());
        userEntity.setDateOfExit(userDto.getDateOfExit());
        userEntity.setRole(userDto.getRole());
        userEntity.setLocation(userDto.getLocation());
        userEntity.setUpdatedAt(userDto.getUpdatedAt());
        userEntity.setCreatedAt(userDto.getCreatedAt());
        return userEntity;
    }
    /**
     * @param user
     * @return
     */
    public UserDto userToUserDtoResponse(UserEntity user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmployeeId(user.getEmployeeId());
        userDto.setEmail(user.getEmail());
        userDto.setDateOfBirth(user.getDateOfBirth());
        userDto.setContact(user.getContact());
        userDto.setDesignation(user.getDesignation());
        userDto.setDateOfJoining(user.getDateOfJoining());
        userDto.setDateOfExit(user.getDateOfExit());
        userDto.setRole(user.getRole());
        userDto.setUpdatedAt(user.getUpdatedAt());
        userDto.setCreatedAt(user.getCreatedAt());
        userDto.setLocation(user.getLocation());
        userDto.setFirstLogin(user.getFirstLogin());
        return userDto;
    }
    
    public UserDto userToUserDto(UserEntity userEntity) {
        
        UserDto userDto = new UserDto();
        userDto.setId(userEntity.getId());
        userDto.setFirstName(userEntity.getFirstName());
        userDto.setLastName(userEntity.getLastName());
        userDto.setEmployeeId(userEntity.getEmployeeId());
        userDto.setEmail(userEntity.getEmail());
        userDto.setDateOfBirth(userEntity.getDateOfBirth());
        userDto.setContact(userEntity.getContact());
        userDto.setDesignation(userEntity.getDesignation());
        userDto.setDateOfJoining(userEntity.getDateOfJoining());
        userDto.setDateOfExit(userEntity.getDateOfExit());
        userDto.setRole(userEntity.getRole());
        userDto.setUpdatedAt(userEntity.getUpdatedAt());
        userDto.setCreatedAt(userEntity.getCreatedAt());
        userDto.setLocation(userEntity.getLocation());
        userDto.setFirstLogin(userEntity.getFirstLogin());

        return userDto;
    }
}
