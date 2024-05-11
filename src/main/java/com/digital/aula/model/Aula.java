package com.digital.aula.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "aula", schema = "configuration")
@Getter
@Setter
@ToString
public class Aula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonProperty("nombre")
	private String name;

	@JsonProperty("eliminado")
	private boolean isdeleted;

	@JsonProperty("descripcion")
	private String description;

	@Override
	public String toString() {
		return "Aula [id=" + id + ", name=" + name + ", isDeleted=" + isdeleted + ", description=" + description + "]";
	}

}
