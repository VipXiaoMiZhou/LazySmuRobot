package cn.vipxiaomizhou.lazysmurobot.message;

/**
 * 
 * @author ��Сʡ.<br>
 * ClassName  :NewsMessage.<br>
 * Description:<br>
 * Author     :XiaoMiZhou.<br>
 * Date       :3rd May 2016.<br>
 * Loaction   :Shanghai.<br>
 * Email      :vipzhsh@163.com.<hr>
 */
public class NewsMessage extends Message{
	private String title;
	private String description;
	private String picUrl;
	private String url;
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
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
