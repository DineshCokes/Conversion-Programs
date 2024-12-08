public class OctaltoDecimal {
    public static void main(String[] args) {
        int number=560;
        int remainder;
        int result=0;
        int i=0;
        while (number!=0) {
            remainder=number%10;
            number=number/10;
            result=(int)(result+remainder*Math.pow(8, i++));
        }
        System.out.println("Decimal number is "+result);
    }
}
