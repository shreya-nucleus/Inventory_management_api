package com.in.nt.inventory.inventorymanagement.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Assign Item Entity class.
 *
 */
@Entity
@Table(name = "employee_items")
public final class AssignItemEntity {

    /**
     * stores id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * stores employeeId.
     */
    @Column(name = "employee_id", unique = true)
    private String employeeId;

    /**
     * stores employeeTableId.
     */
    @Column(name = "employee_table_id")
    private Integer employeeTableId;

    /**
     * stores itemId.
     */
    @Column(name = "item_id", unique = true)
    private Long itemId;

    /**
     * stores dateOfAssign.
     */
    @Column(name = "date_assigned")
    private LocalDate dateOfAssign;

    /**
     * stores received By Employee.
     */
    @Column(name = "received_by_employee")
    private String receivedByEmployee;

    /**
     * stores dateCreated.
     */
    @Column(name = "date_created")
    private LocalDateTime dateCreated;

    /**
     * stores dateUpdated.
     */
    @Column(name = "date_updated")
    private LocalDateTime dateUpdated;

    /**
     * stores incidents.
     */
    @Column(name = "incidents")
    private String incidents;

    /**
     * @return incidents
     */
    public String getIncidents() {
        return incidents;
    }

    /**
     * @param incidents : Incidents.
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
     * @param id : id (primary key).
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
     * @param employeeId : Employee id.
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
     * @param employeeTableId : Id of employee in employee table.
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
     * @param itemId : Item's id.
     */
    public void setItemId(final Long itemId) {
        this.itemId = itemId;
    }

    /**
     * @return dateOfAssign
     */
    public LocalDate getDateOfAssign() {
        return dateOfAssign;
    }

    /**
     * @param dateOfAssign : Date of assign.
     */
    public void setDateOfAssign(final LocalDate dateOfAssign) {
        this.dateOfAssign = dateOfAssign;
    }
    
    /**
     * @return receivedByEmployee
     */
    public String getReceivedByEmployee() {
        return receivedByEmployee;
    }

    /**
     * @param receivedByEmployee : Received by employee at.
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
     * @param dateCreated : Date of creation.
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
     * @param dateUpdated : Updated date.
     */
    public void setDateUpdated(final LocalDateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * hash code method for Assign Item Entity class.
     */
    @Override
    public int hashCode() {
        return Objects.hash(dateCreated, dateOfAssign, dateUpdated, employeeId,
                employeeTableId, id, incidents, itemId,
                receivedByEmployee);
    }

    /**
     * equals method for Assign Item Entity class.
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
        AssignItemEntity other = (AssignItemEntity) obj;
        return Objects.equals(dateCreated, other.dateCreated)
                && Objects.equals(dateOfAssign, other.dateOfAssign)
                && Objects.equals(dateUpdated, other.dateUpdated)
                && Objects.equals(employeeId, other.employeeId)
                && Objects.equals(employeeTableId, other.employeeTableId)
                && Objects.equals(id, other.id)
                && Objects.equals(incidents, other.incidents)
                && Objects.equals(itemId, other.itemId)
                && Objects.equals(receivedByEmployee, other.receivedByEmployee);
    }
    /**
     * toString method for Assign Item Entity class.
     */
    @Override
    public String toString() {
        return "AssignItemEntity [id=" + id + ", employeeId=" + employeeId
               + ", employeeTableId=" + employeeTableId
               + ", itemId=" + itemId + ", dateOfAssign=" + dateOfAssign
               + ", receivedByEmployee=" + receivedByEmployee
               + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated
               + ", incidents=" + incidents + "]";
    }
}
