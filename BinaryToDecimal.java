public class BinaryToDecimal {
    public static void main(String[] args) {
        int a=100110;
        int remainder;
        int result=0;
        int i=0;
        while (a!=0) {
            remainder=a%10;
            a=a/10;
            result = (int)(result+remainder*Math.pow(2, i++));
        }
        System.out.println("Decimal Number is "+result);
    }
    
}
