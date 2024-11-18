package com.Infosys_Project1.Infosys_Project1.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long adminId;

    private String adminName;
    private Long phoneNo;
    private String societyName;
    private String societyAddress;
    private String city;
    private String district;
    private Long postal;

}
