package cn.vipxiaomizhou.lazysmurobot.message;

/**
 * ClassName :LinkMessage<br>
 * Desription:连接类消息.<br>
 * Author    :XiaoMiZhou.<br>
 * Date      :17th Apil 2016.<br>
 * Location  :Shanghai.<br>
 * Mail      :vipzhsh@163.com<br>
 */
public class LinkMessage extends Message{
	private String title;        //消息标题
	private String description;  //消息描述
	private String url;          //消息链接
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
