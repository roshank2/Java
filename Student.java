import java.util.Scanner;

public class Student{
  private int enNo;
  private String name;
  private String address;
  private String progOfStudy;
  private int age;

  Student(){}

  Student(int enNo, String name, String address, String progOfStudy, int age){
    this.enNo = enNo;
    this.name = name;
    this.address = address;
    this.progOfStudy = progOfStudy;
    this.age = age;
  }
  public void getInfo(){
    try{
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter enrollment number: ");
      enNo = sc.nextInt();
      System.out.print("Enter name: ");
      name = sc.next() + sc.nextLine();
      System.out.print("Enter address: ");
      address = sc.nextLine();
      System.out.print("Enter progOfStudy: ");
      progOfStudy = sc.nextLine();
      System.out.print("Enter age: ");
      age = sc.nextInt();
    }catch(Exception e){
      System.out.println("Exception caught" + e);
    }
  }
  public void display(){
    System.out.println("\nStudent Information\n");
    System.out.println("Enrollment Number: " + enNo);
    System.out.println("Name: " + name);
    System.out.println("Address: " + address);
    System.out.println("Program of Study: " + progOfStudy);
    System.out.println("Age: " + age);
  }
  public static void main(String[] args){
    Student std = new Student(1765,"Roshan","SagarPur","BCA",21);
    //std.getInfo();
    std.display();
  }
}
