package com.example.spring_uols.repository;

import com.example.spring_uols.entity.TacoOrder;


public interface OrderRepository {
    TacoOrder save(TacoOrder tacoOrder);
}
