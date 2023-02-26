package ru.netology;

//import org.junit.jupiter.junit-jupiter-engine;
import org.junit.jupiter.api.*;
import java.util.List;
import java.util.ArrayList;

public class MainTest {
	@Test
	public void testJsonToList_validArgument_success() {
		// given:
		final String argument = new String("[  {    \"id\": 1,    \"firstName\": \"John\",    \"lastName\": \"Smith\",    \"country\": \"USA\",    \"age\": 25  },  {    \"id\": 2,    \"firstName\": \"Inav\",    \"lastName\": \"Petrov\",    \"country\": \"RU\",    \"age\": 23  }]");
	
		// when:
		Main testMain = new Main();
		List<Employee> result = testMain.jsonToList(argument);


		// then:
		Assertions.assertEquals(expected, result);
	}	
	/*
	//@org.junit.jupiter.api.Test
	@Test
	public void testConcat_validArgument_success() {
		// given:
		final String original = new String("Test string ");
		final String argument = new String("valid");
		final String expected = new String("Test string valid");
	
		// when:
		final String result = original.concat(argument);    

		// then:
		Assertions.assertEquals(expected, result);
	}	
	
	@Test
	public void testConcat_emptyString_originalString() {
		// given:
		final String original = "Test string ";
		final String argument = "";
		// when:
		final String result = original.concat(argument);
		// then:
		Assertions.assertEquals(original, result);
	}

	@Test
	public void testConcat_nullArgument_throwsException() {
		// given:
		final String original = "Test string ";
		// expect:
		Assertions.assertThrows(NullPointerException.class, () -> {
			original.concat(null);
		});
	}
	*/
}
