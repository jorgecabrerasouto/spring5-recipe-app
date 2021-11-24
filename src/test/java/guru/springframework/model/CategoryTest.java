package guru.springframework.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CategoryTest {
	
	Category category;

	@Before
	public void setUp() throws Exception {
		category = new Category();
	}

	@Test
	public void testGetId() {
		Long idValue = 4L;
		category.setId(idValue);
		assertEquals(idValue, category.getId());
	}

	@Test
	public void testGetDescription() {
	//	fail("Not yet implemented");
	}

	@Test
	public void testGetRecipes() {
	//	fail("Not yet implemented");
	}

}
