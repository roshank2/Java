import java.io.*;
public class File
{
             public static void main(String args[])throws IOException
        {
              FileInputStream Fread =new FileInputStream("givenfile.txt");
              FileOutputStream Fwrite=new FileOutputStream("anotherfile.txt") ;
              int c;
              System.out.print("Contents of givenfile: ");
              while((c=Fread.read())!=-1){
                  Fwrite.write((char)c);
                  System.out.print((char) c);
              }
              System.out.println();
              System.out.println("File copies Successfully");
              Fread.close();
              Fwrite.close();
         }
}
