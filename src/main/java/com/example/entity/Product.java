package com.example.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="mtableproducts")
@JsonPropertyOrder({"id", "name", "price", "department"})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(message="Product name should not be null")
    @NotEmpty(message="Product name should not be empty")
    private String name;
    @NotNull(message="Price name should not be null")
    @NotEmpty(message="Price name should not be empty")
    @Min(value = 10)
    @Max(value = 100000)
    private String price;
    @NotNull(message="Department name should not be null")
    @NotEmpty(message="Department name should not be empty")
    private String department;

}