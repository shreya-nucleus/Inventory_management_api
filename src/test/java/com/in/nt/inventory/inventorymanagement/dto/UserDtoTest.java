package com.in.nt.inventory.inventorymanagement.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

import com.in.nt.inventory.inventorymanagement.entity.UserEntity;

public class UserDtoTest {
    /**
    * To test the userDto class.
    */
   @Test
   public void userDtoTest() {
       UserDto userDto =new UserDto();
       int Id = 6;
       String firstname = "firstname";
       String lastname = "lastname";
       String employeeId = "emp101";
       String email ="email@email.com";
       String password = "password";
       String dateOfBirth ="dateOfBirth";
       String contact = "contact";
       String designation = "designation";
       String dateOfJoining = "dateOfJoining";
       String dateOfExit = "dateOfExit";
       String updatedAt = "designation";
       String createdAt = "dateOfJoining";
       String role = "Employee";
      
       userDto.setId(Id);
       userDto.setFirstName(firstname);
       userDto.setLastName(lastname);
       userDto.setEmployeeId(employeeId);
       userDto.setEmail(email);
       userDto.setPassword(password);
       userDto.setDateOfBirth(dateOfBirth);
       userDto.setContact(contact);
       userDto.setDesignation(designation);
       userDto.setDateOfJoining(dateOfJoining);
       userDto.setDateOfExit(dateOfExit);
       userDto.setRole(role);
       userDto.setUpdatedAt(updatedAt);
       userDto.setCreatedAt(createdAt);
       
       assertEquals(email,userDto.getEmail());
       assertEquals(firstname,userDto.getFirstName());
       assertEquals(lastname,userDto.getLastName());
       assertEquals(password,userDto.getPassword());
       assertEquals(6,userDto.getId());
       assertEquals(employeeId,userDto.getEmployeeId());
       assertEquals(contact,userDto.getContact());
       assertEquals(designation,userDto.getDesignation());
       assertEquals(dateOfJoining,userDto.getDateOfJoining());
       assertEquals(dateOfExit,userDto.getDateOfExit());
       assertEquals(dateOfBirth,userDto.getDateOfBirth());
       assertEquals(updatedAt,userDto.getUpdatedAt());
       assertEquals(createdAt,userDto.getCreatedAt());
       assertEquals(role,userDto.getRole()); 
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
    
    UserDto user =new UserDto();
    
       int Id = 6;
       String firstName = "firstname";
       String lastName = "lastname";
       String employeeId = "emp007";
       String email ="email@email.com";
       String password = "password";
       String dateOfBirth ="dateOfBirth";
       String contact = "contact";
       String designation = "designation";
       String dateOfJoining = "dateOfJoining";
       String dateOfExit = "dateOfExit";
       String updatedAt = "designation";
       String createdAt = "dateOfJoining";
       String role = "Admin";
       
       UserDto userEntity = buildUserDto(Id, firstName,lastName, employeeId,
            email,password,dateOfBirth, contact,designation, dateOfJoining,
            dateOfExit, updatedAt,createdAt, role);
       
       UserDto userEntity1 = buildUserDto(Id, firstName,lastName, employeeId,
               email,password,dateOfBirth, contact,designation, dateOfJoining,
               dateOfExit, updatedAt,createdAt, role);
       
       String tostring = userEntity1.toString();
       assertEquals(false, userEntity.equals(null));
       assertEquals(true,userEntity.equals(userEntity1));
   }
   
   @Test
   public void testEqualsAndHashCode() {
       
           int Id = 6;
          String firstName = "firstname";
          String lastName = "lastname";
          String employeeId = "emp101";
          String email ="email@email.com";
          String password = "password";
          String dateOfBirth ="dateOfBirth";
          String contact = "contact";
          String designation = "designation";
          String dateOfJoining = "dateOfJoining";
          String dateOfExit = "dateOfExit";
          String location = "location";
          String updatedAt = "designation";
          String createdAt = "dateOfJoining";
          String role = "Employee";
          
          UserDto newObj2 =new UserDto();
          newObj2.setContact(contact);
          newObj2.setCreatedAt(createdAt);
          newObj2.setDateOfBirth(dateOfBirth);
          newObj2.setDateOfExit(dateOfExit);
          newObj2.setDateOfJoining(dateOfJoining);
          newObj2.setDesignation(designation);
          newObj2.setEmail(email);
          newObj2.setEmployeeId(employeeId);
          newObj2.setFirstName(firstName);
          newObj2.setId(Id);
          newObj2.setLastName(lastName);
          newObj2.setLocation(location);
          newObj2.setUpdatedAt(updatedAt);
          newObj2.setRole(role);
          newObj2.setPassword(password);
          
          UserDto newObj = new UserDto();
              
          newObj.setContact(contact);
          newObj.setCreatedAt(createdAt);
          newObj.setDateOfBirth(dateOfBirth);
          newObj.setDateOfExit(dateOfExit);
          newObj.setDateOfJoining(dateOfJoining);
          newObj.setDesignation(designation);
          newObj.setEmail(email);
          newObj.setEmployeeId(employeeId);
          newObj.setFirstName(firstName);
          newObj.setId(Id);
          newObj.setLastName(lastName);
          newObj.setLocation(location);
          newObj.setUpdatedAt(updatedAt);
          newObj.setRole(role);
          newObj.setPassword(password);
          
          assertEquals(newObj,newObj2);
   }
   
   public UserDto buildUserDto(int id, String firstName, String lastName,
        String employeeId, String email, String password,
        String dateOfBirth, String contact, String designation,
        String dateOfJoining, String dateOfExit, String role,
        String updatedAt, String createdAt) {
       UserDto userEntity = new UserDto();
    userEntity.setId(id);
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
 
    return userEntity;
   }
}