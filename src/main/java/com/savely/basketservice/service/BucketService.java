package com.savely.basketservice.service;

import java.util.Collection;

public interface BucketService {
    void addItem(int id);

    void addItems(Collection<Integer> items);
    Collection<Integer> getItems();
}
