
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.Timer;

public class MyPanel extends JPanel implements ActionListener{
final int PANEL_WIDTH = 500;
final int PANEL_HEIGHT = 500;
Image enemy;
Image backgroundImage;
Timer timer;
int xVelocity = 1;
int yVelocity = 1;
int x = 0;
int y = 0;

MyPanel() {
this.setPreferredSize(new Dimension(PANEL_HEIGHT, PANEL_WIDTH));
this.setBackground(Color.black);

enemy = new ImageIcon("src/bro.png").getImage();

timer = new Timer(1000, this);
timer.start();


}


public void paint(Graphics g) {

super.paint(g);

    Graphics2D g2D =(Graphics2D) g;

    g2D.drawImage(enemy,x, y, null );
    
}

@Override
public void actionPerformed(ActionEvent e) {
    if(x >= PANEL_WIDTH-enemy.getWidth(null)  || x<0){
xVelocity = xVelocity *-1;

    }
    x = x + xVelocity;
    if(y >= PANEL_WIDTH-enemy.getWidth(null)  || y<0){
        yVelocity = yVelocity *-1;
        
            }
            y = y + yVelocity;
            repaint();
    repaint();
}
}
