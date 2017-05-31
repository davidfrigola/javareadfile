package org.test;

import org.junit.Assert;
import org.junit.Test;

import com.google.gson.JsonSyntaxException;

public class AppTest{

	private static final String FILE_INVALID_JSON = "test_json_files/file_invalid.json";
	private final static String FILE_OK = "test_json_files/file_ok.json";
	
	@Test
	public void shouldReadFile(){
		
		Assert.assertEquals(App.readJson(FILE_OK), "{\"field1\":\"value1\",\"field2\":\"value2\"}" );
		
	}
	
	@Test(expected=Exception.class)
	public void shouldFailOnUnexistantFile(){
		
		App.readJson("DO_NOT_EXIST.json");
		
	}
	
	@Test(expected=JsonSyntaxException.class)
	public void shouldFailOnInvalidJsonFile(){
		App.readJson(FILE_INVALID_JSON);
	}
}
