package com.masai.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Flat {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer FlatId;
	
	@NotNull
	private String BuildingName;
	
	private Integer NoOfRooms;
	
//	@NotNull
//	@NotBlank
	private LocalDate date_of_manufacturing;
//	
	@NotNull
	private String Facing;
	

	private Integer price;
	
	@NotNull
	private String description;
	
	
}
