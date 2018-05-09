/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form_p;

import DB.DBConnect;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Agent.User;
import javax.servlet.http.Cookie;

/**
 *
 * @author Yagoubi
 */
@WebServlet(name = "siginin_s", urlPatterns = {"/siginin_s"})
public class siginin_s extends HttpServlet {

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
        DB.DBConnect db = new DBConnect();

        try (PrintWriter out = response.getWriter()) {
            User user = db.Auth(request.getParameter("email"), request.getParameter("password"));
            if (user == null) {
                out.print("Auth_error");
            } else {
                out.println("{");
                out.println("\"id\" : " + user.getId() + ",");
                out.println("\"firstname\" : \"" + user.getFirstname() + "\",");
                out.println("\"lastname\" : \"" + user.getLastname() + "\",");
                out.println("\"email\" : \"" + user.getEmail() + "\",");
                out.println("\"password\" : \"" + user.getPassword() + "\",");
                out.println("\"tel\" : \"" + user.getTel() + "\",");
                out.println("\"city_id\" : " + user.getCity_id());
                out.println("}");
               

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
