package com.bodega.consumermicroservice.Service;

import com.bodega.consumermicroservice.Dto.FoodDto;
import com.bodega.consumermicroservice.Entity.FoodOrder;
import com.bodega.consumermicroservice.Repository.FoodOrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Wayne Sidney
 * Created on {07/06/2022}
 */
@Slf4j
@Service
public class FoodOrderService {

    @Autowired
    private FoodOrderRepository foodOrderRepository;

    public void persistFoodOrder(FoodDto foodDto){
        FoodOrder foodOrder = new FoodOrder();
        foodOrder.setItem(foodDto.getItem());
        foodOrder.setAmount(foodDto.getAmount());

        FoodOrder savedOrder = (FoodOrder) foodOrderRepository.save(foodOrder);

        log.info("foodOrder saved in db", savedOrder);
    }
}
