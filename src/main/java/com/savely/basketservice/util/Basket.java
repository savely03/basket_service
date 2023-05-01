package com.savely.basketservice.util;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Integer> basketItems;
    public Basket() {
        this.basketItems = new ArrayList<>();
    }
    public List<Integer> getBasketItems() {
        return Collections.unmodifiableList(basketItems);
    }
    public void addItem(int item) {
        basketItems.add(item);
    }

    public void addItems(Collection<Integer> items) {
        basketItems.addAll(items);
    }
}
