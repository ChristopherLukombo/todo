package fr.esgi.service;
import java.util.List;

import fr.esgi.domain.Item;

public interface TodoManager {

	List<Item> findAll();
	
	boolean delete(Long id);
	
	void add(Item item);
}
