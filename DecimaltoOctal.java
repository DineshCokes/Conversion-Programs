public class DecimaltoOctal {
    public static void main(String[] args) {
        int a=106;
        int remainder;
        int result=0;
        int i=0;
        while (a!=0) {
            remainder=a%8;
            a=a/8;
            result=(int)(result+remainder*Math.pow(10, i++));
        }
        System.out.println("Octal Number is "+result);
    }
}
