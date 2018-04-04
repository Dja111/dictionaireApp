package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class welcome extends HttpServlet {
    private static final long serialversionUID =1L;

    protected  void doGet(HttpServletRequest request , HttpServletResponse response){
        request.setAttribute("pagetitle","Willkommen");

        try {
            request.getRequestDispatcher("/tamplates/defaultpage.ftl").forward(request,response);
        }catch (ServletException e){
            request.setAttribute("errormessage","Template error");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    protected  void doPost(HttpServletRequest request,HttpServletResponse response){
        doGet(request,response);
    }
}
