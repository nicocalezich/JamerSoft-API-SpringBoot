package com.api.services;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ParsingJsonDataService {
	
	public String[] getMoves(JSONObject root) throws JSONException {
		
		JSONArray moves = root.getJSONArray("moves");
		
		String[] movesList = new String[moves.length()];
		
		for (int i = 0; i < moves.length(); i++) {
			
			JSONObject element = moves.getJSONObject(i);
			
			JSONObject move = element.getJSONObject("move");
			
			String name = move.getString("name");
			
			movesList[i] = name;
		}
		return movesList;
	}		
	
	public Integer getId(JSONObject root) throws JSONException {
		
		Integer id = root.getInt("id");
		
		return id;
	}
	
	public String getPhotoUrl(JSONObject root) throws JSONException {
		
		JSONObject sprites = root.getJSONObject("sprites");
		 
		String photo = sprites.getString("front_default");
		
		return photo;	
	}
	
	public String[] getTypes(JSONObject root) throws JSONException {
		
		JSONArray types = root.getJSONArray("types");
		
		String[] typesList = new String[types.length()];
		
		for (int i = 0; i < types.length(); i++) {
			
			JSONObject element = types.getJSONObject(i);
			
			JSONObject type = element.getJSONObject("type");
			
			String name = type.getString("name");
			
			typesList[i] = name;
		}
		
		return typesList;
	}
	
	public Double getWeight(JSONObject root) throws JSONException {
		
		Double weight = root.getDouble("weight");
		
		return weight;
	}
	
	public String[] getAbilities(JSONObject root) throws JSONException {
		
		JSONArray abilities = root.getJSONArray("abilities");
		
		String[] abilitiesList = new String[abilities.length()];
		
		for (int i = 0; i < abilities.length(); i++) {
					
			JSONObject element = abilities.getJSONObject(i);
			
			JSONObject ability = element.getJSONObject("ability");
			
			String name = ability.getString("name");
			
			abilitiesList[i] = name;
		}
		
		return abilitiesList;
		
	}
	
	public String getBasicInfo(JSONObject root) throws JSONException {
			
		String name = root.getString("name");
			
		return name;
	}
	
	public String getDescriptionES(JSONObject root) throws Exception {
		
		final Integer ES_POSITION = 5;
		
		JSONArray descriptions = root.getJSONArray("descriptions");
		
		JSONObject element = descriptions.getJSONObject(ES_POSITION);
		
		String description = element.getString("description");
		
		return description;
	}
	


}
