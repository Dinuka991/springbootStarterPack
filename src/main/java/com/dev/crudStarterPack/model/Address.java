package com.dev.crudStarterPack.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Table(name = "AddressC2")
@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long addressId;
    String line1;
    String city;
    String country;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employeeId")
    Employee employee;


}
