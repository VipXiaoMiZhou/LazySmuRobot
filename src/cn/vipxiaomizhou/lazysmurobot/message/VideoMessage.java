package cn.vipxiaomizhou.lazysmurobot.message;


/**
 * ClassName :VideoMessage<br>
 * Desription:视频消息.<br>
 * Author    :XiaoMiZhou.<br>
 * Date      :17th Apil 2016.<br>
 * Location  :Shanghai.<br>
 * Mail      :vipzhsh@163.com<br>
 */
public class VideoMessage extends Message{
	private String mediaId;
	private String thumbMediaId;
	public String getMediaId() {
		return mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	public String getThumbMediaId() {
		return thumbMediaId;
	}
	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}
	
	
}
