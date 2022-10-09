package com.in.nt.inventory.inventorymanagement.dto;

import java.util.Objects;

/**
 * @author Reset Input Dto class.
 *
 */
public class ResetInputDto {

    /**
     * stores email
     */
    private String email;
    /**
     * stores oldPassword
     */
    private String oldPassword;
    /**
     * stores newPassword
     */
    private String newPassword;

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
     * @return oldPassword
     */
    public String getOldPassword() {
        return oldPassword;
    }

    /**
     * @param oldPassword
     */
    public void setOldPassword(final String oldPassword) {
        this.oldPassword = oldPassword;
    }

    /**
     * @return newPassword
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * @param newPassword
     */
    public void setNewPassword(final String newPassword) {
        this.newPassword = newPassword;
    }

    /**
     * hashcode method of reset input dto.
     */
    @Override
    public int hashCode() {
        return Objects.hash(email, newPassword, oldPassword);
    }

    /**
     * equals method of reset input dto.
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ResetInputDto other = (ResetInputDto) obj;
        return Objects.equals(email, other.email) 
                && Objects.equals(newPassword, other.newPassword)
                && Objects.equals(oldPassword, other.oldPassword);
    }

    /**
     * toString method of reset input dto.
     */
    @Override
    public String toString() {
        return "ResetInputDto [email=" + email + ", oldPassword=" + oldPassword
                + ", newPassword=" + newPassword + "]";
    }  
}
