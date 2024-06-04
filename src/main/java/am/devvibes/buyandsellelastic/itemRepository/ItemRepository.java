package am.devvibes.buyandsellelastic.itemRepository;

import am.devvibes.buyandsellelastic.entity.ItemEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface ItemRepository extends ElasticsearchRepository<ItemEntity, Long> {

}