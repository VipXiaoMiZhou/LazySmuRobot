package cn.vipxiaomizhou.lazysmurobot.spider;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;


/**
 * 
 * ClassName  :Spider.<br>
 * Description:鎵�鏈夌埇鍙栫綉椤佃祫婧愮被鐨勭埗绫�.<br>
 * Author     :XiaoMiZhou.<br>
 * Date       :27th Apil 2016.<br>
 * Location   :Shanghai.<br>
 * Mail       :vipzhsh@163.com.<br>
 */
public abstract class Spider {
	/**
	 * 
	 * @param url        闇�瑕佽姹傜綉椤佃祫婧愮殑url.
	 * @param connection 闇�瑕佽缃殑connect.
	 * @return           缃戦〉杩斿洖鐨勫瓧绗︿覆.
	 */
	public String openUrl(String url){
		String result=null;
		StringBuffer sb=new StringBuffer();
		BufferedReader reader=null;
		HttpURLConnection connection=null;
		try{
			URL requestUrl=new URL(url);
			connection=(HttpURLConnection) requestUrl.openConnection();
			configConnection(connection);
			connection.connect();
			InputStream inputStream=connection.getInputStream();
			reader=new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
			String line=null;
			while((line=reader.readLine())!=null)
				sb.append(line);
			result=sb.toString();
			return result;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			if(connection!=null)
				connection.disconnect();
		}
	}

	public void test(String url){
		System.out.println(openUrl(url));
	}
	/**
	 * 閰嶇疆connection.
	 * @param connection 
	 * @throws ProtocolException
	 */
	public abstract void configConnection(HttpURLConnection connection) throws ProtocolException ;
	
	public abstract Object parseStr(String str);
	
	public abstract Object StartOpenUrl(String question);
		
}
