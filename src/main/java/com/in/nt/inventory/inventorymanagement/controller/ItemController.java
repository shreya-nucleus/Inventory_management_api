package com.in.nt.inventory.inventorymanagement.controller;

import com.in.nt.inventory.inventorymanagement.dto.ItemDto;
import com.in.nt.inventory.inventorymanagement.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @author Item controller class.
 *
 */
@RestController
@RequestMapping("/item")
@CrossOrigin("*")
public class ItemController {

    /**
     * item service reference.
     */
    @Autowired
    private ItemService itemService;

    /**
     * @param unassign
     * @return list of all items.
     */
    @GetMapping("/allItems")
    public ResponseEntity<List<ItemDto>> getAllItems(@RequestParam("unassign") Boolean unassign) {
        return ResponseEntity.ok(itemService.getAllItems(unassign));
    }

    /**
     * @param itemDto : item dto object.
     * @return message as a response.
     */
    @PostMapping("/addItem")
    public ResponseEntity<ItemDto> create(@RequestBody ItemDto itemDto) {
        return ResponseEntity.ok(itemService.create(itemDto));
    }

    /**
     * @param itemDto
     * @return message
     */
    @PutMapping("/updateItem")
    public ResponseEntity<ItemDto> update(@RequestBody ItemDto itemDto) {
        return ResponseEntity.ok(itemService.update(itemDto));
    }
}
