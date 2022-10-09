package com.in.nt.inventory.inventorymanagement.dto;

import com.in.nt.inventory.inventorymanagement.entity.AssignItemEntity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * A DTO for the {@link AssignItemEntity} entity
 */

public class AssignItemDto implements Serializable {
    /**
     * stores id(primary key).
     */
    @NotNull
    @NotEmpty
    private Long id;
    /**
     * stores employeeId
     */
    @NotNull
    @NotEmpty
    private String employeeId;
    /**
     * stores employeeTableId
     */
    @NotNull
    @NotEmpty
    private Integer employeeTableId;
    /**
     * stores itemId
     */
    @NotNull
    @NotEmpty
    private Long itemId;
    /**
     * stores dateOfAssign
     */
    @NotNull
    @NotEmpty
    private LocalDate dateOfAssign;
    /**
     * stores receivedByEmployee
     */
    @NotNull
    @NotEmpty
    private String receivedByEmployee;
    /**
     * stores dateCreated
     */
    private LocalDateTime dateCreated;
    /**
     * stores dateUpdated
     */
    private LocalDateTime dateUpdated;
    /**
     * stores email
     */
    @NotNull
    @NotEmpty
    private String email;
    /**
     * stores itemNumber
     */
    @NotNull
    @NotEmpty
    private Integer itemNumber;
    /**
     * stores employeeName
     */
    @NotNull
    @NotEmpty
    private String employeeName;
    /**
     * stores contact
     */
    @NotNull
    @NotEmpty
    private String contact;
    /**
     * stores itemName
     */
    @NotNull
    @NotEmpty
    private String itemName;
    /**
     * stores itemCondition
     */
    @NotNull
    @NotEmpty
    private String itemCondition;
    /**
     * stores incidents
     */
    @NotNull
    @NotEmpty
    private String incidents;
    /**
     * stores dateOfJoining
     */
    @NotNull
    @NotEmpty
    private String dateOfJoining;

    /**
     * 
     */
    private ItemDto itemDto;

    /**
     * @return itemDto
     */
    public ItemDto getItemDto() {
        return itemDto;
    }

    /**
     * @param itemDto
     */
    public void setItemDto(final ItemDto itemDto) {
        this.itemDto = itemDto;
    }

    /**
     * @return incidents
     */
    public String getIncidents() {
        return incidents;
    }

    /**
     * @param incidents
     */
    public void setIncidents(final String incidents) {
        this.incidents = incidents;
    }

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * @return employeeId
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId
     */
    public void setEmployeeId(final String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return employeeTableId
     */
    public Integer getEmployeeTableId() {
        return employeeTableId;
    }

    /**
     * @param employeeTableId
     */
    public void setEmployeeTableId(final Integer employeeTableId) {
        this.employeeTableId = employeeTableId;
    }

    /**
     * @return itemId
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * @param itemId
     */
    public void setItemId(final Long itemId) {
        this.itemId = itemId;
    }

    /**
     * @return dateOfAssign
     */
    public LocalDate getDateOfAssigned() {
        return dateOfAssign;
    }

    /**
     * @param dateOfAssign
     */
    public void setDateAssigned(final LocalDate dateOfAssign) {
        this.dateOfAssign = dateOfAssign;
    }

    /**
     * @return receivedByEmployee
     */
    public String getReceivedByEmployee() {
        return receivedByEmployee;
    }

    /**
     * @param receivedByEmployee
     */
    public void setReceivedByEmployee(final String receivedByEmployee) {
        this.receivedByEmployee = receivedByEmployee;
    }

    /**
     * @return dateCreated
     */
    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    /**
     * @param dateCreated
     */
    public void setDateCreated(final LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * @return dateUpdated
     */
    public LocalDateTime getDateUpdated() {
        return dateUpdated;
    }

    /**
     * @param dateUpdated
     */
    public void setDateUpdated(final LocalDateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * @return itemNumber
     */
    public Integer getItemNumber() {
        return itemNumber;
    }

    /**
     * @param itemNumber
     */
    public void setItemNumber(final Integer itemNumber) {
        this.itemNumber = itemNumber;
    }

    /**
     * @return employeeName
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * @param employeeName
     */
    public void setEmployeeName(final String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * @return contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact
     */
    public void setContact(final String contact) {
        this.contact = contact;
    }

    /**
     * @return itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName
     */
    public void setItemName(final String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return itemCondition
     */
    public String getItemCondition() {
        return itemCondition;
    }

    /**
     * @param itemCondition
     */
    public void setItemCondition(final String itemCondition) {
        this.itemCondition = itemCondition;
    }

    /**
     * @return dateOfAssign
     */
    public LocalDate getDateOfAssign() {
        return dateOfAssign;
    }

    /**
     * @param dateOfAssign
     */
    public void setDateOfAssign(final LocalDate dateOfAssign) {
        this.dateOfAssign = dateOfAssign;
    }

    /**
     * @return dateOfJoining
     */
    public String getDateOfJoining() {
        return dateOfJoining;
    }

    /**
     * @param dateOfJoining
     */
    public void setDateOfJoining(final String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    /**
     * to string method for assign item.
     */
    @Override
    public String toString() {
        return "AssignItemDto [id=" + id + ", employeeId=" + employeeId 
                + ", employeeTableId=" + employeeTableId + ", itemId="
                + itemId + ", dateOfAssign=" + dateOfAssign
                + ", receivedByEmployee=" + receivedByEmployee
                + ", email=" + email + ", itemNumber="
                + itemNumber + ", employeeName=" + employeeName + ", contact="
                + contact + ", itemName=" + itemName + ", itemCondition="
                + itemCondition + ", incidents=" + incidents
                + ", dateOfJoining=" + dateOfJoining
                + ", itemDto=" + itemDto + "]";
    }
    /**
     * hash code method for assign item.
     */
    @Override
    public int hashCode() {
        return Objects.hash(contact, dateCreated, dateOfAssign,
                dateOfJoining, dateUpdated, email, employeeId,
                employeeName, employeeTableId, id, incidents,
                itemCondition, itemDto, itemId, itemName, itemNumber,
                receivedByEmployee);
    }

    /**
     * equals method for assign item.
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AssignItemDto other = (AssignItemDto) obj;
        return Objects.equals(contact, other.contact)
                && Objects.equals(dateCreated, other.dateCreated)
                && Objects.equals(dateOfAssign, other.dateOfAssign)
                && Objects.equals(dateOfJoining, other.dateOfJoining)
                && Objects.equals(dateUpdated, other.dateUpdated)
                && Objects.equals(email, other.email)
                && Objects.equals(employeeId, other.employeeId)
                && Objects.equals(employeeName, other.employeeName)
                && Objects.equals(employeeTableId, other.employeeTableId)
                && Objects.equals(id, other.id)
                && Objects.equals(incidents, other.incidents)
                && Objects.equals(itemCondition, other.itemCondition)
                && Objects.equals(itemDto, other.itemDto)
                && Objects.equals(itemId, other.itemId)
                && Objects.equals(itemName, other.itemName)
                && itemNumber == other.itemNumber
                && Objects.equals(receivedByEmployee, other.receivedByEmployee);
    }
}
