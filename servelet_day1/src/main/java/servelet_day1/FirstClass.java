package servelet_day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstClass extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("servlet is working ");
		
		String name=req.getParameter("personName");
		String qualification=req.getParameter("personQualification");
		

		PrintWriter printWriter = res.getWriter();
		printWriter.print(name+"\n"+qualification);
	}
}
