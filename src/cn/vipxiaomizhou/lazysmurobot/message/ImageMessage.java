package cn.vipxiaomizhou.lazysmurobot.message;

/**
 * ClassName :ImageMessage<br>
 * Desription:图片消息.<br>
 * Author    :XiaoMiZhou.<br>
 * Date      :17th Apil 2016.<br>
 * Location  :Shanghai.<br>
 * Mail      :vipzhsh@163.com<br>
 */
public class ImageMessage extends Message{
	private String picUrl;
	private String mediaId;
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getMediaId() {
		return mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	
}
