package com.in.nt.inventory.inventorymanagement.service;

import com.in.nt.inventory.inventorymanagement.dto.AssignItemDto;
import com.in.nt.inventory.inventorymanagement.dto.AssignItemEmployeDto;

import java.util.List;

/**
 * @author Assign Item Service.
 *
 */
public interface AssignItemService {
    /**
     * @param employeeId : employeeId
     * @return
     */
    AssignItemEmployeDto fetchItemsByEmployeeId(String employeeId);

    /**
     * @param assignItemDtoList : Assign item dto list.
     */
    void assignItemToEmployee(List<AssignItemDto> assignItemDtoList);

    /**
     * @param employeeItemId : employeeItemId
     */
    void unassignItem(Long employeeItemId);

    /**
     * @return All Assigned Items List.
     */
    List<AssignItemDto> allAssignedItemsList();
}
