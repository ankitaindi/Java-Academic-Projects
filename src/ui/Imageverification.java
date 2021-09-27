package ui;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Imageverification
{
 String imageupload()  
  {
    JFrame editorFrame = new JFrame("Image verification");
    //  editorFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    FileDialog fd = new FileDialog(editorFrame, "Open", FileDialog.LOAD);  
    fd.show();
    String path = (fd.getDirectory() + fd.getFile());  
    return path;
//    BufferedImage image = null;
//    try
//    {
//    image = ImageIO.read(new File(path));
//    }
//    catch (Exception e)
//    {
//    e.printStackTrace();
//    System.exit(1);
//    }
//    ImageIcon imageIcon = new ImageIcon(image);
//    JLabel jLabel = new JLabel();
//    jLabel.setIcon(imageIcon);
//    editorFrame.getContentPane().add(jLabel, BorderLayout.CENTER);
//
//    editorFrame.pack();
//    editorFrame.setLocationRelativeTo(null);
//    editorFrame.setVisible(true);

        }
}