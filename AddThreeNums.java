import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AddThreeNums extends Applet implements ActionListener{
  TextField t1 = new TextField(10);
  TextField t2 = new TextField(10);
  TextField t3 = new TextField(10);
  TextField t4 = new TextField(10);
  Label l1 = new Label("First number: ");
  Label l2 = new Label("Second number: ");
  Label l3 = new Label("Third number: ");
  Label l4 = new Label("Sum: ");
  Button b = new Button("Add");
  public void init(){
    setLayout(new GridLayout(5,2,10,15));
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(l3);
    add(t3);
    add(l4);
    add(t4);
    add(b);
    b.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==b){
      int n1 = Integer.parseInt(t1.getText());
      int n2 = Integer.parseInt(t2.getText());
      int n3 = Integer.parseInt(t3.getText());
      t4.setText(" " + (n1+n2+n3));
    }
  }
}
