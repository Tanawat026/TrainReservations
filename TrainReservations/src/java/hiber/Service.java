package hiber;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Service extends HttpServlet {
<<<<<<< HEAD

    public List searchTrainTravel(String search_ticketfrom, String search_ticketto) {
        String message = null;
        Session session = null;
        Transaction tx = null;
        List searchtrainList = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from Train as train where  train.fromLocation = '" + search_ticketfrom + "' and train.toLocation = '" + search_ticketto + "'");
            
           // Query query2 = session.createQuery("from Train as train,TrainDetail as trainde where train.trainTravelId = trainde.trainTravelId"
             //       + " and train.fromLocation = '%" + search_ticketfrom + "%'and train.toLocation = '%" + search_ticketto + "%' ");
            searchtrainList = (List<Train>) query.list();
          for(int i =0;i<=searchtrainList.size();i++){
            System.out.print(searchtrainList.get(i)+"******************************************");
            
          }
        } catch (Exception e) {
=======
    
    public boolean getAuthentication(String username, String password){
        Session session = null;
        Transaction tx = null;
        Passenger passenger = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from Passenger where username = '"+username+"' and password = '"+password+"'");
            passenger = (Passenger) query.list();      
            tx.commit();
        }catch (Exception e) {
>>>>>>> 393532fb35272b84d7dda27f75f458af77b7cb65
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
<<<<<<< HEAD
        return searchtrainList;
    }

=======
        
        return (passenger == null)? false : true;
    }
    
>>>>>>> 393532fb35272b84d7dda27f75f458af77b7cb65
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
<<<<<<< HEAD
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Service</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Service at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
=======
            
>>>>>>> 393532fb35272b84d7dda27f75f458af77b7cb65
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
