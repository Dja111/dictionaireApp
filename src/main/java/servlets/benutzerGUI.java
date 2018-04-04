package servlets;


import Application.dictApp;
import dbadapter.DBFacade;
import dbadapter.list;
import dbadapter.suchens;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class benutzerGUI extends HttpServlet {



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    if (request.getParameter("wort1") != null){
					suchens resultat = null;
					
					try{
						resultat = dictApp.getInstance().forwardSuchen(request.getParameter("wort1"));

                request.setAttribute("suchenvonWort", resultat);

                request.getRequestDispatcher("/tamplates/suchrepresentation.ftl").forward(request, response);

                //request.getRequestDispatcher("/tamplates/suchrepresentation.ftl").forward(request, response);
            }
					catch (Exception e) {
                request.getRequestDispatcher("/tamplates/fail.flt").forward(request, response);
                e.printStackTrace();
            }
				} 
						else if((request.getParameter("wort") != null) && (request.getParameter("bedeutung")!=null)){

                String rep = "Ihr neues Wort mit Bedeutung wurde Hinzugefügt Danke";
				
				
														
                try {
                    dictApp.getInstance().forwardmerken(request.getParameter("wort"),request.getParameter("bedeutung"));

						request.setAttribute("reponse",rep);

                    request.getRequestDispatcher("/tamplates/merken.ftl").forward(request,response);

                }catch (Exception e){
                    request.getRequestDispatcher("/tamplates/failrepresentation.flt").forward(request, response);
                    e.printStackTrace();

                }



        }else {
            ArrayList<list> answer = null;
	        try {
	            answer = dictApp.getInstance().abfragen();
	            request.setAttribute("list",answer);
	            request.getRequestDispatcher("/tamplates/list.ftl").forward(request,response);
	            
            }catch (Exception e){
                request.getRequestDispatcher("/tamplates/failrepresentation.flt").forward(request, response);
	            e.printStackTrace();
            }
        }
				doGet(request, response);	
	
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}