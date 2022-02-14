package com.api.models;

public class Pokemon {
	
	 private Integer id;
	 private String photo;
	 private String[] types;
	 private Double weight;
	 private String[] abilities;
	 
	 private String basicInfo;
	 private String description;
	 private String[] moves;
	 
	 
	 public Pokemon(Integer id, String photo, String[] types, Double weight, String[] abilities) {
		 setId(id);
		 setPhoto(photo);
		 setTypes(types);
		 setWeight(weight);
		 setAbilities(abilities);
	 }
	 
	 public Pokemon(String[] moves) {
		 setMoves(moves);
	 }
	 
	public Integer getId() {
		return id;
		}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String[] getTypes() {
		return types;
	}
	public void setTypes(String[] types) {
		this.types = types;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String[] getAbilities() {
		return abilities;
	}
	public void setAbilities(String[] abilities) {
		this.abilities = abilities;
	}
	public String getBasicInfo() {
		return basicInfo;
	}
	public void setBasicInfo(String basicInfo) {
		this.basicInfo = basicInfo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String[] getMoves() {
		return moves;
	}
	public void setMoves(String[] moves) {
		this.moves = moves;
	}
	 
	 
	  
}
