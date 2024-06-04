package am.devvibes.buyandsellelastic.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "field_entity")
public class FieldEntity implements Serializable {

	@Id
	private Long id;

	private String fieldName;

	private boolean isRequired;

	private boolean isPrefilled;

	private List<String> value;

	private MeasurementEntity measurement;

}
