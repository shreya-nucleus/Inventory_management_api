package com.in.nt.inventory.inventorymanagement.dto;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ResetInputDtoTest {
    
    @Test
    public void ResetInputDto() {
        
        String email="shreya@nucleusteq.com";
        String oldPassword="1234";
        String newPassword="5678";
        
        ResetInputDto dto= new ResetInputDto();
        ResetInputDto dto1= new ResetInputDto();
        
        dto.setEmail(email);
        dto.setOldPassword(oldPassword);
        dto.setNewPassword(newPassword);
        
        assertEquals(email, dto.getEmail());
        assertEquals(oldPassword, dto.getOldPassword());
        assertEquals(newPassword, dto.getNewPassword());
        
        dto1.setEmail(email);
        dto1.setOldPassword(oldPassword);
        dto1.setNewPassword(newPassword);
        
        assertNotNull(dto.hashCode());
        assertEquals(true, dto1.equals(dto));
        
        assertEquals("ResetInputDto [email=" + email + ", oldPassword=" + oldPassword + ", newPassword=" + newPassword + "]", dto.toString());     
    }
}
