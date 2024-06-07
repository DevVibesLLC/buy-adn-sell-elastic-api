package am.devvibes.buyandsellelastic.service.impl;

import am.devvibes.buyandsellelastic.dto.FilterDto;
import am.devvibes.buyandsellelastic.entity.ItemEntity;
import am.devvibes.buyandsellelastic.exception.NotFoundException;
import am.devvibes.buyandsellelastic.itemRepository.ItemRepository;
import am.devvibes.buyandsellelastic.service.ItemService;
import am.devvibes.buyandsellelastic.util.ExceptionConstants;
import co.elastic.clients.elasticsearch._types.query_dsl.BoolQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryBuilders;
import co.elastic.clients.elasticsearch._types.query_dsl.TermQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.TermsQuery;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import io.micrometer.common.util.StringUtils;
import lombok.RequiredArgsConstructor;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchTemplateQuery;
import org.springframework.data.elasticsearch.core.query.SearchTemplateQueryBuilder;
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
	}

	@Override
	public List<ItemEntity> filterItems(FilterDto filterDto) {
		BoolQuery boolQuery = QueryBuilders.bool().build();
		boolQuery.must(QueryBuilders.)
	}

}
