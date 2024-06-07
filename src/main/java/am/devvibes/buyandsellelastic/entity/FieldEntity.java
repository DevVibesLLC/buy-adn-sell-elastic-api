package am.devvibes.buyandsellelastic.entity;

import lombok.*;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "field_entity")
public class FieldEntity implements Serializable {

	private Long field_id;

	private String field_value;

}