import java.applet.*; 
import java.awt.*; 
import java.awt.event.*; 
public class GenerateTable extends Applet 
{ 
int count,n,i; 
TextField t1; 

public void init() 
{ 
t1 = new TextField(10); 
add(t1); 
t1.setText(""); 
} 

public void paint(Graphics g) 
{ 
String str; 
g.drawString("Enter the number",100,20); 
try 
{ 
str=t1.getText(); 
n=Integer.parseInt(str); 
} 
catch(Exception e) { } 
if(n>=1 && n<=10) 
{ 
count=100; 
for(i=1;i<=10;i++) 
{ 
g.drawString(i+" * "+n+" = "+(i*n),100,count); 
count = count+20; 
} 
} 
} 

public boolean action(Event event, Object obj) 
{ 
repaint(); 
return true; 
} 
}
