package com.in.nt.inventory.inventorymanagement.dto;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class UserResponseDtoTest {
    
    @Test
    public void UserResponseDto() {
        
         Integer id=1;
         String firstName="Shreya";
         String lastName="Punjabi";
         String role="Engineer";
         Boolean firstLogin=true;
         String employeeId="N001";
         String email="shreya@nucleusteq.com";
         
         UserResponseDto dto= new UserResponseDto();
         UserResponseDto dto1= new UserResponseDto();
         
         dto.setId(id);
         dto.setEmployeeId(employeeId);
         dto.setFirstName(firstName);
         dto.setLastName(lastName);
         dto.setEmail(email);
         dto.setRole(role);
         dto.setFirstLogin(firstLogin);
         
         assertEquals(employeeId, dto.getEmployeeId());
         assertEquals(firstName, dto.getFirstName());
         assertEquals(lastName, dto.getLastName());
         assertEquals(email, dto.getEmail());
         assertEquals(id, dto.getId());
         assertEquals(role, dto.getRole());
         assertEquals(firstLogin, dto.getFirstLogin());
         
         dto1.setEmployeeId(employeeId);
         dto1.setFirstName(firstName);
         dto1.setLastName(lastName);
         dto1.setEmail(email);
         dto1.setRole(role);
         dto1.setFirstLogin(firstLogin);
         dto1.setId(id);
         
         assertNotNull(dto.hashCode());
         assertEquals(true, dto1.equals(dto));
         
         assertEquals("UserResponseDto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", role=" + role
                + ", firstLogin=" + firstLogin + ", employeeId=" + employeeId + ", email=" + email + "]", dto.toString());   
    }
}
