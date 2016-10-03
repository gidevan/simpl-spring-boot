package org.vsanyc.rest.dao;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.vsanyc.rest.domain.Item;

import java.util.List;

/**
 * Created by vano on 3.10.16.
 */
public class ItemDaoTest {
    private ItemDao itemDao = new ItemDaoImpl();

    @Test
    public void testGetItem() {
        System.out.println("Test db connection");
        List<Item> items = itemDao.getItems();
        Assert.assertFalse(items.isEmpty());
    }

}
