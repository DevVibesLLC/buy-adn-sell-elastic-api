package am.devvibes.buyandsellelastic.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "value_entity")
public class ValueEntity implements Serializable {

	private Long field_id;

	private String field_value;

}