package org.vsanyc.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vsanyc.rest.domain.Item;
import org.vsanyc.rest.service.ItemService;

import java.util.List;

@RestController
@RequestMapping("/")
public class RestServer {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/items")
    public List<Item> getItems() {
        return itemService.getItems();
    }

    @CrossOrigin("http://localhost:8080")
    @RequestMapping("/hello")
    public String hello() {
        return "Simple rest server is started";
    }

    @RequestMapping("/item/{id}")
    public Item getItem(@PathVariable long id) {
        return itemService.getIemById(id);
    }

}
