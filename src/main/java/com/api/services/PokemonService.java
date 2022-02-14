package com.api.services;

import java.util.ArrayList;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import com.api.models.Pokemon;
public class PokemonService {
	
	@Autowired
	private JsonParsingService parsingService = new JsonParsingService();
	private ParsingJsonDataService parsingJsonService = new ParsingJsonDataService();
	
	
	public ArrayList<Pokemon> getPokemons(String url, final int cant, int from) throws Exception {
		
		ArrayList<Pokemon> pokemons = new ArrayList<>();
		
		for (int i = 0; i < cant ; i++) {
			
			 int id = ++from;
					 
			 String raw = parsingService.parse(url, id);
			 
			 JSONObject root = new JSONObject(raw);
			 
			 Integer pokemonId = parsingJsonService.getId(root);
			 
			 String photo = parsingJsonService.getPhotoUrl(root);
			 
			 String[] types = parsingJsonService.getTypes(root);
			 
			 Double weight = parsingJsonService.getWeight(root);
			 
			 String[] abilities = parsingJsonService.getAbilities(root);
			 
			 pokemons.add(new Pokemon(pokemonId, photo, types, weight, abilities));	 
		}
		
		return pokemons; 
		
	}
	
	public Object getPokemon(String url, Integer id) throws Exception {
			 
			String raw = parsingService.parse(url, id);
		
			JSONObject root = new JSONObject(raw);
			 
			String[] moves = parsingJsonService.getMoves(root);
			 	
			return new Pokemon(moves);
		}	

}
