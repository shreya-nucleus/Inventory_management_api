package com.in.nt.inventory.inventorymanagement.service.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.in.nt.inventory.inventorymanagement.dto.ResetInputDto;
import com.in.nt.inventory.inventorymanagement.dto.UserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.in.nt.inventory.inventorymanagement.entity.UserEntity;
import com.in.nt.inventory.inventorymanagement.dto.UserLoginDto;
import com.in.nt.inventory.inventorymanagement.dto.UserDto;
import com.in.nt.inventory.inventorymanagement.mapper.UserMapper;
import com.in.nt.inventory.inventorymanagement.exception.ValidationException;
import com.in.nt.inventory.inventorymanagement.repository.UserRepository;
import com.in.nt.inventory.inventorymanagement.service.UserService;

/**
 * User service implementation class which implements user service class.
 */
@Service
public class UserServiceImpl implements UserService {
    /**
     * user repository is autowired.
     */
    @Autowired
    private UserRepository userRepository;
    /**
     * user methods is used for getting user response.
     */
    @Autowired
    private UserMapper userMapper;
    /**
    * user registration method.
    */
    @Override
    public final String userRegistration(final UserDto userDto) {
        if (userDto.getEmail() == null) {
            throw new ValidationException("Email cannot be empty.");
        }
        if (userDto.getPassword() == null) {
            throw new ValidationException("Password cannot be empty.");
        }
        if (userDto.getFirstName() == null) {
            throw new ValidationException("First name cannot be empty.");
        }
        if (userDto.getLastName() == null) {
            throw new ValidationException("Last name cannot be empty.");
        }
        if (userRepository.findByEmail(userDto.getEmail()).isPresent()) {
            throw new ValidationException("Email Already Exist");
        }

        UserEntity user = userMapper.userDtoToUser(userDto);
        String formattedDate = LocalDateTime.now()
        .format(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss"));
        user.setUpdatedAt(formattedDate);
        user.setCreatedAt(formattedDate);

        userRepository.save(user);
        return "User created";
    }
    /**
     * method for user to login.
     */
    @Override
    public final UserResponseDto login(final UserLoginDto  loginDto) {

        UserEntity user = userRepository.getUserByEmailAndPassword(
                loginDto.getEmail(), loginDto.getPassword());

        if (user == null) {
            throw new ValidationException("User Not Found");
        }
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setId(user.getId());
        userResponseDto.setFirstName(user.getFirstName());
        userResponseDto.setLastName(user.getLastName());
        userResponseDto.setRole(user.getRole());
        userResponseDto.setFirstLogin(user.getFirstLogin());
        userResponseDto.setEmployeeId(user.getEmployeeId());
        userResponseDto.setEmail(user.getEmail());
        return userResponseDto;
    }
    /**
     * reset password method.
     */
    @Override
    public final void reset(final ResetInputDto resetInputDto) {
        UserEntity user =
                userRepository.getUserByEmailAndPassword(
                resetInputDto.getEmail(), resetInputDto.getOldPassword());
        if (user == null) {
            throw new ValidationException("User Not Found");
        }
        user.setPassword(resetInputDto.getNewPassword());
        user.setFirstLogin(false);
        userRepository.save(user);
    }
}
