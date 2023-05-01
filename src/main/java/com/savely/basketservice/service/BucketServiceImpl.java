package com.savely.basketservice.service;

import com.savely.basketservice.util.Bucket;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;


@Service
public class BucketServiceImpl implements BucketService {
    private final Bucket bucket;
    public BucketServiceImpl(Bucket basket) {
        this.bucket = basket;
    }
    @Override
    public void addItem(int id) {
        bucket.addItem(id);
    }

    @Override
    public void addItems(Collection<Integer> items) {
        bucket.addItems(items);
    }

    @Override
    public List<Integer> getItems() {
        return bucket.getBucketItems();
    }
}
