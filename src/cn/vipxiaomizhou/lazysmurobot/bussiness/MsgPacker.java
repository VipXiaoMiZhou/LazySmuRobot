package cn.vipxiaomizhou.lazysmurobot.bussiness;

import java.util.List;


import cn.vipxiaomizhou.lazysmurobot.message.ImageMessage;
import cn.vipxiaomizhou.lazysmurobot.message.LinkMessage;
import cn.vipxiaomizhou.lazysmurobot.message.MusicMessage;
import cn.vipxiaomizhou.lazysmurobot.message.NewsMessage;
import cn.vipxiaomizhou.lazysmurobot.message.TextMessage;
import cn.vipxiaomizhou.lazysmurobot.message.VideoMessage;

/**
 * 
 * @author ��Сʡ.<br>
 * ClassName  :MsgPacker.<br>
 * Description:��װ��Ϣ.<br>
 * Author     :XiaoMiZhou.<br>
 * Date       :3rd May 2016.<br>
 * Loaction   :Shanghai.<br>
 * Email      :vipzhsh@163.com.<hr>
 * 
 */
public class MsgPacker {
	public static String messageToXml(TextMessage message){
		
		String xml="<xml>"
				+ "<ToUserName><![CDATA["+message.getToUserName()+"]]></ToUserName>"
				+ "<FromUserName><![CDATA["+message.getFromUserName()+"]]></FromUserName>"
				+ "<CreateTime>"+message.getCreateTime()+"</CreateTime>"
				+ "<MsgType><![CDATA[text]]></MsgType>"
				+ "<Content><![CDATA["+message.getContent()+"]]></Content>"
				+ " <MsgId>"+message.getMsgId()+"</MsgId>"
				+ "</xml>";
		return xml;
	}
	
	public static String messageToXml(ImageMessage message){
		String xml="<xml>"
				+ "<ToUserName><![CDATA["+message.getToUserName()+"]]></ToUserName>"
				+ "<FromUserName><![CDATA["+message.getFromUserName()+"]]></FromUserName>"
				+ "<CreateTime>"+message.getCreateTime()+"</CreateTime>"
				+ "<MsgType><![CDATA[image]]></MsgType>"
				+ "<Image>"
				+ "<MediaId><![CDATA["+message.getMsgId()+"]]></MediaId>"
				+ "</Image>";
		return xml;
	}
	
	public static String messageToXml(LinkMessage message){
		return "null";
	}
	
	public static String messageToXml(VideoMessage message){
		return "null";
	}
	
	public static String messageToXml(MusicMessage message){
		String xml="<xml>"
				+ "<ToUserName><![CDATA["+message.getToUserName()+"]]></ToUserName>"
				+ "<FromUserName><![CDATA["+message.getFromUserName()+"]]></FromUserName>"
				+ "<CreateTime>"+message.getCreateTime()+"</CreateTime>"
				+ "<MsgType><![CDATA[music]]></MsgType>"
				+ "<Music>"
				+ "<Title><![CDATA["+message.getTitle()+"Title#####]]></Title>"
				+ "<Description><![CDATA["+message.getDescription()+"]]></Description>"
				+ "<MusicUrl><![CDATA["+message.getMusicUrl()+"]]></MusicUrl>"
				+ "<HQMusicUrl><![CDATA["+message.getHqMusicUrl()+"]]></HQMusicUrl>"
				+ "<ThumbMediaId><![CDATA["+message.getThumbMediaId()+"]]></ThumbMediaId>"
				+ "</Music>"
				+ "</xml>";
		return xml;
	}
	
	public static String messageToXml(List<NewsMessage> message){
		StringBuffer sb=new StringBuffer();
		int count=message.size();
		int i=0;
		NewsMessage news=null;
		if(count>0)
			news=message.get(0);
		String toUser=news.getToUserName();
		String formUser=news.getFromUserName();
		String createTime=news.getCreateTime();
		
		String xml="<xml>"
				+ "<ToUserName><![CDATA["+toUser+"]]></ToUserName>"
				+ "<FromUserName><![CDATA["+formUser+"]]></FromUserName>"
				+ "<CreateTime>"+createTime+"</CreateTime>"
				+ "<MsgType><![CDATA[news]]></MsgType>"
				+ "<ArticleCount>"+count+"</ArticleCount>"
				+ "<Articles>";
		sb.append(xml);
		for (NewsMessage newsMessage : message) {
			sb.append("<item>");
			sb.append("<Title><![CDATA["+newsMessage.getTitle()+"]]></Title>");
			sb.append("<Description><![CDATA["+newsMessage.getDescription()+"]]></Description>");
			sb.append("<PicUrl><![CDATA["+newsMessage.getPicUrl()+"]]></PicUrl>");
			sb.append("<Url><![CDATA["+newsMessage.getUrl()+"]]></Url>");
			sb.append("</item>");
		}
		sb.append("</Articles></xml>");
		return sb.toString();
	}
	
}
