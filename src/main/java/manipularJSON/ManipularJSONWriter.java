package manipularJSON;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.JSONWriter;

public class ManipularJSONWriter {
	
	public static void JSONExamplWriter() {

		//Mesma ideia do JSONStringer, mas dessa vez com o JSONWrite e um StringBuilder
		StringBuilder write = new StringBuilder();
		JSONWriter jsonWriter = new JSONWriter(write);

		jsonWriter.object();
		
		jsonWriter.key("trueValue").value(true);
		jsonWriter.key("falseValue").value(false);
		jsonWriter.key("nullValue").value(null);
		jsonWriter.key("stringValue").value("hello world!");
		jsonWriter.key("complexStringValue").value("h\be\tllo w\u1234orld!");
		jsonWriter.key("intValue").value(42);
		jsonWriter.key("doubleValue").value(-23.45e67);
		
		jsonWriter.endObject();
		
		//O resultado fica no objeto "Write"
		
		System.out.println("JSON: " + write);
	}
	
	
	public static void JSONExampleTokener() {

		//Da para criar a partir de uma strink com a formatação correta um objeto JSONTokener e com ele gerar JSONObject ou JSONArray

		String string = "{this: is a valid JSON string}";
		JSONTokener token = new JSONTokener(string);
		

		JSONObject object = new JSONObject(token);
		
		System.out.println(object);
	
		
	}
	
}
