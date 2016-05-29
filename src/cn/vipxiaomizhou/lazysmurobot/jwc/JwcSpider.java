package cn.vipxiaomizhou.lazysmurobot.jwc;

import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import cn.vipxiaomizhou.lazysmurobot.spider.Spider;
public class JwcSpider extends Spider{
	
	@Override
	public void configConnection(HttpURLConnection connection)
			throws ProtocolException {
		// TODO Auto-generated method stub
		connection.setRequestMethod("GET");   //get 请求方式
	}

	@Override
	public Object parseStr(String str) {
		// TODO Auto-generated method stub
		//获取文件信息 document
		ArrayList<JwcNotice> noticArr=new ArrayList<>();
		Document document=Jsoup.parse(str);
		Elements newElement = document.getElementsByClass("top_center_list_2");
		for (Element l : newElement) {
			Elements children = l.children();
			for (Element c : children) {
				Elements li = c.children();				
				// 鏍囩a
				Elements aElements = c.getElementsByTag("a");
				for (Element a : aElements) {
					// 鐖彇鐨勪俊鎭�
					String title = a.attr("title");
					// 鐖彇淇℃伅鐨勯摼鎺�
					String href = "http://jwc.shmtu.edu.cn/" + a.attr("href");
					//System.out.println(a.attr("title")+"   "+"http://jwc.shmtu.edu.cn/"+a.attr("href"));
					//System.out.println(href);
					noticArr.add(notice(href));
				}
			}
		}
		return noticArr;
	}

	private JwcNotice notice(String noticeUrl){
		if (noticeUrl == null)
			return null;
		String htmlStr = null;
		JwcNotice jwcNotice = null;
		htmlStr = openUrl(noticeUrl);
		Document document = Jsoup.parse(htmlStr);

		Element title = document.getElementById("title"); // 閫氱煡棰樼洰
		Element infoSource = document.getElementById("lblFrom"); // 淇℃伅鏉ユ簮
		Element createTime = document.getElementById("lblCreateDate"); // 鍙戝竷鏃堕棿
		Element clickCount = document.getElementById("lblClickCount"); // 鐐瑰嚮浜烘暟
		//Element content = document.getElementById("content"); // 閫氱煡姝ｆ枃
		
		jwcNotice = new JwcNotice();
		
		jwcNotice.setTitle(title.text());
		jwcNotice.setInfoSource(infoSource.text());
		jwcNotice.setOrigineLink(noticeUrl);
		jwcNotice.setCreateTime(createTime.text());
		//jwcNotice.setNoticeContent(content.html());
		jwcNotice.setClickCount(clickCount.text());
		 
		 
		 //System.out.println(content.html());		 
		return jwcNotice;
	}
	@Override
	public ArrayList<JwcNotice> StartOpenUrl(String a) {
		// TODO Auto-generated method stub
		String htmlStr=openUrl("http://jwc.shmtu.edu.cn/");   //打开网页，得到网页的数据
		
		return (ArrayList<JwcNotice>) parseStr(htmlStr);
	}
	public static void main(String args[]){
		new JwcSpider().StartOpenUrl(null);
	}
}
