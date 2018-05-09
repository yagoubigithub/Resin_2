/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files_pa;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/FileUploadServlet")
    @MultipartConfig(maxFileSize = 10*1024*1024,maxRequestSize = 20*1024*1024,fileSizeThreshold = 5*1024*1024)


public class FileUploadServlet1 extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            try{
                Part part =request.getPart("file");
                 
         String Filename=extractFileName(part);
         
         String savePath=File.separator + Filename;
         
         File filesaveDir=new File(savePath);
         part.write(savePath + File.separator);
         out.println(part);
        
            }catch(Exception e){
                out.print(e+"hello world");
            }
             
         
        }
    }

 

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        processRequest(request, response);
    }

    
    
    
     private String extractFileName(Part part){
        String contenDisp=part.getHeader("content-disposition");
        String[] items =contenDisp.split(";");
        for (String s : items) {
            if(s.trim().startsWith("filename")){
                return s.substring(s.indexOf("=")+2,s.length() -1 );
            }
        }
        return "";
        
    }
}
