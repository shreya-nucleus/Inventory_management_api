package com.in.nt.inventory.inventorymanagement.mapper;

import com.in.nt.inventory.inventorymanagement.dto.AssignItemDto;
import com.in.nt.inventory.inventorymanagement.entity.AssignItemEntity;
import com.in.nt.inventory.inventorymanagement.entity.ItemEntity;
import com.in.nt.inventory.inventorymanagement.exception.ValidationException;
import com.in.nt.inventory.inventorymanagement.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class AssignItemMapper {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private ItemMapper itemMapper;

    public AssignItemDto assignItemToAssignItemDto1(AssignItemEntity assignItemEntity) {
        AssignItemDto assignItemDto = new AssignItemDto();
        assignItemDto.setEmployeeId(assignItemEntity.getEmployeeId());
        assignItemDto.setItemId(assignItemEntity.getItemId());
        assignItemDto.setEmployeeTableId(assignItemEntity.getEmployeeTableId());
        assignItemDto.setReceivedByEmployee(assignItemEntity.getReceivedByEmployee());
        assignItemDto.setDateOfAssign(assignItemEntity.getDateOfAssign());
        assignItemDto.setDateCreated(assignItemEntity.getDateCreated());
        assignItemDto.setDateUpdated(assignItemEntity.getDateUpdated());
        assignItemDto.setId(assignItemEntity.getId());
        if (assignItemEntity.getItemId() != null) {
            ItemEntity item = itemRepository.findById(assignItemEntity.getItemId()).orElseThrow(()->new ValidationException("Item not found."));
            assignItemDto.setItemDto(itemMapper.itemToItemDto(item));
        }
        return assignItemDto;
    }

    public AssignItemEntity assignItemDtoToEmployeeItem(AssignItemDto assignItemDto) {
        AssignItemEntity assignItemEntity = new AssignItemEntity();
        assignItemEntity.setDateOfAssign(LocalDate.now());
        assignItemEntity.setDateCreated(LocalDateTime.now());
        assignItemEntity.setDateUpdated(LocalDateTime.now());
        assignItemEntity.setEmployeeTableId(assignItemDto.getEmployeeTableId());
        assignItemEntity.setReceivedByEmployee(assignItemDto.getReceivedByEmployee());
        assignItemEntity.setEmployeeId(assignItemDto.getEmployeeId());
        assignItemEntity.setItemId(assignItemDto.getItemId());
        return assignItemEntity;
    }

    public AssignItemDto assignItemToAssignItemDto(AssignItemEntity assignedItem) {

        AssignItemDto assignItemDto = new AssignItemDto();
        return assignItemDto;
    }
}
