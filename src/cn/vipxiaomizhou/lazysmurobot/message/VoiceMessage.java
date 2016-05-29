package cn.vipxiaomizhou.lazysmurobot.message;

/**
 * ClassName :VoiceMessage<br>
 * Desription:语音消息.<br>
 * Author    :XiaoMiZhou.<br>
 * Date      :17th Apil 2016.<br>
 * Location  :Shanghai.<br>
 * Mail      :vipzhsh@163.com<br>
 */
public class VoiceMessage extends Message{
	private String mediaID;
	private String format;
	private String recongnition;    //开通语音识别以后，语音消息中会增加这个字段，内容是语音对应的文字
	
	public String getMediaID() {
		return mediaID;
	}
	public void setMediaID(String mediaID) {
		this.mediaID = mediaID;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getRecongnition() {
		return recongnition;
	}
	public void setRecongnition(String recongnition) {
		this.recongnition = recongnition;
	}
}
