package fr.esgi.service.impl;

import java.util.Arrays;
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
		item = new Item(1L, "toto", "dedhfe");
	}

	@Test
	public void shouldGetAllWhenContainsElements() {
		// Given
		final ItemRepository itemRepository = new FakeItemRepository();

		final TodoManager todoManager = new TodoManagerImpl(itemRepository);

		// Then
		Assert.assertTrue(!todoManager.findAll().isEmpty());
	}

	class FakeItemRepository implements ItemRepository {

		private final List<Item> items = Arrays.asList(item);

		@Override
		public List<Item> getItems() {
			return items;
		}

	}
}
