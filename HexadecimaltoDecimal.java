public class HexadecimaltoDecimal {
 public static void main(String[] args) {
    String a="1AB";
    int length=a.length();
    int dec=0;
    for(int i=0;i<length;i++)
    {
        char c=a.charAt(i);
        int digit=Character.digit(c,16);
        dec=dec*16+digit;
    }
    System.out.println(dec);
 }   
}
