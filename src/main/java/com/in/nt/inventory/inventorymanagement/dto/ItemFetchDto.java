package com.in.nt.inventory.inventorymanagement.dto;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Item fetch dto class.
 *
 */
public class ItemFetchDto {

    /**
     * stores itemName
     */
    private String itemName;
    /**
     * stores itemNumber
     */
    private int itemNumber;
    /**
     * stores assignItemId
     */
    private Long assignItemId;
    /**
     * stores dateOfAssign
     */
    private LocalDate dateOfAssign;
    /**
     * stores itemCondition
     */
    private String itemCondition;
    /**
     * stores incidents
     */
    private String incidents;
    
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
     * @return assignItemId
     */
    public Long getAssignItemId() {
        return assignItemId;
    }
    /**
     * @param assignItemId
     */
    public void setAssignItemId(final Long assignItemId) {
        this.assignItemId = assignItemId;
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
     * hash code method for Item fetch dto.
     */
    @Override
    public int hashCode() {
        return Objects.hash(assignItemId, dateOfAssign, incidents,
                itemCondition, itemName, itemNumber);
    }
    /**
     * equals method for Item fetch dto.
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ItemFetchDto other = (ItemFetchDto) obj;
        return Objects.equals(assignItemId, other.assignItemId)
                && Objects.equals(dateOfAssign, other.dateOfAssign)
                && Objects.equals(incidents, other.incidents)
                && Objects.equals(itemCondition, other.itemCondition)
                && Objects.equals(itemName, other.itemName)
                && itemNumber == other.itemNumber;
    }
    /**
     * toString method for Item fetch dto.
     */
    @Override
    public String toString() {
        return "ItemFetchDto [itemName=" + itemName + ", itemNumber="
                + itemNumber + ", assignItemId=" + assignItemId
                + ", dateOfAssign=" + dateOfAssign + ", itemCondition="
                + itemCondition + ", incidents=" + incidents + "]";
    }
}
