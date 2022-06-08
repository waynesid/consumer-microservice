package com.bodega.consumermicroservice.Repository;

import com.bodega.consumermicroservice.Entity.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Wayne Sidney
 * Created on {07/06/2022}
 */
@Repository
public interface FoodOrderRepository extends JpaRepository<FoodOrder, Long> {
}
