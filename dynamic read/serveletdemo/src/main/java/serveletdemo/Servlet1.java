package serveletdemo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet1 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException{
		System.out.println("Hello world");
		System.out.println("servlet is executed");
	}

}
