package com.example.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
    // Các phương thức truy vấn dữ liệu cho Entity Cart
}

