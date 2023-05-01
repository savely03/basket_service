package com.savely.basketservice.controller;

import com.savely.basketservice.service.BasketService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService basketService;
    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }
    @GetMapping("/add/{id}")
    public String addItem(@PathVariable int id) {
        basketService.addItem(id);
        return "Товар успешно добавлен!";
    }

    @PostMapping("/add/items")
    public String addItems(@RequestBody Map<String, List<Integer>> items) {
        basketService.addItems(items.getOrDefault("items", Collections.emptyList()));
        return "Товары успешно добавлены!";
    }
    @GetMapping("/get")
    public Collection<Integer> getItems() {
        return basketService.getItems();
    }
}
