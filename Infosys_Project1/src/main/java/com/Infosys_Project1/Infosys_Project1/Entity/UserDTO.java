package com.Infosys_Project1.Infosys_Project1.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.IdGeneratorType;
import org.hibernate.generator.internal.GeneratedAlwaysGeneration;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String name;
    private Long phoneNo;
    private String societyName;
    private int flatNo;
    private int postal;

}
