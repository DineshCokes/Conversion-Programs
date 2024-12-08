public class DecimaltoBinary {
    public static void main(String[] args) {
        int a=198;
        int remainder;
        int result=0;
        int i=0;
        while(a!=0)
        {
            remainder=a%2;
            a=a/2;
            result=(int)(result+remainder*Math.pow(10, i++));
        }
        System.out.println("Binary Number is "+result);
    }
    
}
