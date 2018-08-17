/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class admin_deposit extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
            DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
            Calendar calobj = Calendar.getInstance();
            String date = df.format(calobj.getTime());
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            Connection con = DriverManager.getConnection(url, "ob_banking", "1234");

            String accno = request.getParameter("accno");
            int amount = Integer.parseInt(request.getParameter("amount")), num = 0;
            String sql = "select * from customer where account=?";
            PreparedStatement ps1 = con.prepareStatement(sql);
            ps1.setString(1, accno);
            ResultSet rs = ps1.executeQuery();

            if (rs.next()) {
                    String newmemail = rs.getString("email");
                String newname = rs.getString("name");
                int p_balance = Integer.parseInt(rs.getString("balance"));
                
                int n_balance = p_balance + amount;
                String sql2 = "update customer set balance=? where account=?";
                PreparedStatement ps2 = con.prepareStatement(sql2);
                ps2.setInt(1, n_balance);
                ps2.setString(2, accno);
                ps2.executeUpdate();

                String sql3 = "insert into a" + accno + " values(?,?,?,?,?)";
                PreparedStatement ps3 = con.prepareStatement(sql3);
                ps3.setString(1, "Deposit");
                ps3.setInt(2, amount);
                ps3.setInt(3, 0);
                ps3.setInt(4, n_balance);
                ps3.setString(5, date);

                num = ps3.executeUpdate();

            
            if (num > 0) {
                
                //String m_pass = rs.getString("password");
                String host = "smtp.gmail.com";
                String to = newmemail;

                String from = "bharosabanking@gmail.com";

                String subject = "Account Money Transfer";
                String messageText = "Hi " + newname + ",\n" + amount + " INR has been deposited to your account.";

                boolean sessionDebug = false;
// Create some properties and get the default Session.
                Properties props = System.getProperties();
                props.put("mail.host", host);
                props.put("mail.transport.protocol", "smtp");
                props.setProperty("mail.transport.protocol", "smtp");
                props.setProperty("mail.host", "smtp.gmail.com");
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.port", "465");
                props.put("mail.debug", "true");
                props.put("mail.smtp.socketFactory.port", "465");
                props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
                props.put("mail.smtp.socketFactory.fallback", "false");

                Session mailSession = Session.getInstance(props,
                        new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(
                                "bharosabanking@gmail.com", "obbbharosa");// Specify the Username and the PassWord
                    }
                });
                // Set debug on the Session
                // Passing false will not echo debug info, and passing True will.

                mailSession.setDebug(sessionDebug);

// Instantiate a new MimeMessage and fill it with the
// required information.
                Message msg = new MimeMessage(mailSession);
                msg.setFrom(new InternetAddress(from));
                InternetAddress[] address = {new InternetAddress(to)};
                msg.setRecipients(Message.RecipientType.TO, address);
                msg.setSubject(subject);
                msg.setSentDate(new Date());
                msg.setText(messageText);
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Amount Deposited..!!');");
                out.println("location='adminpage.jsp';");
                out.println("</script>");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Amount Cannot be deposited..!!');");
                out.println("location='adminpage.jsp';");
                out.println("</script>");
            }}
        } catch (Exception e) {
            out.print(e);
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
