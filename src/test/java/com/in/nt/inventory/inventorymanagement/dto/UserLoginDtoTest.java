package com.in.nt.inventory.inventorymanagement.dto;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class UserLoginDtoTest {
    
    @Test
    public void userLoginDtoTest(){
    
    String email="shreya@nucleusteq.com";
    String password="1234";
    
    UserLoginDto user= new UserLoginDto();
    UserLoginDto user1= new UserLoginDto();
    
    user.setEmail(email);
    user.setPassword(password);
    
    user1.setEmail(email);
    user1.setPassword(password);
    
    assertEquals(email,user.getEmail());
    assertEquals(password, user.getPassword());
    
    assertNotNull(user.hashCode());
    assertEquals(true, user1.equals(user));
    assertEquals(false, user.equals(null));
    assertEquals(true, user.equals(user));
    
    assertEquals("UserLoginDto [email=" + email + ", password=" + password + "]", user.toString());
    }
}

