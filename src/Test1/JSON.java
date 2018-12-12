package Test1;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.alibaba.fastjson.JSONObject;

public class JSON {
	public static void main(String[] args) {
		JSONObject json = new JSONObject();
		
		json.put("1", "1");
		json.put("2", "2");
		System.out.println(json);
		System.out.println(json.toJSONString());
		String str = "{\"1\":\"1\",\"2\":\"2\"}";
		System.out.println(JSONObject.parseObject(str));
		Date data = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyymmddHHMMss");
		String x = ft.format(data);
		System.out.println(x);
		
	}
}
