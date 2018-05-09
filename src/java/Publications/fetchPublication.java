/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Publications;

import Agent.Publication;
import DB.DBConnect;
import DB.PUBLICATION_DB;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Yagoubi
 */
@WebServlet(name = "fetchPublication", urlPatterns = {"/fetchPublication"})
public class fetchPublication extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
           DB.PUBLICATION_DB db = new PUBLICATION_DB();
            ArrayList<Publication> publications = db.SelectPublication();
            if (publications != null) {
               out.println("[");
                for (int i = 0; i < publications.size(); i++) {
                    Publication publication = publications.get(i);
                    if(publication != null){
                        out.println("{");
                    out.println("\"id\" : " + publication.getId() + ",");
                    out.println("\"date\" : \"" + publication.getDate() + "\",");
                    
                    out.println("\"firstname\" : \"" + publication.getFirstname() + "\",");
                    out.println("\"lastname\" : \"" + publication.getLastname() + "\",");
                    out.println("\"nom_article\" : \"" + publication.getNom_article() + "\",");
                    out.println("\"categorie\" : \"" + publication.getCategorie() + "\",");
                    out.println("\"color\" : \"" + publication.getColor() + "\",");
                    out.println("\"taille\" : \"" + publication.getTaille() + "\" ,");
                    out.println("\"description\" : \"" + publication.getDescription() + "\",");
                    out.println("\"prix\" : " + publication.getPrix() + " ,");
                    out.println("\"promo\" : " + publication.getPromo() + " ,");
                    out.println("\"image\" : \"" + publication.getImage() + "\",");
                     out.println("\"tel\" : \"" + publication.getTel() + "\"");
                    out.println("}");
                    if(i < publications.size()-1){
                        out.print(",");
                    }
                    }
                     
                }
                 out.println("]");

            } else {
                out.print("publications is null");
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
