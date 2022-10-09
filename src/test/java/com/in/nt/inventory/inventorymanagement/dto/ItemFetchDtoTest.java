package com.in.nt.inventory.inventorymanagement.dto;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ItemFetchDtoTest {
    @Test
    public void ItemFetchDto() {
        
        String itemName= "Lenovo Laptop";
        int itemNumber= 1; 
        Long assignItemId=new Long(2);
        LocalDate dateOfAssign= LocalDate.of(2022, 10, 06);
        String itemCondition="Working";
        String incidents="None";
        
        ItemFetchDto item= new ItemFetchDto();
        ItemFetchDto item1= new ItemFetchDto();
        
        item.setItemName(itemName);
        item.setItemNumber(itemNumber);
        item.setDateOfAssign(dateOfAssign);
        item.setItemCondition(itemCondition);
        item.setIncidents(incidents);
        item.setAssignItemId(assignItemId);
        
        assertEquals(itemName, item.getItemName());
        assertEquals(itemNumber, item.getItemNumber());
        assertEquals(dateOfAssign, item.getDateOfAssign());
        assertEquals(itemCondition, item.getItemCondition());
        assertEquals(incidents, item.getIncidents());
        assertEquals(assignItemId, item.getAssignItemId() );
    
        item1.setItemName(itemName);
        item1.setItemNumber(itemNumber);
        item1.setItemCondition(itemCondition);
        item1.setIncidents(incidents);
        item1.setAssignItemId(assignItemId);
        item1.setDateOfAssign(dateOfAssign);
        
        assertNotNull(item.hashCode());
        assertEquals(true, item1.equals(item));
        
        assertEquals("ItemFetchDto [itemName=" + itemName + ", itemNumber=" + itemNumber + ", assignItemId=" + assignItemId
                + ", dateOfAssign=" + dateOfAssign + ", itemCondition=" + itemCondition + ", incidents=" + incidents
                + "]", item.toString());
    }
}
