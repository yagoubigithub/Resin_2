/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form_p;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Yagoubi
 */
public class create_session extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       HttpSession session = request.getSession();
            /* TODO output your page here. You may use following sample code. */
           String logout=null;
            try {
           logout=request.getParameter("logout");

        } catch (Exception e) {
        }
            if( logout != null ){
                 session.removeAttribute("user_id");
             session.removeAttribute("firstname");
             session.removeAttribute("lastname");
             session.removeAttribute("email");
             session.removeAttribute("password");
             session.removeAttribute("tel");
             session.removeAttribute("city_id"); 
            }else{
               String id=request.getParameter("id");
            String firstname=request.getParameter("firstname");
            String lastname=request.getParameter("lastname");
            String email=request.getParameter("email");
            String password=request.getParameter("password");
            String tel=request.getParameter("tel");
            String city_id=request.getParameter("city_id");
           
            //create session
            
            
             session.setAttribute("user_id", id);
             session.setAttribute("firstname", firstname);
             session.setAttribute("lastname", lastname);
             session.setAttribute("email", email);
             session.setAttribute("password", password);
             session.setAttribute("tel", tel);
             session.setAttribute("city_id", city_id); 
              if (request.getParameter("rememberMe").equals("true")) {
                    Cookie emailCookie = new Cookie("email.resin.signin", email);
                    Cookie passwordCookie = new Cookie("password.resin.signin", password);
                    emailCookie.setMaxAge(60 * 60 * 24 * 30);
                    passwordCookie.setMaxAge(60 * 60 * 24 * 30);
                    response.addCookie(emailCookie);
                    response.addCookie(passwordCookie);
                }
            }
            
             
                
        
            
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
