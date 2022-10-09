package com.in.nt.inventory.inventorymanagement.controller;

import com.in.nt.inventory.inventorymanagement.dto.ResetInputDto;
import com.in.nt.inventory.inventorymanagement.dto.UserResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.nt.inventory.inventorymanagement.dto.UserDto;
import com.in.nt.inventory.inventorymanagement.dto.UserLoginDto;
import com.in.nt.inventory.inventorymanagement.service.UserService;

import javax.validation.Valid;
/**
* @author User controller class
*/
@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    /**
    *
    */
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * User Service reference object.
     */
    @Autowired
    private UserService userService;

    /**
     * @param userDto
     * @return user created message.
     */
    @PostMapping("/registration")
    public final ResponseEntity<String> registerUser(@Valid @RequestBody final UserDto userDto) {
        return ResponseEntity.ok(userService.userRegistration(userDto));
    }

    /**
     * @param loginDto: the entry we are going to provide.
     * @return UserResponseDto
     */
    @PostMapping("/login")
    public final ResponseEntity<UserResponseDto> login(@RequestBody UserLoginDto loginDto) {
        logger.info("user should have login");
        UserResponseDto result = userService.login(loginDto);
        return ResponseEntity.ok(result);
    }

    /**
     * @param resetInputDto
     * @return message 
     */
    @PostMapping("/reset")
    public final ResponseEntity<String> reset(@RequestBody ResetInputDto resetInputDto) {
        userService.reset(resetInputDto);
        return ResponseEntity.ok("Password successfully changed");
    }
}
