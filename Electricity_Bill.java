import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        float b;
        String custmerid,name;
        custmerid=sc.nextLine();
        name=sc.nextLine();
        a=sc.nextInt();
        if(a<=199)
        {
            b=a*1.20f;
        }
        else if(a>=200 && a<400)
        {
            b=a*1.50f;
        }
        else if(a>=400 && a<600)
        {
            b=a*1.80f;
        }
        else
        b=a*2.00f;
        if(b>400)
        {
            b=b*0.15f+b;
        }
        else
        b=b+100;
        System.out.format("%.2f",b);
    }
}