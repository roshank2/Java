
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Roads extends Applet implements ActionListener{

  TextField t1, t2, t3;
  Label l1, l2, l3;
  Button b;

  public void init(){
    setLayout(new GridLayout(4,2,10,15));
    t1 = new TextField(10);
    t2 = new TextField(10);
    t3 = new TextField(10);
    l1 = new Label("Length of first road in metres: ");
    l2 = new Label("Length of second road in metres: ");
    l3 = new Label("Sum of first and Second roads in Kilometres: ");
    b = new Button("Add");
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(l3);
    add(t3);
    add(b);
    b.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource()==b){
      int n1 = Integer.parseInt(t1.getText());
      int n2 = Integer.parseInt(t2.getText());
      t3.setText(" " + (n1 + n2)/1000);
    }
  }
}
