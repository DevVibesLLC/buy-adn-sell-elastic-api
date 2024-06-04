package am.devvibes.buyandsellelastic.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "measurement_entity")
public class MeasurementEntity implements Serializable {

    @Id
    private Long id;

    private String symbol;
    private String category;


}