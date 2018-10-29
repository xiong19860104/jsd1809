package testservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import sun.java2d.pipe.OutlineTextRenderer;

public class MyServlet extends HttpServlet{
	@Override
	public void service(ServletRequest reqeust,
			ServletResponse response) throws ServletException, IOException {
	    PrintWriter out=response.getWriter();
	    out.println("helloWorld");
	}

}
