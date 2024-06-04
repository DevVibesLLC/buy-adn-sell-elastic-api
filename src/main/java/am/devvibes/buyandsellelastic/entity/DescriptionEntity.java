package am.devvibes.buyandsellelastic.entity;

import am.devvibes.buyandsellelastic.util.DescriptionNameEnum;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "description_entity")
public class DescriptionEntity implements Serializable {

	@Id
	private Long id;

	private DescriptionNameEnum header;

	private List<FieldEntity> fields;

}