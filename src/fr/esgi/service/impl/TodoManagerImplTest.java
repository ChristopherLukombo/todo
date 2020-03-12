package fr.esgi.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.esgi.domain.Item;
import fr.esgi.repository.ItemRepository;
import fr.esgi.service.TodoManager;
import junit.framework.Assert;
public class TodoManagerImplTest {

	private Item item;

	@Before
	public void setUp() {
		item = new Item(1L, "toto", "dedhfe", "done");
	}

	@Test
	public void shouldGetAllWhenContainsElements() {
		// Given
		final ItemRepository itemRepository = new FakeItemRepository();
		final TodoManager todoManager = new TodoManagerImpl(itemRepository);

		// Then
		Assert.assertTrue(!todoManager.findAll().isEmpty());
	}
	
	@Test
	public void shouldFindItemById() {
		// Given
		final ItemRepository itemRepository = new FakeItemRepository();
		final TodoManager todoManager = new TodoManagerImpl(itemRepository);

		// Then
		Assert.assertTrue(todoManager.findItem(1L) != null);
	}
	
	@Test
	public void shouldAddItem() {
		// Given
		final ItemRepository itemRepository = new FakeItemRepository();
		final TodoManager todoManager = new TodoManagerImpl(itemRepository);
		final Item item = new Item(1L, "toto", "dedhfe", "done");
		
		todoManager.add(item);
		
		// Then
		Assert.assertTrue(todoManager.findAll().size() == 2);
		
	}
	

	class FakeItemRepository implements ItemRepository {

		final List<Item> items = new ArrayList<Item>() {{
		    add(item);
		}};

		@Override
		public List<Item> getItems() {
			return items;
		}

	}
}
