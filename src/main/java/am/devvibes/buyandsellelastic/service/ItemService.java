package am.devvibes.buyandsellelastic.service;

import am.devvibes.buyandsellelastic.entity.ItemEntity;

import java.util.List;

public interface ItemService {

	ItemEntity findItemById(Long id);

	List<ItemEntity> findAllItems();

}
