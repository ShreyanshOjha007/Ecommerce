package com.webApp.Ecommerce.repository;

import com.webApp.Ecommerce.entity.Orders;
import com.webApp.Ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepo extends JpaRepository<Orders,Long> {
    List<Orders> findAllByUser(User user);
}
