package com.bodega.consumermicroservice.Dto;

import lombok.Data;
import lombok.Value;

/**
 * @author Wayne Sidney
 * Created on {07/06/2022}
 */
@Data
@Value
public class FoodDto {

    String item;
    Double amount;
}
