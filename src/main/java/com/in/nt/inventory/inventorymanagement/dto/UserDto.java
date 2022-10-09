package com.in.nt.inventory.inventorymanagement.dto;

import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
/**
 * @author User dto class.
 *
 */
public final class UserDto {
    /**
     * id is for userId.
     */
    @NotNull
    private int id;
    /**
     * for user first Name.
     */
    @NotEmpty
    private String firstName;
    /**
     * for user last Name.
     */
    @NotEmpty
    private String lastName;
    /**
     * for user employee ID.
     */
    @NotEmpty
    private String employeeId;
    /**
     * for user Email.
     */
    @NotEmpty(message = "Can Not Be Empty!")
    @Email(message = "address is not valid !!")
    private String email;
    /**
     * for user password.
     */
    @NotEmpty(message = "Password cannot be empty")
    private String password;
    /**
     * for user date of birth.
     */
    @NotEmpty
    private String dateOfBirth;
    /**
     * for user contact number.
     */
    @NotEmpty
    private String contact;
    /**
     * user desigantation.
     */
    @NotEmpty
    private String designation;
    /**
     * user date of joining.
     */
    @NotEmpty
    private String dateOfJoining;
    /**
     * user date of exit.
     */
    @NotEmpty
    private String dateOfExit;
    /**
     * user role as admin or Employee.
     */
    @NotEmpty
    private String role;
    /**
     * user location.
     */
    @NotEmpty
    private String location;
    /**
     * update time.
     */
    @NotEmpty
    private String updatedAt;
    /**
     * created time.
     */
    @NotEmpty
    private String createdAt;
    /**
     * first login
     */
    @NotEmpty
    private Boolean firstLogin;
    /**
     * @return firstLogin
     */
    
    public Boolean getFirstLogin() {
        return firstLogin;
    }

    /**
     * @param firstLogin
     */
    public void setFirstLogin(final Boolean firstLogin) {
        this.firstLogin = firstLogin;
    }

    /**
     * @return id
     */
    public int getId() {
        return this.id;
    }

    /**
     * @param id
     */
    public void setId(final int id) {
        this.id = id;
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
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(final String password) {
        this.password = password;
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
     * @return designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * @param desiganation
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
     * @return dateOfExit
     */
    public String getDateOfExit() {
        return dateOfExit;
    }

    /**
     * @param dateOfExit
     */
    public void setDateOfExit(final String dateOfExit) {
        this.dateOfExit = dateOfExit;
    }

    /**
     * @return role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role
     */
    public void setRole(final String role) {
        this.role = role;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt
     */
    public void setUpdatedAt(final String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     */
    public void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
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
    * Tostring for all the fields.
    */
    @Override
    public String toString() {
        return "UserDto [id=" + id + ", firstName=" + firstName + ","
                + " lastName=" + lastName + ", employeeId="
                + employeeId + ", email=" + email + ", password=" + password 
                + ", dateOfBirth=" + dateOfBirth
                + ", contact=" + contact + ", designation=" + designation + 
                ", dateOfJoining=" + dateOfJoining
                + ", dateOfExit=" + dateOfExit + ", role=" + role 
                + ", location=" + location + ", updatedAt="
                + updatedAt + ", createdAt=" + createdAt + "]";
    }

    /**
     * no agrs constructor of user class.
     */
    public UserDto() {
        super();
    }

    /**
     * hashcode method of user class
     */
    @Override
    public int hashCode() {
        return Objects.hash(contact, createdAt, dateOfBirth, dateOfExit,
                dateOfJoining, designation, email, employeeId,
                firstName, id, lastName, password, updatedAt,location);
    }

    /**
    * equals method of user.
    */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserDto other = (UserDto) obj;
        return Objects.equals(contact, other.contact) 
                && Objects.equals(createdAt, other.createdAt)
                && Objects.equals(dateOfBirth, other.dateOfBirth)
                && Objects.equals(dateOfExit, other.dateOfExit)
                && Objects.equals(dateOfJoining, other.dateOfJoining)
                && Objects.equals(designation, other.designation)
                && Objects.equals(email, other.email) 
                && Objects.equals(employeeId, other.employeeId)
                && Objects.equals(firstName, other.firstName) 
                && id == other.id
                && Objects.equals(lastName, other.lastName) 
                && Objects.equals(password, other.password)
                && Objects.equals(updatedAt, other.updatedAt)
                && Objects.equals(location, other.location);
    }
}
