package com.dev.crudStarterPack.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Table(name = "AddressT1")
@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long addressId;
    String streetName;
    String city;
    String Country;

}
