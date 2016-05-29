package cn.vipxiaomizhou.lazysmurobot.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.vipxiaomizhou.lazysmurobot.service.Service;
import cn.vipxiaomizhou.lazysmurobot.wechat.SignUtil;

/**
 * Servlet implementation class CoreServlet
 */
@WebServlet("/CoreServlet")
public class CoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
        // 微信加密签名
        String signature = request.getParameter("signature");
        // 时间戮
        String timestamp = request.getParameter("timestamp");
        // 随机数
        String nonce = request.getParameter("nonce");
        // 随机字符串
        String echostr = request.getParameter("echostr"); 
        PrintWriter out = response.getWriter();      
       if(SignUtil.checkSignature(signature, timestamp, nonce)){
           System.out.println(echostr);
    	   out.print(echostr);
       }
       out.close();
       out = null; 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("this is a test");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String respXml=null;
		try{
			respXml=Service.getResponse(request, response);
			//System.out.println(respXml);
		}catch(Exception e){
			e.printStackTrace();
		}
		if(respXml!=null)
			out.write(respXml);
		else{
			out.write("the service don't work!");
		}
		out.close();
	}

}
