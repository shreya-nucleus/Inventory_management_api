package com.in.nt.inventory.inventorymanagement.dto;

import java.util.Objects;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author User Fetch Dto class
 *
 */
public final class UserFetchDto {

    /**
     * stores employeeId
     */
    @NotNull
    @NotEmpty
    private String employeeId;
    /**
     * stores firstName
     */
    @NotEmpty
    private String firstName;
    /**
     * stores lastName
     */
    @NotEmpty
    private String lastName;
    /**
     * stores email
     */
    @NotEmpty
    private String email;
    /**
     * stores contact
     */
    @NotEmpty
    private String contact;
    /**
     * stores dateOfBirth
     */
    @NotEmpty
    private String dateOfBirth;
    /**
     * stores designation
     */
    @NotEmpty
    private String designation;
    /**
     * stores dateOfJoining
     */
    @NotEmpty
    private String dateOfJoining;
    /**
     * stores location
     */
    @NotEmpty
    private String location;

    /**
     * no agrs constructor of user fetch dto class.
     */
    public UserFetchDto() {
        super();
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
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
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
     * @return dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth
     */
    public void setDateOfBirth(final String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * @param designation
     */
    public void setDesignation(final String designation) {
        this.designation = designation;
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
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location
     */
    public void setLocation(final String location) {
        this.location = location;
    }

    /**
     * hashcode method of user fetch dto class.
     */
    @Override
    public int hashCode() {
        return Objects.hash(contact, dateOfBirth, dateOfJoining, designation,
                email, employeeId, firstName, lastName, location);
    }

    /**
     * equals method of user fetch dto class.
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserFetchDto other = (UserFetchDto) obj;
        return Objects.equals(contact, other.contact) 
                && Objects.equals(dateOfBirth, other.dateOfBirth)
                && Objects.equals(dateOfJoining, other.dateOfJoining) 
                && Objects.equals(designation, other.designation)
                && Objects.equals(email, other.email) 
                && Objects.equals(employeeId, other.employeeId)
                && Objects.equals(firstName, other.firstName) 
                && Objects.equals(lastName, other.lastName)
                && Objects.equals(location, other.location);
    }

    /**
     * toString method of user fetch class.
     */
    @Override
    public String toString() {
        return "UserFetchDto [employeeId=" + employeeId + ", firstName=" + firstName 
                + ", lastName=" + lastName + ", email=" + email + ", contact=" 
                + contact + ", dateOfBirth=" + dateOfBirth + ", designation="
                + designation + ", dateOfJoining=" + dateOfJoining 
                + ", location=" + location + "]";
    }
}
