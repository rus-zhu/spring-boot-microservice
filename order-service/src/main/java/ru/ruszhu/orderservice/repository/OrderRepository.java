package ru.ruszhu.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ruszhu.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
