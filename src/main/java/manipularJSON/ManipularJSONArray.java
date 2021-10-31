package manipularJSON;

import org.json.JSONArray;
import org.json.JSONObject;

public class ManipularJSONArray {
	
	public static void JSONExampleArray1() {
	
		//Cria um JSONObject com base em uma string que tem o formato de um JSONArray
		
		//Cria a String
		 String arrayStr = 
		            "["+"true,"+"false,"+ "\"true\","+ "\"false\","+"\"hello\","+"23.45e-4,"+
		                "\"23.45\","+"42,"+"\"43\","+"["+"\"world\""+"],"+
		            		"{"+
		                    "\"key1\":\"value1\","+
		                    "\"key2\":\"value2\","+
		                    "\"key3\":\"value3\","+
		                    "\"key4\":\"value4\""+
		                "},"+
		                "0,"+"\"-1\""+
		            "]";

		 //Passa a string para um JSONArray
		  JSONArray array = new JSONArray(arrayStr);
		  System.out.println("Values array: "+ array);

		  
		  //Usa o metodo listNumberArray para criar as chaves do JSON final com base na quantidade de valores no array
		  JSONArray list = listNumberArray(array.length());
		  System.out.println("Label Array: "+ list.toString());
		  
		  //Associa as chaves do listNumberArray com os valores do JSONArray e cria um unico JSONObject
		  JSONObject object = array.toJSONObject(list);
		  System.out.println("Final JSONOBject: " + object);
	}
	
	
	public static void JSONExampleArray2() {

		//Esse exemplo não faz uso de uma string inicial
		//Simplesmente cria um JSONArray zerado e vai adicionando os elementos

		  JSONArray array = new JSONArray();

		//Adiciona os valores
		array.put("value");
		array.put(5);
		array.put(-23.45e67);
		array.put(true);
		
		//Usa o metodo listNumberArray para criar as chaves
		//Associa essas chaves com o JSONArray de valores feito anteriormente criando um JSONObject
		 JSONArray list = listNumberArray(array.length());
		 JSONObject object = array.toJSONObject(list);
		 System.out.println("Final JSONOBject: " + object);
	}
	
		//Método que cria as chaves de um objeto JSON com base na quantidade de valores passados
		//usado no exemplo 1
		private static JSONArray listNumberArray(int max){
			 JSONArray res = new JSONArray();
			for (int i=0; i<max;i++) {
				//The value of the labels must be an String in order to make it work
				res.put(String.valueOf(i));
			}
			return res;
		}

}
