package com.in.nt.inventory.inventorymanagement.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserEntityTest { 
     /**
     * To test the userDto class.
     */
    @Test
    public void userDtoTest() {
        UserEntity userEntity =new UserEntity();
        int Id = 6;
        String firstName = "firstname";
        String lastName = "lastName";
        String employeeId = "emp101";
        String email ="email@email.com";
        String password = "password";
        String dateOfBirth ="dateOfBirth";
        String contact = "phoneNumber";
        String designation = "designation";
        String dateOfJoining = "dateOfJoining";
        String dateOfExit = "dateOfExit";
        String updatedAt = "designation";
        String createdAt = "dateOfJoining";
        String role = "Employee";
       
        userEntity.setId(Id);
        userEntity.setFirstName(firstName);
        userEntity.setLastName(lastName);
        userEntity.setEmployeeId(employeeId);
        userEntity.setEmail(email);
        userEntity.setPassword(password);
        userEntity.setDateOfBirth(dateOfBirth);
        userEntity.setContact(contact);
        userEntity.setDesignation(designation);
        userEntity.setDateOfJoining(dateOfJoining);
        userEntity.setDateOfExit(dateOfExit);
        userEntity.setRole(role);
        userEntity.setUpdatedAt(updatedAt);
        userEntity.setCreatedAt(createdAt);
        
        assertEquals(email,userEntity.getEmail());
        assertEquals(firstName,userEntity.getFirstName());
        assertEquals(lastName,userEntity.getLastName());
        assertEquals(password,userEntity.getPassword());
        assertEquals(Id,userEntity.getId());
        assertEquals(employeeId,userEntity.getEmployeeId());
        assertEquals(contact,userEntity.getContact());
        assertEquals(designation,userEntity.getDesignation());
        assertEquals(dateOfJoining,userEntity.getDateOfJoining());
        assertEquals(dateOfExit,userEntity.getDateOfExit());
        assertEquals(dateOfBirth,userEntity.getDateOfBirth());
        assertEquals(updatedAt,userEntity.getUpdatedAt());
        assertEquals(createdAt,userEntity.getCreatedAt());
        assertEquals(role,role); 
    }
    @Test
    public void testGettersAndSetters() {
        UserEntity userDto =new UserEntity();
        
        assertNull(userDto.getEmail());
        String email = "email";
        userDto.setEmail(email);
        assertEquals(email, userDto.getEmail());
    }
    @Test
    public void testToString() {
        
        UserEntity user =new UserEntity();
        
        int Id = 6;
        String firstName = "firstname";
        String lastName = "lastName";
        String employeeId = "emp101";
        String email ="email@email.com";
        String password = "password";
        String dateOfBirth ="dateOfBirth";
        String contact = "phoneNumber";
        String designation = "designation";
        String dateOfJoining = "dateOfJoining";
        String dateOfExit = "dateOfExit";
        String updatedAt = "designation";
        String location = "designation";
        String createdAt = "dateOfJoining";
        String role = "Admin";
        UserEntity userEntity = buildUserEntity(Id, firstName,lastName, employeeId,
                email,password,dateOfBirth, contact,designation, dateOfJoining,
                dateOfExit, updatedAt,createdAt, role ,location);
        
        UserEntity userEntity1 = buildUserEntity(Id, firstName,lastName, employeeId,
                email,password,dateOfBirth, contact,designation, dateOfJoining,
                dateOfExit, updatedAt,createdAt, role,location);
        String tostring = userEntity1.toString();
        
        assertTrue(tostring.contains("firstName=" + firstName));
        assertEquals(userEntity, userEntity1);
        assertEquals(userEntity, userEntity);
        assertEquals(false, userEntity.equals(null));
        assertEquals(false,userEntity.equals(user));
        assertEquals(userEntity.hashCode(),userEntity1.hashCode());
    }
    @Test
    public void testEqualsAndHashCode() {
          int Id = 6;
          String firstName = "firstname";
          String lastName = "lastName";
          String employeeId = "emp101";
          String email ="email@email.com";
          String password = "password";
          String dateOfBirth ="dateOfBirth";
          String contact = "phoneNumber";
          String designation = "designation";
          String dateOfJoining = "dateOfJoining";
          String dateOfExit = "dateOfExit";
          String location = "location";
          String updatedAt = "designation";
          String createdAt = "dateOfJoining";
          String role = "Employee";
          
          UserEntity userentity1 = buildUserEntity(Id,firstName,lastName,email
                    ,employeeId,password,dateOfBirth,contact,designation,dateOfJoining,
                     dateOfExit,location,role,createdAt,updatedAt);
          
          UserEntity userentity2 = buildUserEntity(Id,firstName,lastName,email
                    ,employeeId,password,dateOfBirth,contact,designation,dateOfJoining,
                     dateOfExit,location,role,createdAt,updatedAt);
          assertEquals(userentity1,userentity2);     
    }
    
    public UserEntity buildUserEntity(int id, String firstName, String lastName,
            String employeeId, String email, String password,
            String dateOfBirth, String contact, String desiganation,
            String dateOfJoining, String dateOfExit, String role,
            String updatedAt, String createdAt, String location) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);
        userEntity.setFirstName(firstName);
        userEntity.setLastName(lastName);
        userEntity.setEmployeeId(employeeId);
        userEntity.setEmail(email);
        userEntity.setPassword(password);
        userEntity.setDateOfBirth(dateOfBirth);
        userEntity.setContact(contact);
        userEntity.setDesignation(desiganation);
        userEntity.setDateOfJoining(dateOfJoining);
        userEntity.setDateOfExit(dateOfExit);
        
        userEntity.setLocation(location);
        userEntity.setRole(role);
        userEntity.setUpdatedAt(updatedAt);
        userEntity.setCreatedAt(createdAt);
  
        return userEntity;
    }
    
    
    

}
