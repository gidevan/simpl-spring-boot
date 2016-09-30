package org.vsanyc.rest.service;

import org.vsanyc.rest.domain.Item;

import java.util.List;

/**
 * Created by Ivan_Pukhov on 7/14/2016.
 */
public interface ItemService {

    List<Item> getItems();

    List<Item> getOddItems();

    Item getIemById(long id);
}
