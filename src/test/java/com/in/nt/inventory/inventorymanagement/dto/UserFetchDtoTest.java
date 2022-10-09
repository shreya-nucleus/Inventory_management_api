package com.in.nt.inventory.inventorymanagement.dto;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class UserFetchDtoTest {
    @Test
    public void userFetchTest() {
        
    String employeeId="N001"; 
    String firstName="Shreya";
    String lastName="Punjabi";
    String email="shreya@nucleusteq.com";
    String contact="9755053171";
    String dateOfBirth="21/01/1999";
    String designation="Engineer";
    String dateOfJoining="11/07/2022";
    String location="Indore";
    
    UserFetchDto dto= new UserFetchDto();
    UserFetchDto dto1= new UserFetchDto();
    
    dto.setEmployeeId(employeeId);
    dto.setFirstName(firstName);
    dto.setLastName(lastName);
    dto.setEmail(email);
    dto.setContact(contact);
    dto.setDateOfBirth(dateOfBirth);
    dto.setDesignation(designation);
    dto.setDateOfJoining(dateOfJoining);
    dto.setLocation(location);
    
    assertEquals(employeeId, dto.getEmployeeId());
    assertEquals(firstName, dto.getFirstName());
    assertEquals(lastName, dto.getLastName());
    assertEquals(email, dto.getEmail());
    assertEquals(contact, dto.getContact());
    assertEquals(dateOfBirth, dto.getDateOfBirth());
    assertEquals(designation, dto.getDesignation());
    assertEquals(dateOfJoining, dto.getDateOfJoining());
    assertEquals(location, dto.getLocation());
    
    dto1.setEmployeeId(employeeId);
    dto1.setFirstName(firstName);
    dto1.setLastName(lastName);
    dto1.setEmail(email);
    dto1.setContact(contact);
    dto1.setDateOfBirth(dateOfBirth);
    dto1.setDesignation(designation);
    dto1.setDateOfJoining(dateOfJoining);
    dto1.setLocation(location);
    
    assertNotNull(dto.hashCode());
    assertEquals(true, dto1.equals(dto));
    
    assertEquals("UserFetchDto [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
            + ", email=" + email + ", contact=" + contact + ", dateOfBirth=" + dateOfBirth + ", designation="
            + designation + ", dateOfJoining=" + dateOfJoining + ", location=" + location + "]", dto.toString());
    }
}
