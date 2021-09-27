/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
/**
 *
 * @author ankitaindi
 */
public class Person {
    
    
    private String name;
    private String Geographicdata;
    private String Dob;
    private String  Telephonenum;
    private String Faxnum;
    private String EmailID;
    private String SSN;
    private String Medicalrecordnum;
    private String  Healthplannum;
    private String  Bankaccnum;
    private String licensenum;
    private String vehiclelicensenum;
    private String Deviceidentifier;
    private String Linkedin;
    private String Internetprotocaladdr;
   // private String biometricidentifier;
    private String uniqueidentifier;
    private String path;

   

    public void setPath(String path) {
        this.path = path;
    }

  

    public void getImage()
    {
        JFrame editorFrame = new JFrame("Image Demo");

        BufferedImage image = null;
        try
        {
        image = ImageIO.read(new File(path));
        }
        catch (Exception e)
        {
        e.printStackTrace();
        System.exit(1);
        }

        ImageIcon imageIcon = new ImageIcon(fitimage(image, 700, 700));
        JLabel jLabel = new JLabel();
        jLabel.setIcon(imageIcon);
        editorFrame.getContentPane().add(jLabel, BorderLayout.CENTER);

        editorFrame.pack();
        editorFrame.setLocationRelativeTo(null);
        editorFrame.setVisible(true);
}
    private Image fitimage(Image img , int w , int h)
{
    BufferedImage resizedimage = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
    Graphics2D g2 = resizedimage.createGraphics();
    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
    g2.drawImage(img, 0, 0,w,h,null);
    g2.dispose();
    return resizedimage;
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeographicdata() {
        return Geographicdata;
    }

    public void setGeographicdata(String Geographicdata) {
        this.Geographicdata = Geographicdata;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    public String getTelephonenum() {
        return Telephonenum;
    }

    public void setTelephonenum(String Telephonenum) {
        this.Telephonenum = Telephonenum;
    }

    public String getFaxnum() {
        return Faxnum;
    }

    public void setFaxnum(String Faxnum) {
        this.Faxnum = Faxnum;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String EmailID) {
        this.EmailID = EmailID;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getMedicalrecordnum() {
        return Medicalrecordnum;
    }

    public void setMedicalrecordnum(String Medicalrecordnum) {
        this.Medicalrecordnum = Medicalrecordnum;
    }

    public String getHealthplannum() {
        return Healthplannum;
    }

    public void setHealthplannum(String Healthplannum) {
        this.Healthplannum = Healthplannum;
    }

    public String getBankaccnum() {
        return Bankaccnum;
    }

    public void setBankaccnum(String Bankaccnum) {
        this.Bankaccnum = Bankaccnum;
    }

    public String getLicensenum() {
        return licensenum;
    }

    public void setLicensenum(String licensenum) {
        this.licensenum = licensenum;
    }

    public String getVehiclelicensenum() {
        return vehiclelicensenum;
    }

    public void setVehiclelicensenum(String vehiclelicensenum) {
        this.vehiclelicensenum = vehiclelicensenum;
    }

    public String getDeviceidentifier() {
        return Deviceidentifier;
    }

    public void setDeviceidentifier(String Deviceidentifier) {
        this.Deviceidentifier = Deviceidentifier;
    }

    public String getLinkedin() {
        return Linkedin;
    }

    public void setLinkedin(String Linkedin) {
        this.Linkedin = Linkedin;
    }

    public String getInternetprotocaladdr() {
        return Internetprotocaladdr;
    }

    public void setInternetprotocaladdr(String Internetprotocaladdr) {
        this.Internetprotocaladdr = Internetprotocaladdr;
    }

  

    public String getUniqueidentifier() {
        return uniqueidentifier;
    }

    public void setUniqueidentifier(String uniqueidentifier) {
        this.uniqueidentifier = uniqueidentifier;
    }

    public void setText(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
