public class DecimaltoHexaDecimal {
    public static void main(String[] args) {
       int n=2545;
       int i=0;
       int hexnum[]=new int[100];
       while(n!=0)
       {
        hexnum[i]=n%16;
        n=n/16;
        i++;
       }
       for(int j=i-1;j>=0;j--)
       {
        if(hexnum[j]>9)
        {
            System.out.print((char)(55+hexnum[j]));
        }
        else{
            System.out.print(hexnum[j]);
        }
       }

    }
}
