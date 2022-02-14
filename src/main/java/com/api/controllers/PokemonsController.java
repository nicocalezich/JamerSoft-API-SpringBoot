package com.api.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.models.Pokemon;
import com.api.services.PokemonService;

@CrossOrigin(origins = "*")
@RequestMapping("pokemons")
@RestController
public class PokemonsController {

	private static final String POKEAPI_URL = "https://pokeapi.co/api/v2/pokemon/";
	private static final PokemonService pokemonService = new PokemonService(); 
	
	
	@GetMapping("/{from}")
	public ArrayList<Pokemon> get(@PathVariable("from") int from) {
		try {
			return pokemonService.getPokemons(POKEAPI_URL, 10, from);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	} 
	
	@GetMapping("/find/{id}")
	public Object getById(@PathVariable("id") Integer id) { 
		try {
			return pokemonService.getPokemon(POKEAPI_URL, id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		} 
	} 
	
}
