import javax.servlet.*;
import java.io.*;

public class MyGenericServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");  
  
        PrintWriter out=response.getWriter();  
        out.print("<html><body>");  
        out.print("<h1>Merhaba Generic Servlet</h1>");  
        out.print("<a href='/myservletexample'>Anasayfa</h1>");  
        out.print("</body></html>");  
  
    }
    
}