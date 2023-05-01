package com.savely.basketservice.util;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Bucket {
    private final List<Integer> bucketItems;
    public Bucket() {
        this.bucketItems = new ArrayList<>();
    }
    public List<Integer> getBucketItems() {
        return Collections.unmodifiableList(bucketItems);
    }
    public void addItem(int item) {
        bucketItems.add(item);
    }

    public void addItems(Collection<Integer> items) {
        bucketItems.addAll(items);
    }
}
