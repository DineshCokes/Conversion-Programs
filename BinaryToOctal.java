public class BinaryToOctal {
 public static void main(String[] args) {
    int a=101101;
    int result=0;
    int result1=0;
    int remainder,remainder1;
    int i=0;
    int j=0;
    while(a!=0)
    {
        remainder=a%10;
        a=a/10;
        result=(int)(result+ remainder * Math.pow(2,i));
        i++;
        
    }
    System.out.println("Decimal Number is "+result);
    while (result!=0) {
        remainder1=result%8;
        result=result/8;
        result1=(int)(result1+remainder1*Math.pow(10, j++));
    }
    System.out.println("Octal Number is "+result1);
 }
}