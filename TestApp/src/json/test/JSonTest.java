package json.test;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSonTest {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		//Used jackson-databind 2 for Json
		ObjectMapper o = new ObjectMapper();
		Sample sample = o.readValue(new File("resources/sample.json"), Sample.class);
		System.out.println(sample.getName());
	}
}
