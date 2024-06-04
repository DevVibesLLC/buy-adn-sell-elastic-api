package am.devvibes.buyandsellelastic.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(indexName = "item_entity")
public class ItemEntity implements Serializable {

	@Id
	private Long id;

	private LocalDateTime item_created_at;

	private LocalDateTime item_updated_at;

	private String item_title;

	private String item_description;

	private BigDecimal item_price;

	private Long item_currenct;

	private Long item_country;

	private Long item_city;

	private Long item_region;

	private String item_address;

	private String item_user_id;

	private Long item_category_id;

	private List<ValueEntity> fields;

	private String img_url;

	
}