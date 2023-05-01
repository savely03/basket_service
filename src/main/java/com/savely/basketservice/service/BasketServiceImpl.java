package com.savely.basketservice.service;

import com.savely.basketservice.util.Basket;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;


@Service
public class BasketServiceImpl implements BasketService {
    private final Basket basket;
    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }
    @Override
    public void addItem(int id) {
        basket.addItem(id);
    }

    @Override
    public void addItems(Collection<Integer> items) {
        basket.addItems(items);
    }

    @Override
    public List<Integer> getItems() {
        return basket.getBasketItems();
    }
}
