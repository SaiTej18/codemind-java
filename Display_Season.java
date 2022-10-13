import java.util.Scanner;
class colour
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c,a=-1;
        c=sc.nextInt();
        if(c==4 || c==5 || c==6)
        System.out.println("Summer");
        else if(c==7 || c==8 || c==9 || c==10)
        System.out.println("Rainy");
        else if(c==11 || c==12 || c==1)
        System.out.println("Winter");
        else if(c==2 || c==3)
        System.out.println("Spring");
        else
        System.out.println(a);
        sc.close();
    }
}