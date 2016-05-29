package cn.vipxiaomizhou.lazysmurobot.bussiness;

import java.util.Date;
import java.util.Map;

import cn.vipxiaomizhou.lazysmurobot.message.TextMessage;
import cn.vipxiaomizhou.lazysmurobot.spider.TuLingSpider;

public class TextMsg extends SuperMessage {
	private String content;
	private TuLingSpider tl;
	public TextMsg(Map<String, String> map) {
		super(map);
		// TODO Auto-generated constructor stub
		content = map.get("Content");
		tl=new TuLingSpider();
	}

	@Override
	public String packer() {
		// TODO Auto-generated method stub
		String respStr = null;
		TextMessage txt = new TextMessage();
		txt.setToUserName(super.toUserName);
		txt.setFromUserName(super.fromUserName);
		txt.setCreateTime(new Date().getTime() + "");
		txt.setMsgId(super.msgId);
		//txt.setContent(new TuLing().StartOpenUrl(content));
		txt.setContent(tl.StartOpenUrl(content));
		respStr = MsgPacker.messageToXml(txt);
		return respStr;
	}

}
