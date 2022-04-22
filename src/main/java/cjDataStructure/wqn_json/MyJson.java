package cjDataStructure.wqn_json;

//import net.minidev.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyJson {
    public static void main(String[] args) {
        List<Map<String,Object>> test = new ArrayList<>();
        Map<String,Object> map01 = new HashMap<>();
        map01.put("name","北京");
        map01.put("value",1);
        test.add(map01);

        Map<String,Object> map02 = new HashMap<>();
        map02.put("name","上海");
        map02.put("value",2);
        test.add(map02);

        Map<String,Object> data = new HashMap<>();
        data.put("data00",test);
//        String s = JSONObject.toJSONString(data);
//        System.out.println(s);
    }
}
