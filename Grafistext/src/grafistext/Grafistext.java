/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafistext;
import java.awt.*;
/**
 *
 * @author Cindy
 */
public class Grafistext extends Panel {
    Font f;
    String text = "Halo Kharisma";
    Grafistext() {
    setBackground(Color.GRAY);
}
   
    public void paint(Graphics g) {
    f = new Font ("Helvetica", Font.BOLD,48);
    
    //kotak hijau
    g.setColor(Color.GREEN);
    g.fillRect(8, 8, 355, 105);

    //warna hitam pinggiran
    g.setColor(Color.BLACK);
    g.drawRect(8, 8, 355, 105);
    g.setColor(Color.PINK);
    g.fillOval(10, 10, 330, 100);

    //diberi pinggiran warna merah setebal 3x
    g.setColor(Color.RED);
    g.drawOval(10, 10, 330, 102);
    g.drawOval(9, 9, 332, 102);
    g.drawOval(8, 8, 334, 104);

    //tulisan warna hitam font helvetica
    g.setColor(Color.BLACK);    
    g.setFont(f);
    g.drawString(text, 40, 75);  
    }
    public static void main(String[] args) {
    Frame f =  new Frame ("Testing Graphics Panel");
        Grafistext gp =  new Grafistext();
        f.add(gp);
        f.setSize(900, 900);
        f.setVisible(true);
    }
}