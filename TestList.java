import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestList {
	

	private static SinglyLinkedList list = new SinglyLinkedList();
	
	@BeforeClass
	public static void init(){
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
	}
//	
	@Test
	public void tests(){
		addTest();
		valuesTest();
		findTest();
		deleteTest();
	}

//	@Test
	public void addTest() {
		assertEquals("1", list.getHead().getValue());
		assertEquals("4", list.getTail().getValue());
	}
	
//	@Test
	public void findTest(){
		assertEquals("1", list.find("1").getValue());
		assertEquals("2", list.find("2").getValue());
		assertEquals("3", list.find("3").getValue());
		assertEquals("4", list.find("4").getValue());
	}
	

//	@Test
	public void valuesTest(){
		assertEquals("1", list.values()[0]);
		assertEquals("2", list.values()[1]);
		assertEquals("3", list.values()[2]);
		assertEquals("4", list.values()[3]);
//		assertArrayEquals({"1","2","3","4"},list.values());
	}
	
//	@Test
	public void deleteTest(){
		list.delete(list.find("1"));
		assertEquals("2", list.getHead().getValue());
		list.delete(list.find("4"));
		assertEquals("3", list.getTail().getValue());
		
	}

}
