package fr.esgi.repository.impl;

import java.util.ArrayList;
import java.util.List;

import fr.esgi.domain.Item;
import fr.esgi.repository.ItemRepository;

public class ItemRepositoryImpl implements ItemRepository {

	private List<Item> items = new ArrayList<>();
	
	@Override
	public List<Item> getItems() {
		return items;
	}

	

}
