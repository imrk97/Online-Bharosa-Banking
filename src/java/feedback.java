/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.java.swing.plaf.windows.resources.windows;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rohan
 */
public class feedback extends HttpServlet {

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
        try{
               String host = "smtp.gmail.com";
String to = "bharosabanking@gmail.com";//request.getParameter("to");


String from = "feedbackbharosabank@gmail.com";
String user_mail=request.getParameter("Email");
String to1=request.getParameter("Email");
String subject = request.getParameter("Subject");
String subject1 = "Regarding your FeedBack : "+request.getParameter("Subject");
String messageText =request.getParameter("Message");

String name=request.getParameter("Name");
String messageText1 =" Hi "+name+".  We have recieved your feedback. We will contact you as soon as possible";
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
props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");  
props.put("mail.smtp.socketFactory.fallback", "false"); 

 Session mailSession = Session.getInstance(props, 
    new javax.mail.Authenticator(){
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(
            "feedbackbharosabank@gmail.com", "obbbharosa");// Specify the Username and the PassWord
        }
  });
 // Set debug on the Session
 // Passing false will not echo debug info, and passing True will.

 mailSession.setDebug(sessionDebug);

// Instantiate a new MimeMessage and fill it with the
// required information.

Message msg = new MimeMessage(mailSession);
Message msg1 = new MimeMessage(mailSession);
msg.setFrom(new InternetAddress(from));
msg1.setFrom(new InternetAddress(from));
InternetAddress[] address = {new InternetAddress(to)};
InternetAddress[] address1 = {new InternetAddress(to1)};
msg.setRecipients(Message.RecipientType.TO, address);
msg1.setRecipients(Message.RecipientType.TO, address1);
msg.setSubject(subject);
msg1.setSubject(subject1);
msg.setSentDate(new Date());
msg1.setSentDate(new Date());
msg.setText("Hi my name is " +name+".\n\nMy Email is: "+user_mail+"."+"\n\nMy message is : \n\n"+messageText);
msg1.setText(messageText1+"\n\n\n Your feedback was:\n\n"+ messageText);

// Hand the message to the default transport service
// for delivery.
Transport.send(msg);
Transport.send(msg1);
out.println("<script> alert('Feedback sent to Our Mail');</script>");

out.println("<script>window.location.href='home.html'</script>");
        
            /* TODO output your page here. You may use following sample code. */
           
        }catch(Exception ex){}
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
