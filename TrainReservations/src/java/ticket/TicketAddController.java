/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import hiber.Passenger;
import hiber.Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import hiber.Ticketinfo;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Filmm
 */
public class TicketAddController extends HttpServlet {

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
            HttpSession session = request.getSession(true);
            int trainid = Integer.parseInt(request.getParameter("trainid"));
            int psgId = Integer.parseInt(request.getParameter("psgId"));
            String trainname = request.getParameter("trainname");
            String fromlocation = request.getParameter("fromlocation");
            String tolocation = request.getParameter("tolocation");
            String departureDate = request.getParameter("departuredate");
            int trainTravelId = Integer.parseInt(request.getParameter("trainTravelId"));
            String departuretime = request.getParameter("departuretime");
            String arrivaltime = request.getParameter("arrivaltime");
            String availableseat = request.getParameter("availableseat");
            int price = Integer.parseInt(request.getParameter("price"));
            //System.out.println(trainid+"---------------"+psgId+"----------"+fromlocation+"------------"+tolocation+"---------");
            //Object[] obj = {trainname, departuretime, arrivaltime, availableseat};
            String status = "Waitting ..";
            int psgQuantity = 1;
            Service service = new Service();
            int ticketId = service.getAllTicketinfo() + 1;
            Ticketinfo ticketinfo = new Ticketinfo(ticketId, psgId, trainTravelId, departureDate, status, psgQuantity, price);
            boolean saved = service.insertTicketInfo(ticketinfo);
            out.println(saved);
            session.setAttribute("trainname",trainname);
            session.setAttribute("departuretime",departuretime);
            session.setAttribute("arrivaltime" ,arrivaltime);
            session.setAttribute("lastTicket", ticketinfo);
            session.setAttribute("fromlocation",fromlocation);
            session.setAttribute("tolocation",tolocation);
            RequestDispatcher rd = request.getRequestDispatcher("TicketShowConfirm.jsp");
            rd.forward(request, response);
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
