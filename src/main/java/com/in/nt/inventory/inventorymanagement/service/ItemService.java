package com.in.nt.inventory.inventorymanagement.service;

import com.in.nt.inventory.inventorymanagement.dto.ItemDto;

import java.util.List;

/**
 * @author Item Service.
 *
 */
public interface ItemService {

    /**
     * @param unassign : unassign.
     * @return list of items.
     */
    List<ItemDto> getAllItems(Boolean unassign);

    /**
     * @param itemDto : item dto as a request body.
     * @return ItemDto
     */
    ItemDto create(ItemDto itemDto);

    /**
     * @param itemDto : item dto as a request body.
     * @return ItemDto
     */
    ItemDto update(ItemDto itemDto);
}
