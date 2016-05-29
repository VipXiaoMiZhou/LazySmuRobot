package cn.vipxiaomizhou.lazysmurobot.spider;

import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URLEncoder;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 
 * @author ��Сʡ.<br>
 *         ClassName :TuLing.<br>
 *         Description:������վ��ȡ���ܻش�.<br>
 *         Author :XiaoMiZhou.<br>
 *         Date :3rd May 2016.<br>
 *         Loaction :Shanghai.<br>
 *         Email :vipzhsh@163.com.<br>
 *
 */
public class TuLingSpider extends Spider {
	@Override
	public void configConnection(HttpURLConnection connection)
			throws ProtocolException {
		// TODO Auto-generated method stub
	}

	@Override
	public String StartOpenUrl(String question) {
		String questionStr = null;
		String url = null;
		try {
			questionStr = URLEncoder.encode(question, "utf-8");
			url = "http://www.tuling123.com/openapi/api?key=90a1b18801a97cbc45eec14b87b9b6a6&info="
					+ questionStr;

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return parseStr(openUrl(url));
	}


	@Override
	public String parseStr(String str) {
		// TODO Auto-generated method stub
		String text = null;
		JSONObject json;
		try {
			json = new JSONObject(str);
			int code=(int) json.get("code");
			if(code!=100000)
				text="你说神马，敢不敢再说一边？";
			else 
				text=(String) json.get("text");
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return text;
	}
	
	public void test(String question) {
		System.out.println(StartOpenUrl(question));
	}

	public static void main(String args[]) {
		TuLingSpider tl = new TuLingSpider();
		tl.test("睡觉了！！");
	}

}
