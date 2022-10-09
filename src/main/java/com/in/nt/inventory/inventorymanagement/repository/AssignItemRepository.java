package com.in.nt.inventory.inventorymanagement.repository;

import com.in.nt.inventory.inventorymanagement.entity.AssignItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AssignItemRepository extends
                     JpaRepository<AssignItemEntity, Long> {
    /**
     * @param employeeId
     * @return Assign Item list
     */
    @Query("SELECT ei FROM AssignItemEntity ei WHERE ei.employeeId = :employeeId")
    List<AssignItemEntity> fetchByEmployeeId(
            @Param("employeeId") String employeeId);

    /**
     * @param itemId
     * @return Assign Item list
     */
    @Query("SELECT ei FROM AssignItemEntity ei WHERE ei.itemId = :itemId")
    Optional<AssignItemEntity> findByItemId(@Param("itemId") Long itemId);

    /**
     * @return assign items list
     */
    @Query("SELECT ei.itemId FROM AssignItemEntity ei")
    List<Long> findAssignItems();
}
