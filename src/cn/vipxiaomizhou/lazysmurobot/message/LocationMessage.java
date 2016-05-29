package cn.vipxiaomizhou.lazysmurobot.message;

/**
 * ClassName :LocaitonMessage<br>
 * Desription:地理位置消息.<br>
 * Author    :XiaoMiZhou.<br>
 * Date      :17th Apil 2016.<br>
 * Location  :Shanghai.<br>
 * Mail      :vipzhsh@163.com<br>
 */
public class LocationMessage extends Message{
	private String location_X;   //纬度
	private String location_Y;   //经度
	private String scale;        //地图缩放的大小
	private String label;        //地理位置信息
	public String getLocation_X() {
		return location_X;
	}
	public void setLocation_X(String location_X) {
		this.location_X = location_X;
	}
	public String getLocation_Y() {
		return location_Y;
	}
	public void setLocation_Y(String location_Y) {
		this.location_Y = location_Y;
	}
	public String getScale() {
		return scale;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
}
