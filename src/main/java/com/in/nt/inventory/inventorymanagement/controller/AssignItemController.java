package com.in.nt.inventory.inventorymanagement.controller;

import com.in.nt.inventory.inventorymanagement.dto.AssignItemDto;
import com.in.nt.inventory.inventorymanagement.dto.AssignItemEmployeDto;
import com.in.nt.inventory.inventorymanagement.service.AssignItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Assign Item Controller class.
 *
 */
@RestController
@RequestMapping("/employeeItem")
@CrossOrigin("*")
public class AssignItemController {

    /**
     * AssignItemService reference object.
     */
    @Autowired
    private AssignItemService assignItemService;

    /**
     * @param employeeId
     * @return assigned items for a particular employee.
     */
    @GetMapping("/fetchByEmployee/{employeeId}")
    public ResponseEntity<AssignItemEmployeDto> fetchAllItemsByEmployeeId(@PathVariable("employeeId")@NotNull String employeeId) {
        return ResponseEntity.ok(assignItemService.fetchItemsByEmployeeId(employeeId));
    }

    /**
     * @param assignItemDtoList
     * @return items assigned.
     */
    @PostMapping("/assignItem")
    public ResponseEntity<String> assignItemToEmployee(@RequestBody List<AssignItemDto> assignItemDtoList) {
        assignItemService.assignItemToEmployee(assignItemDtoList);
        return ResponseEntity.ok("Item assigned");
    }

    /**
     * @param assignItemId
     * @return item unassigned.
     */
    @DeleteMapping("/unassignItem/{assignItemId}")
    public ResponseEntity<String> unassignItem(@PathVariable("assignItemId") @NotNull Long assignItemId) {
        assignItemService.unassignItem(assignItemId);
        return ResponseEntity.ok("Item unassigned.");
    }

    /**
     * @return all assigned items to all the employees list.
     */
    @GetMapping("/fetchItemAssignedDetails")
    public ResponseEntity<List<AssignItemDto>> allAssignedItemsList() {
        return ResponseEntity.ok(assignItemService.allAssignedItemsList());
    } 
}
