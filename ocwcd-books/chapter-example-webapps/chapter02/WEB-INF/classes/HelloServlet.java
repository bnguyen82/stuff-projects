import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet
{
	public void service(	HttpServletRequest request,
				HttpServletResponse response)
					throws ServletException,
					IOException
	{
		//Get the user’s name from request parameters
		String userName = request.getParameter("userName");

		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h3>Hello " + userName + "</h3>");
		pw.println("</body>");
		pw.println("</html>");
	}
}
