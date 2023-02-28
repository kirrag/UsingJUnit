package ru.netology;

import org.junit.jupiter.api.*;
import java.util.List;

public class MainTest {
	@Test
	public void testReadString_validArgument_success() {
		// given:
		final String argument = "testData.json";
		final String expected = "[  {    \"id\": 1,    \"firstName\": \"John\",    \"lastName\": \"Smith\",    \"country\": \"USA\",    \"age\": 25  },  {    \"id\": 2,    \"firstName\": \"Inav\",    \"lastName\": \"Petrov\",    \"country\": \"RU\",    \"age\": 23  }]";
	
		// when:
		final Main newMain = new Main();
		final String result = newMain.readString(argument);

		// then:
		Assertions.assertEquals(expected, result);
	}

	@Test
	public void testReadString_nullArgument_throwsException() {
		// given:
		final Main newMain = new Main();
		final String argument = null;
		// expect:
		Assertions.assertThrows(NullPointerException.class, () -> {
			newMain.readString(argument);
		});
	}

	@Test
	public void testJsonToList_classType() {
		// given
		final String argument = "[  {    \"id\": 1,    \"firstName\": \"John\",    \"lastName\": \"Smith\",    \"country\": \"USA\",    \"age\": 25  },  {    \"id\": 2,    \"firstName\": \"Inav\",    \"lastName\": \"Petrov\",    \"country\": \"RU\",    \"age\": 23  }]";
		final String expected = "class java.util.ArrayList";

		final Main newMain = new Main();
		final List<Employee> list = newMain.jsonToList(argument);
		final String result = list.getClass().toString();
		// then
		Assertions.assertEquals(expected, result);
	}
}
