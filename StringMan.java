public class StringMan{
  public static void main(String[] args){
    String st = "lol";
    System.out.println("String: " + st);
    int len = st.length();
    System.out.println("Length: " + len);
    st = st.toUpperCase();
    System.out.println("Upper case: " + st);
    boolean palindrome = true;
    for(int i=0;i<len/2;i++){
      if(st.charAt(i)!=st.charAt(len-i-1)){
        palindrome = false;
        break;
      }
    }
    if(palindrome){
      System.out.println("Given string is a palindrome");
    }else{
      System.out.println("Not a palindrome");
    }
  }
}
