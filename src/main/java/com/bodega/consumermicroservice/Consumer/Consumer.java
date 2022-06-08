package com.bodega.consumermicroservice.Consumer;

import com.bodega.consumermicroservice.Dto.FoodDto;
import com.bodega.consumermicroservice.Service.FoodOrderService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author Wayne Sidney
 * Created on {07/06/2022}
 */
@Slf4j
@Component
public class Consumer {

    
    private static final String orderTopic = "${topic.name}";

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private FoodOrderService foodOrderService;

    @KafkaListener(topics =orderTopic)
    private void consumeMessage(String message) throws JsonProcessingException {

        log.info("message consumed {}", message);

        FoodDto foodDto = objectMapper.readValue(message, FoodDto.class);
        foodOrderService.persistFoodOrder(foodDto);
    }
}
