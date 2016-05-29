package cn.vipxiaomizhou.lazysmurobot.bussiness;

import java.util.Map;

public class Dispatcher {
	static String response=null;
	public static String respon(Map<String,String> map){
		String msgType=map.get("MsgType");
		System.out.println(msgType);
		if(msgType.equals("text"))
			response=txt(map);
		else if(msgType.equals("event")){
			String eventKey=map.get("EventKey");
			System.out.println(eventKey);
			if(eventKey.equals("jwc_notice"))
				response=Jwc(map);
		}else 
			response=txt(map);
		return response;
	}
	
	private static String txt(Map<String,String>map){
		TextMsg txt=new TextMsg(map);
		return txt.packer();
	}
	
	private static String Jwc(Map<String, String>map){
		JwcMsg jwcMsg=new JwcMsg(map);
		return jwcMsg.packer();
	}
}
