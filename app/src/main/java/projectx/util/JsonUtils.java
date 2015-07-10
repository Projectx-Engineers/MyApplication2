package projectx.util;

import com.google.gson.Gson;

/**
 * Created by yedids on 7/2/2015.
 */
public class JsonUtils {

    public static Gson gson = new Gson();

    public static String getJson(Object object){
        return gson.toJson(object);
    }

    public static Object getObject(String json, Class tClass){
        return gson.fromJson(json, tClass);
    }

}
