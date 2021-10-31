package manipularJSON;

import org.json.JSONObject;
import org.json.JSONStringer;

public class ManipularJSONStringer {
	public static void JSONExampleStringer() {

		JSONStringer jsonStringer = new JSONStringer();

		//permite a adição de valores ao JSONStringer a partir do metodo .object()
        jsonStringer.object();

        //elementos são adicionado com o uso conjunto dos metodos .key() e .value()
        jsonStringer.key("trueValue").value(true);
        jsonStringer.key("falseValue").value(false);
        jsonStringer.key("nullValue").value(null);
        jsonStringer.key("stringValue").value("hello world!");
        jsonStringer.key("complexStringValue").value("h\be\tllo w\u1234orld!");
        jsonStringer.key("intValue").value(42);
        jsonStringer.key("doubleValue").value(-23.45e67);

        //Finaliza a adição de elementos
        jsonStringer.endObject();

       //Transforma o JSONStringer em uma String e transforma a string em um JSONObject
        String str = jsonStringer.toString();
        JSONObject jsonObject = new JSONObject(str);
        
        System.out.println("Final JSONOBject: " + jsonObject);
	}
}
