import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		//�� �� ������ �� ���� ���Ͽ� ����Ͻÿ�(4~100)
		study.MyCalc calc = new study.MyCalc();
		int start = 4;
		int end = 100;
		int sum = calc.myHap(start, end);
		System.out.println(sum);
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println(sum);
	}
}