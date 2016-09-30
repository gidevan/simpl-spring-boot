package org.vsanyc.rest.service;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.vsanyc.rest.domain.Item;

import java.util.List;

public class ItemServiceTest {

    private ItemService itemService = new ItemServiceImpl();

    @Test
    public void testGetItems() {
        List<Item> items = itemService.getItems();
        Assert.assertFalse(items.isEmpty());
    }
}
