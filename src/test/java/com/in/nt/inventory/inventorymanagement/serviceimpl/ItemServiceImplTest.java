package com.in.nt.inventory.inventorymanagement.serviceimpl;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.in.nt.inventory.inventorymanagement.dto.ItemDto;
import com.in.nt.inventory.inventorymanagement.entity.ItemEntity;
import com.in.nt.inventory.inventorymanagement.mapper.ItemMapper;
import com.in.nt.inventory.inventorymanagement.repository.ItemRepository;
import com.in.nt.inventory.inventorymanagement.service.impl.ItemServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ItemServiceImplTest {
    
    @Mock
    private ItemRepository itemRepository;
    
    
    @Autowired
    @InjectMocks
    private ItemServiceImpl itemServiceImpl;
    
    @Mock
    private ItemMapper itemMapper;
    
    private ItemDto itemDto;
    
    private ItemEntity itemEntity;
    
    @BeforeEach
    public void setUp() {
        itemDto = new ItemDto();
        itemDto.setBillNo("SL05");
        itemDto.setDateOfPurchase(LocalDate.parse("2022-12-12"));
        itemDto.setId(1L);
        itemDto.setIncidents("None");
        itemDto.setItemCondition("working");
        itemDto.setItemLocation("indore");
        itemDto.setItemName("Apple Phone");
        itemDto.setItemNumber(123);
        itemDto.setItemStatus("assign");
        itemDto.setItemType("phone");
        itemDto.setWarrantyPeriod("1 year");
        
        itemEntity = new ItemEntity();
        itemEntity.setBillNo("SL05");
        itemEntity.setDateOfPurchase(LocalDate.parse("2022-12-12"));
        itemEntity.setId(1L);
        itemEntity.setIncidents("None");
        itemEntity.setItemCondition("working");
        itemEntity.setItemLocation("indore");
        itemEntity.setItemName("Apple Phone");
        itemEntity.setItemNumber(123);
        itemEntity.setItemStatus("unassign");
        itemEntity.setItemType("phone");
        itemEntity.setWarrantyPeriod("1 year");
    }
    
    @Test
    public void addItemPositiveTest() {
        
        when(itemRepository.save(itemEntity)).thenReturn(itemEntity);
        when(itemMapper.itemDtoToItem(itemDto)).thenReturn(itemEntity);
        itemServiceImpl.create(itemDto);
        verify(itemRepository,times(1)).save(itemEntity);
    }
    
    @AfterEach
    public void tearDown() {
        itemDto = null;
        itemEntity = null;
    }

}
