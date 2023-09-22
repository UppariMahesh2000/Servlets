package Registration_forms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Student1  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println(" Accessed succes ");
		
		String name=req.getParameter("personName");
		String fatherName=req.getParameter("fatherName");
		String Age=req.getParameter("Age");
		String DOB=req.getParameter("DOB");
		String Address=req.getParameter("Address");
		String PhoneNumber=req.getParameter("PhoneNumber");
		
	

		PrintWriter printWriter = res.getWriter();
		printWriter.print(name+"\n"+fatherName+"\n"+Age+"\n"+DOB+"\n"+Address+"\n"+PhoneNumber);
		
	}
}
