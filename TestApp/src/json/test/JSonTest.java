package json.test;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSonTest {
	public static void main(String[] args) {
		//readJson();
		writeJson(new File("resources/sample1.json"));
	}

	// Used jackson-databind 2 for Json
	public static void readJson() {
		
		ObjectMapper o = new ObjectMapper();
		Sample sample;
		try {
			sample = o.readValue(new File("resources/sample.json"), Sample.class);
			System.out.println(sample.getName());
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void writeJson(File path) {
		ObjectMapper om = new ObjectMapper();
		try {
			om.writeValue(path, new Sample("SampleTest"));
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
