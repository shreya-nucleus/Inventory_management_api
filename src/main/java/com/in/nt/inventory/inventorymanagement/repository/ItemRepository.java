package com.in.nt.inventory.inventorymanagement.repository;

import com.in.nt.inventory.inventorymanagement.entity.ItemEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Long> {

    /**
     * @return list of items.
     */
    @Query("select ie from ItemEntity ie order by ie.id asc")
    List<ItemEntity> findAllItem();

    /**
     * @param assignItemIds
     * @return list of unassigned items.
     */
    @Query("SELECT i FROM ItemEntity i WHERE i.id NOT IN :assignItemIds ORDER BY i.id ASC")
    List<ItemEntity> findUnassignedItems(@Param("assignItemIds") List<Long> assignItemIds);
}
