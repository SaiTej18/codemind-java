import java.util.Scanner;
class sai
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,a,b;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        int found=0;
        for(int i=0;i<n;i++)
        {
            if(x[i]>=a && x[i]<=b)
            {
                System.out.print(x[i]+" ");
                found=1;
            }
        }
        if(found==0)
        System.out.println(-1);
    }
}