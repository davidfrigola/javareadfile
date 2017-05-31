package org.test;

import java.io.InputStream;
import java.io.InputStreamReader;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

/**
 * Hello world!
 *
 */
public class App {

	
	public static String readJson(String file) {
		
		JsonObject gson = new Gson().fromJson(new InputStreamReader(getReader(file)), JsonObject.class);
		
		System.out.println("Readed json : " + gson.toString());
	
		return gson.toString();
	
	}

	private static InputStream getReader(String file) {

		return App.class.getClassLoader().getResourceAsStream(file);
	}
}
