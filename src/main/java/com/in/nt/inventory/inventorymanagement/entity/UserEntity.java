package com.in.nt.inventory.inventorymanagement.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author User entity class.
 *
 */
@Entity
@Table(name = "users")
public final class UserEntity {
    /**
     * id is for userId.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    /**
     * for user first Name.
     */
    @Column(name = "firstName")
    private String firstName;
    /**
     * for user last Name.
     */
    @Column(name = "lastName")
    private String lastName;
    /**
     * for user employee ID.
     */
    @Column(name = "employeeId")
    private String employeeId;
    /**
     * for user Email.
     */
    @Column(name = "email", unique = true)
    private String email;
    /**
     * for user password.
     */
    @Column(name = "password")
    private String password;
    /**
     * for user date of birth.
     */
    @Column(name = "dateOfBirth")
    private String dateOfBirth;
    /**
     * for user contact number.
     */
    @Column(name = "contact")
    private String contact;
    /**
     * user designation.
     */
    @Column(name = "designation")
    private String designation;
    /**
     * user date of joining.
     */
    @Column(name = "dateOfJoining")
    private String dateOfJoining;
    /**
     * user date of exit.
     */
    @Column(name = "dateOfExit")
    private String dateOfExit;
    /**
     * user role as admin or employee.
     */
    @Column(name = "role")
    private String role;
    /**
     * user location.
     */
    @Column(name = "location")  
    private String location;
    /**
     * update time.
     */
    @Column(name = "updated_at")
    private String updatedAt;
    /**
     * created time.
     */
    @Column(name = "created_at")
    private String createdAt;

    /**
     * user firstLogin
     */
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
        return id;
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
    * no args constructor for user entity class.
    */
    public UserEntity() {
        super();
    }

    /**
     * hash code method for user entity class.
     */
    @Override
    public int hashCode() {
        return Objects.hash(contact, createdAt, dateOfBirth, dateOfExit,
                dateOfJoining, designation, email, employeeId,
                firstLogin, firstName, id, lastName, location,
                password, role, updatedAt);
    }

    /**
     * equals method for user entity class.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserEntity other = (UserEntity) obj;
        return Objects.equals(contact, other.contact)
                && Objects.equals(createdAt, other.createdAt)
                && Objects.equals(dateOfBirth, other.dateOfBirth)
                && Objects.equals(dateOfExit, other.dateOfExit)
                && Objects.equals(dateOfJoining, other.dateOfJoining)
                && Objects.equals(designation, other.designation)
                && Objects.equals(email, other.email)
                && Objects.equals(employeeId, other.employeeId)
                && Objects.equals(firstLogin, other.firstLogin)
                && Objects.equals(firstName, other.firstName)
                && id == other.id && Objects.equals(lastName, other.lastName)
                && Objects.equals(location, other.location)
                && Objects.equals(password, other.password)
                && Objects.equals(role, other.role)
                && Objects.equals(updatedAt, other.updatedAt);
    }

    /**
     * toString method for user entity class.
     */
    @Override
    public String toString() {
        return "UserEntity [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + ", employeeId="
                + employeeId + ", email=" + email + ", password="
                + password + ", dateOfBirth=" + dateOfBirth
                + ", contact=" + contact + ", designation="
                + designation + ", dateOfJoining=" + dateOfJoining
                + ", dateOfExit=" + dateOfExit + ", role=" + role
                + ", location=" + location + ", updatedAt="
                + updatedAt + ", createdAt=" + createdAt
                + ", firstLogin=" + firstLogin + "]";
    }
}
