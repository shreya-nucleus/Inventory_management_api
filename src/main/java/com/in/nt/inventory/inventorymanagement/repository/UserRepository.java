package com.in.nt.inventory.inventorymanagement.repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.in.nt.inventory.inventorymanagement.entity.UserEntity;

/**
 * @author 
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    /**
     * @param email : it will pass email.
     * @return : it will return email is present or not.
     */
    @Query("SELECT u FROM UserEntity u WHERE u.email = :email and u.password=:password")
    UserEntity getUserByEmailAndPassword(@Param("email") String email, @Param("password") String password);
    
    /**
     * @param email
     * @return
     */
    @Query("SELECT u FROM UserEntity u WHERE u.email = :email")
    Optional<UserEntity> findByEmail(@Param("email") String email);

    /**
     * @param employeeId
     * @return
     */
    Optional<UserEntity> findByEmployeeId(String employeeId);

    /**
     * @param ids
     * @return
     */
    @Query("SELECT u FROM UserEntity u WHERE u.id IN :ids")
    List<UserEntity> findByEmployeeIds(@Param("ids") Set<Integer> ids);
}
