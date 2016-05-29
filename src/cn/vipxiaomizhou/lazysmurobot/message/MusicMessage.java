package cn.vipxiaomizhou.lazysmurobot.message;

/**
 * 
 * @author ��Сʡ.<br>
 * ClassName  :MusicMessage.<br>
 * Description:Music.<br>
 * Author     :XiaoMiZhou.<br>
 * Date       :3th May 2016.<br>
 * Loaction   :Shanghai.<br>
 * Email      :vipzhsh@163.com.<hr>
 *
 */
public class MusicMessage extends Message{
	private String title;
	private String description;
	private String musicUrl;
	private String hqMusicUrl;
	private String thumbMediaId;
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
	public String getMusicUrl() {
		return musicUrl;
	}
	public void setMusicUrl(String musicUrl) {
		this.musicUrl = musicUrl;
	}
	public String getHqMusicUrl() {
		return hqMusicUrl;
	}
	public void setHqMusicUrl(String hqMusicUrl) {
		this.hqMusicUrl = hqMusicUrl;
	}
	public String getThumbMediaId() {
		return thumbMediaId;
	}
	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}
	
}
