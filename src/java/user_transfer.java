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
import javax.servlet.http.HttpSession;
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
import javax.servlet.RequestDispatcher;

/**
 *
 * @author SILAJIT
 */
public class user_transfer extends HttpServlet {

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
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            HttpSession session = request.getSession();
            String usraccnt = session.getAttribute("accnos").toString();
            String accno = request.getParameter("accno");
            if (accno.equals(usraccnt)) {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Cannot Transfer money to same account..!!');");
                out.println("location='userpage.jsp';");
                out.println("</script>");
            } else {
                int usr_balance, f_balance;
                int money = Integer.parseInt(request.getParameter("ammount"));
                DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                Calendar calobj = Calendar.getInstance();
                String date = df.format(calobj.getTime());
                Class.forName("oracle.jdbc.driver.OracleDriver");
                String url = "jdbc:oracle:thin:@localhost:1521:XE";
                Connection con = DriverManager.getConnection(url, "ob_banking", "1234");
                String sql1 = "select * from customer where account=?";
                PreparedStatement ps1 = con.prepareStatement(sql1);
                PreparedStatement ps2 = con.prepareStatement(sql1);
                ps1.setString(1, usraccnt);
                ResultSet rs1 = ps1.executeQuery();
//                ps2.setString(1, accno);
//                ResultSet rs2 = ps2.executeQuery();
                
                if (rs1.next()) {
                    usr_balance = Integer.parseInt(rs1.getString("balance"));
                    if (money <= usr_balance) {
                        f_balance = usr_balance - money;
                        String sql2 = "update customer set balance=? where account=?";
                        PreparedStatement ps10 = con.prepareStatement(sql2);
                        ps10.setInt(1, f_balance);
                        ps10.setString(2, usraccnt);
                        int num1 = ps10.executeUpdate();

                        String sql3 = "insert into a" + usraccnt + " values(?,?,?,?,?)";
                        PreparedStatement ps3 = con.prepareStatement(sql3);
                        ps3.setString(1, "Transfered To " + accno);
                        ps3.setInt(2, 0);
                        ps3.setInt(3, money);
                        ps3.setInt(4, f_balance);
                        ps3.setString(5, date);
                        int num2 = ps3.executeUpdate();
                        int usr_balance2, f_balance2;
                        String sql4 = "select * from customer where account=?";
                        PreparedStatement ps4 = con.prepareStatement(sql4);
                        ps4.setString(1, accno);
                        ResultSet rs3 = ps4.executeQuery();
                        if (rs3.next()) {
//                            String useremail = rs1.getString("email");
//                String username=rs1.getString("name");
//                String beggername=rs2.getString("name");
//                String beggeremail = rs2.getString("email");
                            usr_balance2 = Integer.parseInt(rs3.getString("balance"));
                            f_balance2 = usr_balance2 + money;
                            String sql5 = "update customer set balance=? where account=?";
                            PreparedStatement ps5 = con.prepareStatement(sql5);
                            ps5.setInt(1, f_balance2);
                            ps5.setString(2, accno);
                            int num3 = ps5.executeUpdate();

                            String sql6 = "insert into a" + accno + " values(?,?,?,?,?)";
                            PreparedStatement ps6 = con.prepareStatement(sql6);
                            ps6.setString(1, "Transfered From " + usraccnt);
                            ps6.setInt(2, money);
                            ps6.setInt(3, 0);
                            ps6.setInt(4, f_balance2);
                            ps6.setString(5, date);
                            int num4 = ps6.executeUpdate();
                            if (num4 > 0) {
                                
//
//                                String host = "smtp.gmail.com";
//                                String to = beggeremail;//request.getParameter("to");
//
//                                String from = "bharosabanking@gmail.com";
//                                
//                                String to1 =useremail;
//                                String subject = "Account Money Transfer";
//                               
//                                String messageText ="Hi "+ beggername+",/n"+username+" Account No: "+usraccnt+"has transferred "+money+" INR to your account on "+date ;
//                                String messageText1 ="Hi "+ username+",/n"+"Your have Transferred "+money+" INR to "+beggername+"Account No: "+accno+" on "+date ;
//
//                                
//                                boolean sessionDebug = false;
//// Create some properties and get the default Session.
//                                Properties props = System.getProperties();
//                                props.put("mail.host", host);
//                                props.put("mail.transport.protocol", "smtp");
//                                props.setProperty("mail.transport.protocol", "smtp");
//                                props.setProperty("mail.host", "smtp.gmail.com");
//                                props.put("mail.smtp.auth", "true");
//                                props.put("mail.smtp.port", "465");
//                                props.put("mail.debug", "true");
//                                props.put("mail.smtp.socketFactory.port", "465");
//                                props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//                                props.put("mail.smtp.socketFactory.fallback", "false");
//
//                                Session mailSession = Session.getInstance(props,
//                                        new javax.mail.Authenticator() {
//                                    protected PasswordAuthentication getPasswordAuthentication() {
//                                        return new PasswordAuthentication(
//                                                "bharosabanking@gmail.com", "obbbharosa");// Specify the Username and the PassWord
//                                    }
//                                });
//                                // Set debug on the Session
//                                // Passing false will not echo debug info, and passing True will.
//
//                                mailSession.setDebug(sessionDebug);
//
//// Instantiate a new MimeMessage and fill it with the
//// required information.
//                                Message msg = new MimeMessage(mailSession);
//                                Message msg1 = new MimeMessage(mailSession);
//                                msg.setFrom(new InternetAddress(from));
//                                msg1.setFrom(new InternetAddress(from));
//                                InternetAddress[] address = {new InternetAddress(to)};
//                                InternetAddress[] address1 = {new InternetAddress(to1)};
//                                msg.setRecipients(Message.RecipientType.TO, address);
//                                msg1.setRecipients(Message.RecipientType.TO, address1);
//                                msg.setSubject(subject);
//                                msg1.setSubject(subject);
//                                msg.setSentDate(new java.util.Date());
//                                msg1.setSentDate(new java.util.Date());
//                                msg.setText(messageText);
//                                msg1.setText(messageText1);
//
//// Hand the message to the default transport service
//// for delivery.
//                                Transport.send(msg);
//                                Transport.send(msg1);
                                out.println("<script type=\"text/javascript\">");
                                out.println("alert('Amount Transferred Successfully..!!');");
                                out.println("location='userpage.jsp';");
                                out.println("</script>");
                            }
                        }
                    }

                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('You Dont have Enough Money..!!');");
                    out.println("location='userpage.jsp';");
                    out.println("</script>");
                

            }
        } }catch (Exception e) {
          out.println(e);
//            out.println("<script type=\"text/javascript\">");
//            out.println("alert('Please Signin to continue..!!');");
//            out.println("location='jsp_signin.jsp';");
//            out.println("</script>");
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
