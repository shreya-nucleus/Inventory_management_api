package com.in.nt.inventory.inventorymanagement.dto;

import java.util.Objects;

/**
 * @author User login in dto class.
 */

public final class UserLoginDto {
    /**
     * user email.
     */
    private String email;
    /**
     * user password.
     */
    private String password;

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
     * hashcode method of user class.
     */
    @Override
    public int hashCode() {
        return Objects.hash(email, password);
    }

    /**
     * equals method of user login dto.
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserLoginDto other = (UserLoginDto) obj;
        return Objects.equals(email, other.email) && Objects.equals(password, other.password);
    }

    /**
     * toString method of user login dto.
     */
    @Override
    public String toString() {
        return "UserLoginDto [email=" + email + ", password=" + password + "]";
    }
}
