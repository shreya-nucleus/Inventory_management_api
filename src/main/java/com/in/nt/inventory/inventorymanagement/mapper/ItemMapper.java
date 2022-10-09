package com.in.nt.inventory.inventorymanagement.mapper;

import com.in.nt.inventory.inventorymanagement.dto.ItemDto;
import com.in.nt.inventory.inventorymanagement.entity.ItemEntity;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {

    public ItemDto itemToItemDto(ItemEntity itemEntity) {
        ItemDto itemDto = new ItemDto();

        itemDto.setId(itemEntity.getId());        
        itemDto.setBillNo(itemEntity.getBillNo());
        itemDto.setWarrantyPeriod(itemEntity.getWarrantyPeriod());
        itemDto.setItemName(itemEntity.getItemName());
        itemDto.setDateOfPurchase(itemEntity.getDateOfPurchase());
        itemDto.setItemType(itemEntity.getItemType());
        itemDto.setItemStatus(itemEntity.getItemStatus());
        itemDto.setDateOfPurchase(itemEntity.getDateOfPurchase());
        itemDto.setIncidents(itemEntity.getIncidents());
        itemDto.setItemNumber(itemEntity.getItemNumber());
        itemDto.setItemCondition(itemEntity.getItemCondition());   
        itemDto.setItemLocation(itemEntity.getItemLocation());
        
        return itemDto;
    }

    public ItemEntity itemDtoToItem(ItemDto itemDto) {
        ItemEntity itemEntity = new ItemEntity();
        
        itemEntity.setBillNo(itemDto.getBillNo());
        itemEntity.setWarrantyPeriod(itemDto.getWarrantyPeriod());
        itemEntity.setItemName(itemDto.getItemName());
        itemEntity.setDateOfPurchase(itemDto.getDateOfPurchase());
        itemEntity.setItemLocation(itemDto.getItemLocation());
        itemEntity.setItemNumber(itemDto.getItemNumber());
        itemEntity.setItemLocation(itemDto.getItemLocation());
        itemEntity.setItemStatus(itemDto.getItemStatus());
        itemEntity.setItemCondition(itemDto.getItemCondition());
        itemEntity.setIncidents(itemDto.getIncidents());
        itemEntity.setItemType(itemDto.getItemType());
        itemEntity.setItemLocation(itemDto.getItemLocation());
        
        return itemEntity;
    }

}
