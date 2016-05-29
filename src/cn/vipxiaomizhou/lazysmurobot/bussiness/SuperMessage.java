package cn.vipxiaomizhou.lazysmurobot.bussiness;

import java.util.Map;

public abstract class SuperMessage {
	protected String toUserName;
	protected String fromUserName;
	protected String msgId;
	
	public SuperMessage(Map<String, String> map){
		toUserName=map.get("FromUserName");
		fromUserName=map.get("ToUserName");
		msgId=map.get("MsgId");
	}
	public abstract String packer();	
}
