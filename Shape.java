import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Shape extends Applet implements ActionListener{
  Button b1, b2;
  boolean drawCircle = false;
  boolean drawTriangle = false;
  public void init(){
    setLayout(new GridLayout(3,1));
    b1 = new Button("Circle");
    b2 = new Button("Triange");
    b1.addActionListener(this);
    b2.addActionListener(this);
    add(b1);
    add(b2);
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == b1){
        drawCircle = true;
    }
    else if(e.getSource() == b2){
      drawTriangle = true;
    }
    repaint();
  }
  public void paint(Graphics g){
    g.setColor(Color.red);
    if(drawCircle){
      g.drawOval(85,45,75,75);
    }
    else if(drawTriangle){
      g.drawLine(200,100,100,200);
      g.drawLine(100,150,150,100);
      g.drawLine(200,100,100,200);

    }
  }
}
