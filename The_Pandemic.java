import java.util.Scanner;
class main
{
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        int h;
        h=sc.nextInt();
        if(h<3)
        {
          System.out.println(h-1);
        }
        else
        {
            System.out.println(2);
        }
    }
}