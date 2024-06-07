package am.devvibes.buyandsellelastic.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FilterDto {

	private String mark;
	private String model;

	private String startYear;
	private String endYear;

	private String bodyType;

	private String startEngineSize;
	private String endEngineSize;

	private String transmission;

	private String driveType;

	private String startMileage;
	private String endMileage;

	private String steeringWheel;

	private String clearedCustom;

	private String color;

	private String wheelSize;

	private String headlights;

	private String interiorColor;

	private String exteriorColor;

	private String sunroof;

}
