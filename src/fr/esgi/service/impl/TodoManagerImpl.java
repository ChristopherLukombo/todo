package fr.esgi.service.impl;

import java.util.List;

import fr.esgi.domain.Item;
import fr.esgi.repository.ItemRepository;
import fr.esgi.service.TodoManager;

public class TodoManagerImpl implements TodoManager {
	
	private final ItemRepository itemRepository;
	
	public TodoManagerImpl(final ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	@Override
	public boolean delete(final Long id) {
		for (final Item item : itemRepository.getItems()) {
			if (item.getId().equals(id)) {
				return itemRepository.getItems().remove(item);
			}
		}
		return false;
	}

	@Override
	public void add(final Item item) {
		itemRepository.getItems().add(item);
	}

	@Override
	public List<Item> findAll() {
		return itemRepository.getItems();
	}

	@Override
	public Item findItem(final Long id) {
		return itemRepository.getItems().stream()
				.filter(item -> item.getId().equals(id))
				.findFirst()
				.orElseGet(()-> null);
	}
	
}
