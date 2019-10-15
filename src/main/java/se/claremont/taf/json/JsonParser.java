package se.claremont.taf.json;

public class JsonParser {

    public static String getParameterValue(String jsonBody, String parameterName){
        if(jsonBody == null || parameterName == null) return null;
        return new Json(jsonBody).get(parameterName);
    }
}
