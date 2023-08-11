package org.vsanyc.rest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.vsanyc.rest.domain.Item;

import java.util.List;

/**
 * Created by vano on 3.10.16.
 */
@SpringBootTest
public class ItemDaoTest extends AbstractTestNGSpringContextTests {
    private static final int EXPECTED_SIZE = 3;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testGetItem() {
        System.out.println("Test db connection");
        List<Item> items = itemDao.getItems();
        Assert.assertFalse(items.isEmpty());
        Assert.assertEquals(items.size(), EXPECTED_SIZE);
    }

}
