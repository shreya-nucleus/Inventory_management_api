//package com.in.nt.inventory.inventorymanagement.controller;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//
//import com.in.nt.inventory.inventorymanagement.dto.UserResponseDto;
//import com.in.nt.inventory.inventorymanagement.entity.UserEntity;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.mockito.junit.jupiter.MockitoSettings;
//import org.mockito.quality.Strictness;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.in.nt.inventory.inventorymanagement.dto.UserDto;
//import com.in.nt.inventory.inventorymanagement.dto.UserLoginDto;
//import com.in.nt.inventory.inventorymanagement.mapper.UserMapper;
//import com.in.nt.inventory.inventorymanagement.service.UserService;
//
//@ExtendWith(MockitoExtension.class)
//@MockitoSettings(strictness = Strictness.LENIENT)
//public class UserControllerTest {
//    
//    @InjectMocks
//    private UserController userController;
//    @Mock
//    UserService userservice;
////  @Autowired
//    private MockMvc mockMvc;
//    
//       
//    @BeforeEach
//    public void setup() {
//        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
//    }
//    
//    
//    @Test
//    void singup() throws Exception{
//        MockitoAnnotations.openMocks(this);
//            int Id = 6;
//           String firstName = "firstname";
//           String lastName = "lastName";
//           String employeeId = "emp007";
//           String email ="email@email.com";
//           String password ="password";
//           String dateOfBirth ="dateOfBirth";
//           String contact = "phoneNumber";
//           String designation = "designation";
//           String dateOfJoining = "dateOfJoining";
//           String dateOfExit = "dateOfExit";
//           String location = "dateOfExit";
//           String updatedAt = "designation";
//           String createdAt = "dateOfJoining";
//           String role = "ADMIN";
//           
//           UserDto userEntity = new UserDto();
//            userEntity.setId(Id);
//            userEntity.setFirstName(firstName);
//            userEntity.setLastName(lastName);
//            userEntity.setEmployeeId(employeeId);
//            userEntity.setEmail(email);
//            userEntity.setPassword(password);
//            userEntity.setDateOfBirth(dateOfBirth);
//            userEntity.setContact(contact);
//            userEntity.setDesignation(designation);
//            userEntity.setDateOfJoining(dateOfJoining);
//            userEntity.setDateOfExit(dateOfExit);
//            userEntity.setLocation(location);
//            userEntity.setRole(role);
//            userEntity.setUpdatedAt(updatedAt);
//            userEntity.setCreatedAt(createdAt);
//          
//          
//           UserMapper userMethods=new UserMapper();
//           String inputJSON = new ObjectMapper().writeValueAsString(userEntity);
//           when(userservice.userRegistration(userEntity)).thenReturn("User created");
//           MvcResult mvcResult = this.mockMvc.perform(post("/user/registration")
//           .contentType(MediaType.APPLICATION_JSON).content(inputJSON)).andReturn();
//           int status = mvcResult.getResponse().getStatus();
//           assertEquals("User created", userservice.userRegistration(userEntity));
//    }
//    
//    @Test
//    void singin() throws Exception{
//
//       int Id = 6;
//       String email ="email@email.com";
//       String password ="password";
//
//        UserEntity userEntity = new UserEntity();
//        userEntity.setEmail(email);
//        userEntity.setPassword(password);
//
//        UserResponseDto userResponseDto = new UserResponseDto();
//        userResponseDto.setLastName("punjabi");
//        userResponseDto.setFirstName("shreya");
//
//        UserLoginDto loginDto = new UserLoginDto();
//        loginDto.setEmail("email@email.com");
//        when(userservice.login(loginDto)).thenReturn(userResponseDto);
//        loginDto.setPassword("password");
//        String inputJSON = new ObjectMapper().writeValueAsString(loginDto);
//       MvcResult mvcResult = this.mockMvc.perform(post("/user/login")
//               .contentType(MediaType.APPLICATION_JSON).content(inputJSON)).andReturn();
//       int status = mvcResult.getResponse().getStatus();
//       assertEquals(200, status);
//    }
//    
//    public UserDto buildUserDto(int id, String firstName, String lastName,
//            String employeeId, String email,String dateOfBirth, String contact,
//            String designation,String dateOfJoining, String dateOfExit,
//            String location, String role,String updatedAt, String createdAt) {
//            UserDto userEntity = new UserDto();
//            userEntity.setId(id);
//            userEntity.setFirstName(firstName);
//            userEntity.setLastName(lastName);
//            userEntity.setEmployeeId(employeeId);
//            userEntity.setEmail(email);
//            userEntity.setDateOfBirth(dateOfBirth);
//            userEntity.setContact(contact);
//            userEntity.setDesignation(designation);
//            userEntity.setDateOfJoining(dateOfJoining);
//            userEntity.setDateOfExit(dateOfExit);
//            userEntity.setLocation(location);
//            userEntity.setRole(role);
//            userEntity.setUpdatedAt(updatedAt);
//            userEntity.setCreatedAt(createdAt);
//         
//            return userEntity;
//           }
//
//}
