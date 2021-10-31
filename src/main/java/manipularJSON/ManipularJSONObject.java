package manipularJSON;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class ManipularJSONObject {
	public static void JSONExampleObject1() {

		//Cria um JSONObject diretamente a partir de uma string

		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
		JSONObject example = new JSONObject(string);
		System.out.println("Final JSONObject: " + example);
	}
	
	public static void JSONExampleObject2() {

		JSONObject example = new JSONObject();

		//Cria um JSONObject zerado e vai adicionando um a um os elementos dele (chave, valor)
		//Entretanto elementos nulos não podem ser adicionados
		example.put("key", "value");
		example.put("key2", 5);
		example.put("key3", -23.45e67);
		example.put("trueValue", true);

		System.out.println("Final JSONOBject: " + example);
	}
	
	public static void JSONExampleObject3() {

		//Cria um MAP com chave do tipo String
		Map<String,Double> map = new HashMap<String, Double>();
		
		//Adiciona elemetnos
		map.put("key1", 1.0);
		map.put("key2", -23.45e67);
		
		//Cria um JSONObject a partir do MAP
		JSONObject example = new JSONObject(map);
		 System.out.println("Final JSONOBject: " + example);
	}
}
