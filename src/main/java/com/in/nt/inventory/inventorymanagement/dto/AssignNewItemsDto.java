package com.in.nt.inventory.inventorymanagement.dto;

import java.util.List;
import java.util.Objects;

/**
 * @author Assign New Items Dto class.
 *
 */
public class AssignNewItemsDto {

    /**
     * assignItemDtos are containing objects of AssignItemDto in a list.
     */
    private List<AssignItemDto> assignItemDtos;

    /**
     * @return assignItemDtos
     */
    public List<AssignItemDto> getAssignItemDtos() {
        return assignItemDtos;
    }

    /**
     * @param assignItemDtos
     */
    public void setAssignItemDtos(final List<AssignItemDto> assignItemDtos) {
        this.assignItemDtos = assignItemDtos;
    }

    /**
     * hash code method for assign new items dto.
     */
    @Override
    public int hashCode() {
        return Objects.hash(assignItemDtos);
    }

    /**
     * equals method for assign new items dto.
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AssignNewItemsDto other = (AssignNewItemsDto) obj;
        return Objects.equals(assignItemDtos, other.assignItemDtos);
    }

    /**
     * toString method for assign new items dto.
     */
    @Override
    public String toString() {
        return "AssignNewItemsDto [assignItemDtos=" + assignItemDtos + "]";
    }
}
