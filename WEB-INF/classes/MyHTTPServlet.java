import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class MyHTTPServlet extends HttpServlet {
    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        response.setContentType("text/html");//setting the content type  
        PrintWriter out=response.getWriter();//get the stream to write the data  
        
        //writing html in the stream  
        out.print("<html><body>");  
        out.print("<h1>Merhaba HTTP Servlet</h1>");  
        out.print("<a href='/myservletexample'>Anasayfa</h1>");  
        out.print("</body></html>");
    }
}