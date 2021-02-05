package com.dev.crudStarterPack.dto;

import lombok.Data;

@Data
public class AddressDTO {
    Long addressId;
    String streetName;
    String city;
    String Country;
}
