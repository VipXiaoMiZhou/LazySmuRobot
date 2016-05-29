package cn.vipxiaomizhou.lazysmurobot.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import cn.vipxiaomizhou.lazysmurobot.bussiness.Dispatcher;

/**
 * 
 * @author carvin.<br>
 * ClassName  :Service.<br>
 * Description:服务类，完成消息的判断，分发.<br>
 * Author:XiaoMiZhou.<br>
 * Version:2.0.<br>
 * Loaction:Fanghua Road in Shanghai.<br>
 * Email   :vipzhsh@163.com.<br>
 *
 */
public class Service {
	
	/**
	 * 
	 * @param request
	 * @param response
	 * @return 返回消息.
	 */
	private static String responseStr;
	private static Map<String,String> msgMap;
	public static String getResponse(HttpServletRequest request,HttpServletResponse response) throws IOException, DocumentException{
		msgMap =parseReq(request,response);
		responseStr=Dispatcher.respon(msgMap);
		return responseStr;
	};
	
	/**
	 * 
	 * @param response
	 * @param response
	 * @return 返回微信公众号推送的消息.
	 * @throws IOException 
	 * @throws DocumentException 
	 */
	private static Map<String,String> parseReq(HttpServletRequest request,HttpServletResponse response) throws IOException, DocumentException{
		Map<String, String> map=new HashMap<String, String>();
		SAXReader reader=new SAXReader();
		InputStream inputStream=request.getInputStream();
		Document document=reader.read(inputStream);
		Element root=document.getRootElement();
		List<Element> elements=root.elements();
		for (Element element : elements) {
			map.put(element.getName(), element.getText());
			//System.out.println("<"+element.getName()+">"+element.getText()+"</"+element.getName()+">");
		}
		inputStream.close();
		inputStream=null;
		return map;
	}
}
