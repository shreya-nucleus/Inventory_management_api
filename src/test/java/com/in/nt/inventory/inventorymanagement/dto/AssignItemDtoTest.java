package com.in.nt.inventory.inventorymanagement.dto;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class AssignItemDtoTest {
    @Test
    public void AssignItemDto() {
        
        Long id = new Long(1);
        String employeeId = "emp101";
        Integer employeeTableId= 2;
        Long itemId = new Long(1);
        LocalDate dateOfAssign= LocalDate.of(2022, 10, 06);
        String itemCondition="Working";
        String incidents="None";
        String receivedByEmployee= "Home";
//      LocalDateTime dateCreated= LocalDateTime.of(2022, 10, 06); 
//      LocalDateTime dateUpdated= LocalDateTime.of(2022, 10, 07);
        String email ="email@email.com";
        Integer itemNumber= 1;
        String employeeName = "Shreya";
        String contact= "9755053154";
        String itemName= "Lenovo Laptop";
        String dateOfJoining= "11/07/2022";
        ItemDto itemDto=null;
        
        AssignItemDto dto= new AssignItemDto();
        AssignItemDto dto1= new AssignItemDto();
        
        dto.setId(itemId);
        dto.setEmployeeId(employeeId);
        dto.setEmployeeTableId(employeeTableId);
        dto.setItemId(itemId);
        dto.setDateOfAssign(dateOfAssign);
        dto.setItemCondition(itemCondition);
        dto.setIncidents(incidents);
        dto.setEmployeeName(employeeName);
        dto.setReceivedByEmployee(receivedByEmployee);
//        dto.setDateCreated(dateCreated);
//        dto.setDateUpdated(dateUpdated);
        dto.setEmail(email);
        dto.setItemNumber(itemNumber);
        dto.setContact(contact);
        dto.setItemName(itemName);
        dto.setDateOfJoining(dateOfJoining);
        
        assertEquals(id, dto.getId());
        assertEquals(employeeId, dto.getEmployeeId());
        assertEquals(employeeTableId, dto.getEmployeeTableId());
        assertEquals(itemId, dto.getItemId());
        assertEquals(dateOfAssign, dto.getDateOfAssign());
        assertEquals(itemCondition, dto.getItemCondition());
        assertEquals(incidents, dto.getIncidents());
        assertEquals(employeeName, dto.getEmployeeName());
        assertEquals(receivedByEmployee, dto.getReceivedByEmployee());
//        assertEquals(dateCreated, dto.getDateCreated());
//        assertEquals(dateUpdated, dto.getDateUpdated());
        assertEquals(email, dto.getEmail());
        assertEquals(itemNumber, dto.getItemNumber());
        assertEquals(contact, dto.getContact());     
        assertEquals(itemName, dto.getItemName());
        assertEquals(dateOfJoining, dto.getDateOfJoining());     
        
        dto1.setId(itemId);
        dto1.setEmployeeId(employeeId);
        dto1.setEmployeeTableId(employeeTableId);
        dto1.setItemId(itemId);
        dto1.setDateOfAssign(dateOfAssign);
        dto1.setItemCondition(itemCondition);
        dto1.setIncidents(incidents);
        dto1.setEmployeeName(employeeName);
        dto1.setReceivedByEmployee(receivedByEmployee);
//        dto1.setDateCreated(dateCreated);
//        dto1.setDateUpdated(dateUpdated);
        dto1.setEmail(email);
        dto1.setItemNumber(itemNumber);
        dto1.setContact(contact);
        dto1.setItemName(itemName);
        dto1.setDateOfJoining(dateOfJoining);
        
        assertNotNull(dto.hashCode());
        assertEquals(true, dto1.equals(dto));
        
        assertEquals("AssignItemDto [id=" + id + ", employeeId=" + employeeId 
                + ", employeeTableId=" + employeeTableId + ", itemId="
                + itemId + ", dateOfAssign=" + dateOfAssign
                + ", receivedByEmployee=" + receivedByEmployee
                + ", email=" + email + ", itemNumber="
                + itemNumber + ", employeeName=" + employeeName + ", contact="
                + contact + ", itemName=" + itemName + ", itemCondition="
                + itemCondition + ", incidents=" + incidents
                + ", dateOfJoining=" + dateOfJoining
                + ", itemDto=" + itemDto + "]", dto.toString());
   }
}
