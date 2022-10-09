package com.in.nt.inventory.inventorymanagement.entity;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Item entity class.
 *
 */
@Entity
@Table(name = "item")
public final class ItemEntity {
    /**
     * stores id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * stores itemName.
     */
    private String itemName;

    /**
     * stores itemNumber.
     */
    private int itemNumber;

    /**
     * stores itemType.
     */
    private String itemType;
    
    /**
     * stores billNo.
     */
    private String billNo;

    /**
     * stores dateOfPurchase.
     */
    private LocalDate dateOfPurchase;

    /**
     * stores warrantyPeriod.
     */
    private String warrantyPeriod;

    /**
     * stores itemLocation.
     */
    private String itemLocation;

    /**
     * stores itemCondition.
     */
    private String itemCondition;

    /**
     * stores itemStatus.
     */
    private String itemStatus;

    /**
     * stores incidents.
     */
    private String incidents;

    /**
     * no args constructor of item entity class.
     */
    public ItemEntity() {
        super();
    }

    /**
     * @return id.
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id : id.
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * @return itemName.
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName : Item Name.
     */
    public void setItemName(final String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return itemNumber.
     */
    public int getItemNumber() {
        return itemNumber;
    }

    /**
     * @param itemNumber : Item Number.
     */
    public void setItemNumber(final int itemNumber) {
        this.itemNumber = itemNumber;
    }

    /**
     * @return itemType.
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * @param itemType : Item Type.
     */
    public void setItemType(final String itemType) {
        this.itemType = itemType;
    }

    /**
     * @return billNo.
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * @param billNo : Bill Number.
     */
    public void setBillNo(final String billNo) {
        this.billNo = billNo;
    }

    /**
     * @return dateOfPurchase.
     */
    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    /**
     * @param dateOfPurchase : Date Of Purchase.
     */
    public void setDateOfPurchase(final LocalDate dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    /**
     * @return warrantyPeriod.
     */
    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    /**
     * @param warrantyPeriod : Warranty Period.
     */
    public void setWarrantyPeriod(final String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    /**
     * @return itemLocation.
     */
    public String getItemLocation() {
        return itemLocation;
    }

    /**
     * @param itemLocation : Item's Location.
     */
    public void setItemLocation(final String itemLocation) {
        this.itemLocation = itemLocation;
    }

    /**
     * @return itemCondition.
     */
    public String getItemCondition() {
        return itemCondition;
    }

    /**
     * @param itemCondition : Item condition.
     */
    public void setItemCondition(final String itemCondition) {
        this.itemCondition = itemCondition;
    }

    /**
     * @return itemStatus.
     */
    public String getItemStatus() {
        return itemStatus;
    }

    /**
     * @param itemStatus : Item status.
     */
    public void setItemStatus(final String itemStatus) {
        this.itemStatus = itemStatus;
    }

    /**
     * @return incidents.
     */
    public String getIncidents() {
        return incidents;
    }

    /**
     * @param incidents : Incidents happened.
     */
    public void setIncidents(final String incidents) {
        this.incidents = incidents;
    }

    /**
     * hash code method for item entity class.
     */
    @Override
    public int hashCode() {
        return Objects.hash(billNo, dateOfPurchase, id, incidents,
                itemCondition, itemLocation, itemName, itemNumber,
                itemStatus, itemType, warrantyPeriod);
    }

    /**
     * equals method for item entity class.
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ItemEntity other = (ItemEntity) obj;
        return Objects.equals(billNo, other.billNo) 
                && Objects.equals(dateOfPurchase, other.dateOfPurchase)
                && Objects.equals(id, other.id)
                && Objects.equals(incidents, other.incidents)
                && Objects.equals(itemCondition, other.itemCondition)
                && Objects.equals(itemLocation, other.itemLocation)
                && Objects.equals(itemName, other.itemName)
                && itemNumber == other.itemNumber
                && Objects.equals(itemStatus, other.itemStatus)
                && Objects.equals(itemType, other.itemType)
                && Objects.equals(warrantyPeriod, other.warrantyPeriod);
    }

    /**
     * toString method for item entity class.
     */
    @Override
    public String toString() {
        return "ItemEntity [id=" + id + ", itemName=" + itemName
                + ", itemNumber=" + itemNumber + ", itemType="
                + itemType + ", billNo=" + billNo + ", dateOfPurchase="
                + dateOfPurchase + ", warrantyPeriod="
                + warrantyPeriod + ", itemLocation=" + itemLocation
                + ", itemCondition=" + itemCondition
                + ", itemStatus=" + itemStatus + ", incidents=" + incidents + "]";
    }
}
