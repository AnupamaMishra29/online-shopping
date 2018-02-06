package net.anu.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.anu.shoppingbackend.dao.CategoryDAO;
import net.anu.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;

	private Category category;
	
	@BeforeClass
	public static void init(){
		
		context = new AnnotationConfigApplicationContext();
		context.scan("net.anu.shoppingbackend");
		context.refresh();
		
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
	
	}
	
	/*@Test
	public void testAddCategory(){
		category = new Category();
		
		category.setName("Television");
		category.setDescription("This is some description for Television");
		category.setImageURL("Cat_1.png");
		
		assertEquals("Successfully added a inside the table",true,categoryDAO.add(category));
		
	}

	
*/

	
	/*	@Test
	public void testGetCategory()
	{
		category = categoryDAO.get(1);
		
		assertEquals("Successfully fetched a single category from the table","Television",category.getName());	
	}
	*/
	
	
	
	/*@Test
	public void testUpdateCategory()
	{
		category = categoryDAO.get(1);
		category.setName("TV");
		assertEquals("Successfully fetched a single category in the table",true,categoryDAO.update(category));	
	}*/
	
	/*@Test
	public void testUpdateCategory()
	{
		category = categoryDAO.get(1);
		
		assertEquals("Successfully deleted a single category in the table",true,categoryDAO.delete(category));	
	}*/
	
/*	
	@Test
	public void testListCategory()
	{
		
		
		assertEquals("Successfully fetched a list of categories in the table",0,categoryDAO.list().size());	
	}
	*/
	
	@Test
	public void testCRUDCategory(){
        category = new Category();
		
		category.setName("Television");
		category.setDescription("This is some description for Television");
		category.setImageURL("Cat_1.png");
		
		assertEquals("Successfully added a inside the table",true,categoryDAO.add(category));
		
category = new Category();
		
		category.setName("Laptop");
		category.setDescription("This is some description for Television");
		category.setImageURL("Cat_2.png");
		
		assertEquals("Successfully added laptop inside the table",true,categoryDAO.add(category));
		
	//fetching and updating the category
		
	category = categoryDAO.get(2);
	category.setName("TV");
	assertEquals("Successfully fetched a single category in the table",true,categoryDAO.update(category));	

	//deleting the category
	assertEquals("Successfully deleted a single category in the table",true,categoryDAO.delete(category));	

	//fetching the list
	assertEquals("Successfully fetched a list of categories in the table",1,categoryDAO.list().size());
	
	}
	
	
	
	
}	
