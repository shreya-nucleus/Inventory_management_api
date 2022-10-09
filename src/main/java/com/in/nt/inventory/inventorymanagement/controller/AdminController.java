package com.in.nt.inventory.inventorymanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.nt.inventory.inventorymanagement.dto.UserDto;
import com.in.nt.inventory.inventorymanagement.service.AdminService;

/**
 * @author admin controller class.
 *
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class AdminController {
    /**
     * admin service reference object.
     */
    @Autowired
    private AdminService adminService;

    /**
     * @return list of employees.
     */
    @GetMapping("/allEmployees")
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok(adminService.getAllUsers());
    }

    /**
     * @param userDto:  user dto object
     * @return userDto.
     */
    @PostMapping("/addEmployee")
    public ResponseEntity<UserDto> create(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(adminService.create(userDto));
    }

    /**
     * @param userDto : user dto in object.
     * @return UserDto
     */
    @PutMapping("/updateEmployee")
    public ResponseEntity<UserDto> update(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(adminService.update(userDto));
    }
}
