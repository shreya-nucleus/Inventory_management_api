package com.in.nt.inventory.inventorymanagement.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.nt.inventory.inventorymanagement.dto.AssignItemDto;
import com.in.nt.inventory.inventorymanagement.dto.AssignItemEmployeDto;
import com.in.nt.inventory.inventorymanagement.dto.ItemFetchDto;
import com.in.nt.inventory.inventorymanagement.dto.UserFetchDto;
import com.in.nt.inventory.inventorymanagement.entity.AssignItemEntity;
import com.in.nt.inventory.inventorymanagement.entity.ItemEntity;
import com.in.nt.inventory.inventorymanagement.entity.UserEntity;
import com.in.nt.inventory.inventorymanagement.exception.ValidationException;
import com.in.nt.inventory.inventorymanagement.mapper.AssignItemMapper;
import com.in.nt.inventory.inventorymanagement.repository.AssignItemRepository;
import com.in.nt.inventory.inventorymanagement.repository.ItemRepository;
import com.in.nt.inventory.inventorymanagement.repository.UserRepository;
import com.in.nt.inventory.inventorymanagement.service.AssignItemService;

/**
 * @author Assign item service implementation class.
 *
 */
@Service
public class AssignItemServiceImpl implements AssignItemService {

    /**
     * Reference object of Assign Item Repository.
     */
    @Autowired
    private AssignItemRepository assignItemRepository;

    /**
     * Reference object of Assign Item Mapper.
     */
    @Autowired
    private AssignItemMapper assignItemMapper;

    /**
     * Reference object of User Repository
     */
    @Autowired
    private UserRepository userRepository;

    /**
     * Reference object of Item Repository
     */
    @Autowired
    private ItemRepository itemRepository;

    /**
     * For searching assigned items list by employeeId.
     */
    @Override
    public AssignItemEmployeDto fetchItemsByEmployeeId(String employeeId) {
        AssignItemEmployeDto assignItemDto = new AssignItemEmployeDto();
        List<ItemFetchDto> itemFetchDtos = new ArrayList<>();
        UserEntity userData = userRepository.findByEmployeeId(employeeId).orElseThrow(() -> new ValidationException("User not found."));
        UserFetchDto userFetchDto = new UserFetchDto();
        userFetchDto.setEmail(userData.getEmail());
        userFetchDto.setEmployeeId(employeeId);
        userFetchDto.setContact(userData.getContact());
        userFetchDto.setDesignation(userData.getDesignation());
        userFetchDto.setFirstName(userData.getFirstName());
        userFetchDto.setLastName(userData.getLastName());
        userFetchDto.setDateOfBirth(userData.getDateOfBirth());
        userFetchDto.setDateOfJoining(userData.getDateOfJoining());
        userFetchDto.setLocation(userData.getLocation());

        List<AssignItemEntity> assignItemList = assignItemRepository.fetchByEmployeeId(employeeId);
        for(AssignItemEntity assignedItem: assignItemList) {
            ItemFetchDto itemFetchDto = new ItemFetchDto();
            Optional<ItemEntity> item = itemRepository.findById(assignedItem.getItemId());
            System.out.println("item data"+item);
            ItemEntity itemData = item.get();
            itemFetchDto.setItemName(itemData.getItemName());
            itemFetchDto.setItemNumber(itemData.getItemNumber());
            itemFetchDto.setDateOfAssign(assignedItem.getDateOfAssign());
            itemFetchDto.setItemCondition(itemData.getItemCondition());
            itemFetchDto.setIncidents(itemData.getIncidents());
            itemFetchDto.setAssignItemId(assignedItem.getId());
            
            itemFetchDtos.add(itemFetchDto);
        } 
        assignItemDto.setUserFetchDto(userFetchDto);
        assignItemDto.setItemFetchDtos(itemFetchDtos);
        return assignItemDto;
    }

    /**
     * For assigning items to an employee.
     */
    @Override
    public void assignItemToEmployee(List<AssignItemDto> assignItemDtoList) {
        UserEntity userAssign = userRepository.findByEmployeeId(assignItemDtoList.get(0).getEmployeeId()).orElseThrow(RuntimeException::new);
        for(AssignItemDto assignItemDto : assignItemDtoList) {
            AssignItemEntity employeeItem = assignItemMapper.assignItemDtoToEmployeeItem(assignItemDto);
            assignItemRepository.findByItemId(assignItemDto.getItemId()).ifPresent(ei->{
                throw new ValidationException("Item already assigned.");
            });
            employeeItem.setEmployeeTableId(userAssign.getId());
            assignItemRepository.save(employeeItem);
        }
    }
    /**
     * For unassigning items to the employee.
     */
    @Override
    public void unassignItem(Long assignItemId) {
        AssignItemEntity assignItem = assignItemRepository.findById(assignItemId).orElseThrow(() -> new ValidationException("Invalid id."));
        assignItemRepository.delete(assignItem);
    }
    
    /**
     * For giving all the assigned items list of all the employees.
     */
    @Override
    public List<AssignItemDto> allAssignedItemsList() {
        List<AssignItemDto> assignItemDtoList = new ArrayList<>();
        List<AssignItemEntity> assignItemList = assignItemRepository.findAll();
        System.out.println("find all"+assignItemList.toString());
        for(AssignItemEntity assignedItem: assignItemList) {
            Optional<UserEntity> user = userRepository.findById(assignedItem.getEmployeeTableId());
            UserEntity userData = user.get();
            AssignItemDto assignItemDto = new AssignItemDto();
            Optional<ItemEntity> item = itemRepository.findById(assignedItem.getItemId());
            ItemEntity itemData = item.get();
            assignItemDto.setContact(userData.getContact());
            assignItemDto.setDateOfAssign(assignedItem.getDateOfAssign());
            assignItemDto.setItemName(itemData.getItemName());
            assignItemDto.setItemNumber(itemData.getItemNumber());
            assignItemDto.setItemId(assignedItem.getId());
            assignItemDto.setEmployeeName(userData.getFirstName()+" "+userData.getLastName());
            assignItemDto.setEmployeeId(userData.getEmployeeId());
            assignItemDto.setEmail(userData.getEmail());
            assignItemDto.setIncidents(itemData.getIncidents());
            assignItemDto.setItemCondition(itemData.getItemCondition());
            
            assignItemDtoList.add(assignItemDto);
        }
        return assignItemDtoList;
    }
}
