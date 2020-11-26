import java.util.;
import java.io.;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;it;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=a+b;
            for(int j=1; j=n; j++)
            {
                System.out.print(sum+ );
                sum+= (int)bMath.pow(2,j);
            }
            System.out.println();
            sum=0;
        }
        in.close();
        
    }
}