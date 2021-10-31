package manipularJSON;

public class Main {
	public static void main(String[] args) {
		//Cria um JSONObject a partir de uma String passando por um JSONArray
		ManipularJSONArray.JSONExampleArray1();
		
		System.out.println("\n" + "-".repeat(20)+"\n");
		
		//Cria um JSONObject a partir de um JSONArray vazio em que vão sendo adicionados valores
		ManipularJSONArray.JSONExampleArray2();
		
		System.out.println("\n" + "-".repeat(20)+"\n");
		
		//Cria um JSONObject a partir de um JSONStringer
		ManipularJSONStringer.JSONExampleStringer();
		
		System.out.println("\n" + "-".repeat(20)+"\n");
		
		//Cria um JSONObject a partir de uma string
		ManipularJSONObject.JSONExampleObject1();
	
		System.out.println("\n" + "-".repeat(20)+"\n");
		
		//Cria um JSONObject zerado e adiciona elementos um a um
		ManipularJSONObject.JSONExampleObject2();
	
		System.out.println("\n" + "-".repeat(20)+"\n");
		
		//Cria um JSONObject a partir de um MAP
		ManipularJSONObject.JSONExampleObject3();
			
		System.out.println("\n" + "-".repeat(20)+"\n");
		
		//Cria um JSONObject a partir de um JSONWriter
		ManipularJSONWriter.JSONExamplWriter();
					
		System.out.println("\n" + "-".repeat(20)+"\n");
		
		//Cria um JSONObject a partir de um JSONTokener
		ManipularJSONWriter.JSONExampleTokener();
							
		System.out.println("\n" + "-".repeat(20)+"\n");
		
	}
}
