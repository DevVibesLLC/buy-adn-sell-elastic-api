package am.devvibes.buyandsellelastic.service.impl;

import am.devvibes.buyandsellelastic.entity.ItemEntity;
import am.devvibes.buyandsellelastic.exception.NotFoundException;
import am.devvibes.buyandsellelastic.itemRepository.ItemRepository;
import am.devvibes.buyandsellelastic.service.ItemService;
import am.devvibes.buyandsellelastic.util.ExceptionConstants;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

	private final ItemRepository itemRepository;

	@Override
	public ItemEntity findItemById(Long id) {
		return itemRepository.findById(id).orElseThrow();
	}

	@Override
	public List<ItemEntity> findAllItems() {
		Iterable<ItemEntity> iterable = itemRepository.findAll();
		List<ItemEntity> list = new ArrayList<>();

		iterable.forEach(list::add);
		return list;
		//return StreamSupport.stream(iterable.spliterator(), false).toList();
	}

}
