import javax.servlet.*;
import java.io.*;

public class MyServlet implements Servlet {
    ServletConfig config = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.print("<html><body>");  
        out.print("<h1>Merhaba Servlet</h1>");  
        out.print("<a href='/myservletexample'>Anasayfa</h1>");  
        out.print("</body></html>");  
    }

    @Override
    public void destroy() {
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public String getServletInfo() {
        return "Ömer Aytekin";
    }
}