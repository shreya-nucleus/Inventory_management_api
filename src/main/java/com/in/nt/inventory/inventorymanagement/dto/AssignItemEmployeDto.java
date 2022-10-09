package com.in.nt.inventory.inventorymanagement.dto;

import java.util.List;
import java.util.Objects;

/**
 * @author Dto for Assign items 
 *
 */
public class AssignItemEmployeDto {

    /**
     * UserFetchDto reference object.
     */
    private UserFetchDto userFetchDto;
    /**
     * list of item fetch dto
     */
    private List<ItemFetchDto> itemFetchDtos;
     
    /**
     * @return item Fetch Dtos
     */
    public List<ItemFetchDto> getItemFetchDtos() {
        return itemFetchDtos;
    }
    /**
     * @param itemFetchDtos
     */
    public void setItemFetchDtos(final List<ItemFetchDto> itemFetchDtos) {
        this.itemFetchDtos = itemFetchDtos;
    }
    /**
     * @return user Fetch Dto
     */
    public UserFetchDto getUserFetchDto() {
        return userFetchDto;
    }
    /**
     * @param userFetchDto
     */
    public void setUserFetchDto(final UserFetchDto userFetchDto) {
        this.userFetchDto = userFetchDto;
    }
    /**
     * hash code method for assign item employee dto.
     */
    @Override
    public int hashCode() {
        return Objects.hash(itemFetchDtos, userFetchDto);
    }
    /**
     * equals method for assign item employee dto.
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AssignItemEmployeDto other = (AssignItemEmployeDto) obj;
        return Objects.equals(itemFetchDtos, other.itemFetchDtos)
                && Objects.equals(userFetchDto, other.userFetchDto);
    }
    /**
     * toString method for assign item employee dto.
     */
    @Override
    public String toString() {
        return "AssignItemEmployeDto [userFetchDto=" + userFetchDto
                + ", itemFetchDtos=" + itemFetchDtos + "]";
    }
}
