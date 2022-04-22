package cjDataStructure.wqn_json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Wqn_Jackson_main {
    //jackson序列化: 从javaBean到json
    @Test
    public void beanToJson(){
        Wqn_Jackson Wqn_Jackson = new Wqn_Jackson();
        Wqn_Jackson.setName("zhangsan");
        Wqn_Jackson.setEmail("zhangsan@163.com");
        Wqn_Jackson.setAge(20);

        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Wqn_Jackson.setBirthday(dateformat.parse("1996-10-01"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        /**
         * ObjectMapper是JSON操作的核心，Jackson的所有JSON操作都是在ObjectMapper中实现。
         * ObjectMapper有多个JSON序列化的方法，可以把JSON字符串保存File、OutputStream等不同的介质中。
         * writeValue(File arg0, Object arg1)把arg1转成json序列，并保存到arg0文件中。
         * writeValue(OutputStream arg0, Object arg1)把arg1转成json序列，并保存到arg0输出流中。
         * writeValueAsBytes(Object arg0)把arg0转成json序列，并把结果输出成字节数组。
         * writeValueAsString(Object arg0)把arg0转成json序列，并把结果输出成字符串。
         */
        ObjectMapper mapper = new ObjectMapper();

        //Wqn_Jackson类转JSON
        //输出结果：{"name":"zhangsan","age":20,"birthday":844099200000,"email":"zhangsan@163.com"}
        String json = null;
        try {
            json = mapper.writeValueAsString(Wqn_Jackson);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


        //Java集合转JSON
        //输出结果：[{"name":"zhangsan","age":20,"birthday":844099200000,"email":"zhangsan@163.com"}]
        List<Wqn_Jackson> Wqn_Jacksons = new ArrayList<Wqn_Jackson>();
        Wqn_Jacksons.add(Wqn_Jackson);
        String jsonlist = null;
        try {
            jsonlist = mapper.writeValueAsString(Wqn_Jacksons);
            System.out.println(jsonlist);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }

    //jackson序列化: 从javaBean到json
    @Test
    public void jsonToBean(){
        String json = "{\"name\":\"zhangsan\",\"age\":20,\"birthday\":844099200000,\"email\":\"zhangsan@163.com\"}";
        /**
         * ObjectMapper支持从byte[]、File、InputStream、字符串等数据的JSON反序列化。
         */
        ObjectMapper mapper = new ObjectMapper();
        Wqn_Jackson Wqn_Jackson = null;
        try {
            Wqn_Jackson = mapper.readValue(json, Wqn_Jackson.class);
            System.out.println(Wqn_Jackson);
        } catch (IOException e) {
            e.printStackTrace();
        }


        String json02 = "[{\"name\":\"zhangsan\",\"age\":20,\"birthday\":844099200000,\"email\":\"zhangsan@163.com\"}]";
        List<Wqn_Jackson> beanList = null;
        try {
            beanList = mapper.readValue(json02, new TypeReference<List<Wqn_Jackson>>() {});
            System.out.println(beanList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
