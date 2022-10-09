package com.in.nt.inventory.inventorymanagement.service.impl;

import com.in.nt.inventory.inventorymanagement.dto.ItemDto;
import com.in.nt.inventory.inventorymanagement.entity.ItemEntity;
import com.in.nt.inventory.inventorymanagement.exception.ValidationException;
import com.in.nt.inventory.inventorymanagement.mapper.ItemMapper;
import com.in.nt.inventory.inventorymanagement.repository.AssignItemRepository;
import com.in.nt.inventory.inventorymanagement.repository.ItemRepository;
import com.in.nt.inventory.inventorymanagement.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Item service implementation class which implements item service class.
 *
 */
@Service
public class ItemServiceImpl implements ItemService {
    /**
     * reference object of item repository.
     */
    @Autowired
    private ItemRepository itemRepository;
    /**
     * reference object of assign item repository.
     */
    @Autowired
    private AssignItemRepository assignItemRepository;
    /**
     * reference object of item Mapper.
     */
    @Autowired
    private ItemMapper itemMapper;
    /**
     * list of items.
     */
    @Override
    public final List<ItemDto> getAllItems(final Boolean unassign) {
        List<ItemEntity> itemList = new ArrayList<ItemEntity>();
        List<Long> assignedItemIds = assignItemRepository.findAssignItems();
        if (unassign) {
            itemList = itemRepository.findUnassignedItems(assignedItemIds);
        }
        if (itemList.isEmpty()) {
            itemList = itemRepository.findAllItem();
        }

        List<ItemDto> itemDtoList = new ArrayList<>();
        for (ItemEntity itemEntity : itemList) {
            ItemDto itemDto = itemMapper.itemToItemDto(itemEntity);
            if (assignedItemIds.contains(itemDto.getId())) {
                itemDto.setItemStatus("Assigned");
            } else {
                itemDto.setItemStatus("Unassigned");
            }
            itemDtoList.add(itemDto);
        }
        return itemDtoList;
    }

    /**
     * add item method calling.
     */
    @Override
    public final ItemDto create(final ItemDto itemDto) {
        ItemEntity itemEntity = itemMapper.itemDtoToItem(itemDto);

        Random random = new Random();
        int num = random.nextInt(90) + 10;
        itemEntity.setBillNo("SL" + String.valueOf(num));
        itemEntity.setIncidents("None");
        itemEntity.setItemCondition("Working");
        itemEntity.setItemStatus("unassign");
        itemEntity = itemRepository.save(itemEntity);
        return itemMapper.itemToItemDto(itemEntity);
    }

    /**
     * method to update item.
     */
    @Override
    public final ItemDto update(final ItemDto itemDto) {
        ItemEntity itemEntity = itemRepository.findById(itemDto.getId())
                .orElseThrow(() -> new ValidationException("Item not found"));

        itemEntity = itemMapper.itemDtoToItem(itemDto);
        itemEntity.setId(itemDto.getId());
        itemRepository.save(itemEntity);
        return itemDto;
    }
}
