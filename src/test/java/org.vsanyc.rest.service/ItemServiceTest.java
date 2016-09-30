package org.vsanyc.rest.service;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.vsanyc.rest.domain.Item;

import java.util.List;

public class ItemServiceTest {

    private static final int TEST_ID = 0;
    private static final int WRONG_TEST_ID = 110;

    private ItemService itemService = new ItemServiceImpl();

    @Test
    public void testGetItems() {
        List<Item> items = itemService.getItems();
        Assert.assertFalse(items.isEmpty());
    }

    @Test
    public void testGetById() {
        Item item = itemService.getIemById(TEST_ID);
        Assert.assertNotNull(item);
    }

    @Test
    public void testGetByWrongId() {
        Item item = itemService.getIemById(WRONG_TEST_ID);
        Assert.assertNull(item);
    }
}
