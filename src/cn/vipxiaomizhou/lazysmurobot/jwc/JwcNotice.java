package cn.vipxiaomizhou.lazysmurobot.jwc;

/**
 * 
 * @author 张小省
 * ClassName :JwcNotice.<br>
 * Secription:保存教务处发布的信息.<br>
 * Author    :XiaoMiZhou.<br>
 * Date      :28th Apil 2016.<br>
 * Location  :Shanghai.<br>
 * Email     :vipzhsh@163.com.<br>
 */
public class JwcNotice {
	private String title;         //通知标题 
	private String infoSource;    //信息来源
	private String createTime;    //发布时间
	private String noticeContent; //通知内容
	private String origineLink;   //原文链接
	private String clickCount;    //点击次数
	
	public String getClickCount() {
		return clickCount;
	}
	public void setClickCount(String clickCount) {
		this.clickCount = clickCount;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInfoSource() {
		return infoSource;
	}
	public void setInfoSource(String infoSource) {
		this.infoSource = infoSource;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public String getOrigineLink() {
		return origineLink;
	}
	public void setOrigineLink(String origineLink) {
		this.origineLink = origineLink;
	}
}
