package com.bodega.consumermicroservice.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Wayne Sidney
 * Created on {07/06/2022}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FoodOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    String item;
    Double amount;
}
