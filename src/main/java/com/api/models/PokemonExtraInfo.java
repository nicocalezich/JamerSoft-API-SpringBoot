package com.api.models;

public class PokemonExtraInfo {
	
	private String basicInfo;
	private String description;
	private String[] moves;
	
	 public PokemonExtraInfo(String basicInfo, String description, String[] moves) {
		 setBasicInfo(basicInfo);
		 setDescription(description);
		 setMoves(moves);
	 }

	public String getBasicInfo() {
		return basicInfo;
	}

	private void setBasicInfo(String basicInfo) {
		this.basicInfo = basicInfo;
	}

	public String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}

	public String[] getMoves() {
		return moves;
	}

	private void setMoves(String[] moves) {
		this.moves = moves;
	}
	 
	 

}
