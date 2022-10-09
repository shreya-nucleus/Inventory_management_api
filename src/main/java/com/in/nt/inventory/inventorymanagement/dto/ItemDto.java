package com.in.nt.inventory.inventorymanagement.dto;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A DTO for the Item Entity.
 */

public class ItemDto {
    /**
     * stores id
     */
    private Long id;

    /**
     * stores itemName
     */
    @NotNull(message = "Product name cannot be empty")
    private String itemName;

    /**
     * stores itemNumber
     */
    @NotNull
    private int itemNumber;
    
    /**
     * stores itemType
     */
    @NotNull
    private String itemType;
    
    /**
     * stores billNo
     */
    @NotNull
    private String billNo;

    /**
     * stores dateOfPurchase
     */
    @NotNull
    private LocalDate dateOfPurchase;

    /**
     * stores warrantyPeriod
     */
    @NotNull
    private String warrantyPeriod;

    /**
     * stores itemLocation
     */
    @NotNull
    private String itemLocation;

    /**
     * stores itemCondition
     */
    @NotNull
    private String itemCondition;

    /**
     * stores itemStatus
     */
    @NotNull
    private String itemStatus;
    
    /**
     * stores incidents
     */
    @NotNull
    private String incidents;

    /**
     * assignTo stores UserDto objects.
     */
    private UserDto assignTo;

    /**
     * @return
     */
    public UserDto getAssignTo() {
        return assignTo;
    }

    /**
     * @param assignTo
     */
    public void setAssignTo(final UserDto assignTo) {
        this.assignTo = assignTo;
    }

    /**
     * no agrs constructor of item dto class.
     */
    public ItemDto() {
        super();
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
     * @return itemNumber
     */
    public int getItemNumber() {
        return itemNumber;
    }

    /**
     * @param itemNumber
     */
    public void setItemNumber(final int itemNumber) {
        this.itemNumber = itemNumber;
    }

    /**
     * @return itemType
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * @param itemType
     */
    public void setItemType(final String itemType) {
        this.itemType = itemType;
    }

    /**
     * @return billNo
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * @param billNo
     */
    public void setBillNo(final String billNo) {
        this.billNo = billNo;
    }

    /**
     * @return dateOfPurchase
     */
    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    /**
     * @param dateOfPurchase
     */
    public void setDateOfPurchase(final LocalDate dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    /**
     * @return warrantyPeriod
     */
    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    /**
     * @param warrantyPeriod
     */
    public void setWarrantyPeriod(final String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    /**
     * @return itemLocation
     */
    public String getItemLocation() {
        return itemLocation;
    }

    /**
     * @param itemLocation
     */
    public void setItemLocation(final String itemLocation) {
        this.itemLocation = itemLocation;
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
     * @return itemStatus
     */
    public String getItemStatus() {
        return itemStatus;
    }

    /**
     * @param itemStatus
     */
    public void setItemStatus(final String itemStatus) {
        this.itemStatus = itemStatus;
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
     * hash code method for item dto.
     */
    @Override
    public int hashCode() {
        return Objects.hash(itemName, billNo, dateOfPurchase, id,
                incidents, itemCondition, itemLocation, itemNumber,
                itemStatus, itemType, warrantyPeriod);
    }

    /**
     * equals method for item dto.
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ItemDto other = (ItemDto) obj;
        return Objects.equals(itemName, other.itemName)
                && Objects.equals(billNo, other.billNo)
                && Objects.equals(dateOfPurchase, other.dateOfPurchase)
                && Objects.equals(id, other.id)
                && Objects.equals(incidents, other.incidents)
                && Objects.equals(itemCondition, other.itemCondition)
                && Objects.equals(itemLocation, other.itemLocation)
                && itemNumber == other.itemNumber
                && Objects.equals(itemStatus, other.itemStatus)
                && Objects.equals(itemType, other.itemType)
                && Objects.equals(warrantyPeriod, other.warrantyPeriod);
    }

    /**
     * toString method for item dto.
     */
    @Override
    public String toString() {
        return "ItemDto [id=" + id + ", assetName=" + itemName
                + ", itemNumber=" + itemNumber + ", itemType="
                + itemType + ", billNo=" + billNo + ", dateOfPurchase="
                + dateOfPurchase + ", warrantyPeriod="
                + warrantyPeriod + ", itemLocation=" + itemLocation
                + ", itemCondition=" + itemCondition
                + ", itemStatus=" + itemStatus + ", incidents=" + incidents + "]";
    }
}
