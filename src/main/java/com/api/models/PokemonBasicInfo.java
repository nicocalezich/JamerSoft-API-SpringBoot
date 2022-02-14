package com.api.models;

public class PokemonBasicInfo {
	
	 private Integer id;
	 private String photo;
	 private String[] types;
	 private Double weight;
	 private String[] abilities;
	 
	 public PokemonBasicInfo(Integer id, String photo, String[] types, Double weight, String[] abilities) {
		 setId(id);
		 setPhoto(photo);
		 setTypes(types);
		 setWeight(weight);
		 setAbilities(abilities);
	 }

	public Integer getId() {
		return id;
	}

	private void setId(Integer id) {
		this.id = id;
	}

	public String getPhoto() {
		return photo;
	}

	private void setPhoto(String photo) {
		this.photo = photo;
	}

	public String[] getTypes() {
		return types;
	}

	private void setTypes(String[] types) {
		this.types = types;
	}

	public Double getWeight() {
		return weight;
	}

	private void setWeight(Double weight) {
		this.weight = weight;
	}

	public String[] getAbilities() {
		return abilities;
	}

	private void setAbilities(String[] abilities) {
		this.abilities = abilities;
	}
	 
	 
	 
	 

}


