package com.in.nt.inventory.inventorymanagement.dto;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ItemDtoTest {
    @Test
    public void ItemDto(){
        
         Long id = new Long(1);
         String itemName= "Lenovo Laptop";
         int itemNumber= 1; 
         String itemType="Laptop"; 
         String billNo="SL12";
         LocalDate dateOfPurchase= LocalDate.of(2022, 10, 06);
         String warrantyPeriod="1 year";
         String itemLocation="Indore";
         String itemCondition="Working";
         String itemStatus="Assigned"; 
         String incidents="None";
         
         ItemDto item= new ItemDto();
         ItemDto item1= new ItemDto();
         
         item.setId(id);
         item.setItemName(itemName);
         item.setItemNumber(itemNumber);
         item.setItemType(itemType);
         item.setBillNo(billNo);
         item.setDateOfPurchase(dateOfPurchase);
         item.setWarrantyPeriod(warrantyPeriod);
         item.setItemLocation(itemLocation);
         item.setItemCondition(itemCondition);
         item.setItemStatus(itemStatus);
         item.setIncidents(incidents);
         
         assertEquals(id, item.getId());
         assertEquals(itemName, item.getItemName());
         assertEquals(itemNumber, item.getItemNumber());
         assertEquals(itemType, item.getItemType());
         assertEquals(billNo, item.getBillNo());
         assertEquals(dateOfPurchase, item.getDateOfPurchase());
         assertEquals(warrantyPeriod, item.getWarrantyPeriod());
         assertEquals(itemLocation, item.getItemLocation());
         assertEquals(itemCondition, item.getItemCondition());
         assertEquals(incidents, item.getIncidents());
         assertEquals(itemStatus, item.getItemStatus());
         
         item1.setId(id);
         item1.setItemName(itemName);
         item1.setItemNumber(itemNumber);
         item1.setItemType(itemType);
         item1.setBillNo(billNo);
         item1.setDateOfPurchase(dateOfPurchase);
         item1.setWarrantyPeriod(warrantyPeriod);
         item1.setItemLocation(itemLocation);
         item1.setItemCondition(itemCondition);
         item1.setIncidents(incidents);
         item1.setItemStatus(itemStatus);
         
         assertNotNull(item.hashCode());
         assertEquals(true, item1.equals(item));
         
         assertEquals("ItemDto [id=" + id + ", assetName=" + itemName + ", itemNumber=" + itemNumber + ", itemType="
                + itemType + ", billNo=" + billNo + ", dateOfPurchase=" + dateOfPurchase + ", warrantyPeriod="
                + warrantyPeriod + ", itemLocation=" + itemLocation + ", itemCondition=" + itemCondition
                + ", itemStatus=" + itemStatus + ", incidents=" + incidents + "]", item.toString());      
    }
}
