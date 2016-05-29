package cn.vipxiaomizhou.lazysmurobot.bussiness;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import cn.vipxiaomizhou.lazysmurobot.jwc.JwcNotice;
import cn.vipxiaomizhou.lazysmurobot.jwc.JwcSpider;
import cn.vipxiaomizhou.lazysmurobot.message.NewsMessage;

public class JwcMsg extends SuperMessage{

	public JwcMsg(Map<String, String> map) {
		super(map);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String packer() {
		// TODO Auto-generated method stub
		String respStr;
		JwcSpider jwc=new JwcSpider();
		//��ȡ������Ϣ������
		List<JwcNotice> msgList=jwc.StartOpenUrl(null);
		
		List<NewsMessage> newsMsg=new ArrayList<NewsMessage>();
		NewsMessage newsMessage=null;
		for (JwcNotice jwcMsg :msgList ) {
			newsMessage=new NewsMessage();
			newsMessage.setToUserName(toUserName);
			newsMessage.setFromUserName(fromUserName);
			newsMessage.setMsgId(msgId);
			newsMessage.setCreateTime(new Date().getTime()+"");
			newsMessage.setTitle(jwcMsg.getTitle());
			newsMessage.setUrl(jwcMsg.getOrigineLink());
			newsMessage.setDescription(jwcMsg.getClickCount()+"\t"+jwcMsg.getInfoSource());
			newsMessage.setPicUrl("http://p5.qhimg.com/t015c179810023fd216.jpg");
			newsMsg.add(newsMessage);	
		} 
		respStr=MsgPacker.messageToXml(newsMsg);
		return respStr;
	}
}
