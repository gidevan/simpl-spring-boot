package org.vsanyc.rest.dao;

import org.vsanyc.rest.domain.Item;

import java.util.List;

/**
 * Created by vano on 3.10.16.
 */
public interface ItemDao {

    List<Item> getItems();
}
