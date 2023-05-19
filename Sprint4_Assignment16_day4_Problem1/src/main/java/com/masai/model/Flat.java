package com.masai.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data

public class Flat {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer FlatId;
	
	@NotNull
	@NotBlank
	private String BuildingName;
	
	@NotNull
	@NotBlank
	@Max(value = 10, message = "No should be less Than 10")
	private Integer NoOfRooms;
	
	
//	private LocalDate date_of_manufacturing;
	
	@NotNull
	@NotBlank
	private String Facing;
	
	@NotNull
	@NotBlank
	
	private Integer price;
	
	@NotNull
	@NotBlank
	private String description;
	
	
}
