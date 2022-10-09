package com.in.nt.inventory.inventorymanagement.dto;

import java.util.Objects;

/**
 * @author user login response dto class.
 *
 */
public final class UserResponseDto {

    /**
     * stores id
     */
    private Integer id;
    /**
     * stores firstName
     */
    private String firstName;
    /**
     * stores lastName
     */
    private String lastName;
    /**
     * stores role
     */
    private String role;
    /**
     * stores firstLogin
     */
    private Boolean firstLogin;
    /**
     * stores employeeId
     */
    private String employeeId;
    /**
     * stores email
     */
    private String email;

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
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(final Integer id) {
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
     * hashcode method of user login response dto class.
     */
    @Override
    public int hashCode() {
        return Objects.hash(email, employeeId, firstLogin,
                firstName, id, lastName, role);
    }

    /**
     * equals method of user login response dto class.
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserResponseDto other = (UserResponseDto) obj;
        return Objects.equals(email, other.email)
                && Objects.equals(employeeId, other.employeeId)
                && Objects.equals(firstLogin, other.firstLogin)
                && Objects.equals(firstName, other.firstName)
                && Objects.equals(id, other.id)
                && Objects.equals(lastName, other.lastName)
                && Objects.equals(role, other.role);
    }

    /**
     * toString method of user login response dto.
     */
    @Override
    public String toString() {
        return "UserResponseDto [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + ", role=" + role
                + ", firstLogin=" + firstLogin + ", employeeId="
                + employeeId + ", email=" + email + "]";
    }
}
