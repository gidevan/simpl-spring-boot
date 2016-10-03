package org.vsanyc.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vsanyc.rest.dao.ItemDao;
import org.vsanyc.rest.domain.Item;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan_Pukhov on 7/14/2016.
 */
@Service
public class ItemServiceImpl implements ItemService {

    private static final int COUNT = 13;
    private static final String NAME_PREFIX = "Name_";
    private static final String DESCRIPTION_PREFIX = "Description: ";

    private static List<Item> items = new ArrayList<>();
    @Autowired
    private ItemDao itemDao;

    public ItemServiceImpl() {
        initItems();
    }


    @PostConstruct
    private void initItems() {
        for(int i = 0; i < COUNT; i++) {
            items.add(new Item(i, NAME_PREFIX + i, DESCRIPTION_PREFIX + i));
        }
    }

    @Override
    public List<Item> getItems() {
        return items;
    }

    @Override
    public List<Item> getOddItems() {
        return null;
    }

    @Override
    public Item getIemById(long id) {
        for(Item item : items) {
            if (id == item.getId()) {
                return item;
            }
        }
        return null;
    }

    @Override
    public List<Item> getDBItems() {
        return itemDao.getItems();
    }
}
