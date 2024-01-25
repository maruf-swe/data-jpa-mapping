package com.example.datajpamapping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee_details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Long empId;
    private String empName;
    private Integer empAge;
    // default foreign key column name: address_add_id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_add_id")  // for custom foreign key column name using Joincolumn
    private Address address;

}
