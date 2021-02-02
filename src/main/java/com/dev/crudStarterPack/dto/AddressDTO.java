package com.dev.crudStarterPack.dto;

import lombok.Data;

@Data
public class AddressDTO {
    Long addressId;
    Long employeeId;
    String line1;
    String city;
    String Country;
}
