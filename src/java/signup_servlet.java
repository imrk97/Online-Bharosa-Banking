
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Array.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author SILAJIT
 */
public class signup_servlet extends HttpServlet {

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
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            Connection con = DriverManager.getConnection(url, "ob_banking", "1234");
            String name = request.getParameter("name");
            long mobno = Long.parseLong(request.getParameter("Mobno"));
            String Email = request.getParameter("Email");
            long accno = Long.parseLong(request.getParameter("accno"));
            long aadharno = Long.parseLong(request.getParameter("aadharno"));
            String password = request.getParameter("password");
            String sql = "insert into customer values(?,?,?,?,?,?,?,?,?,?)";
            DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
            Calendar calobj = Calendar.getInstance();
            String date = df.format(calobj.getTime());
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setLong(2, mobno);
            ps.setString(3, Email);
            ps.setLong(4, accno);
            ps.setLong(5, aadharno);
            ps.setString(6, password);
            ps.setLong(7, 0);
            ps.setInt(8, 0);
            ps.setInt(9, 0);
            ps.setString(10, date);
            int result = ps.executeUpdate();
            if (result > 0) {
                String sql2 = "create table a" + accno + "(particulars varchar2(100),credit number(10),debit number(10),balance number(15),dates varchar2(20))";
                PreparedStatement ps2 = con.prepareStatement(sql2);
                int result2 = ps2.executeUpdate();

                String sql3 = "insert into a" + accno + " values(?,0,0,0,?)";
                PreparedStatement ps3 = con.prepareStatement(sql3);
                
                ps3.setString(2, date);
                ps3.setString(1, "Account Opened");
                int result3 = ps3.executeUpdate();
               
               
                String host = "smtp.gmail.com";
                String to = Email;//request.getParameter("to");    

                String from = "bharosabanking@gmail.com";

                String subject = "Online Banking Registration";
                String messageText = "Thank You For Registering on Online Bharosa Banking.\n"+"Your Account ID: "+accno+"\nPassword: "+password;

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
                msg.setSentDate(new java.util.Date());
                msg.setText(messageText);

// Hand the message to the default transport service
// for delivery.
                Transport.send(msg);
                if (result3 > 0) {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Successfully Signed UP..!!');");
                    out.println("location='jsp_signin.jsp';");
                    out.println("</script>");
                }
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Account Exists..!!');");
                out.println("location='forgetpassword.jsp';");
                out.println("</script>");
            }
        } catch (Exception e) {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Account Exists..!!');");
            out.println("location='forgetpassword.jsp';");
            out.println("</script>");
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
