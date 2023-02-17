
public class Aula3_Ex02
{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 1;
        int c = 0;
        for(int cont = 1; cont <= 30; cont++)
        {
            System.out.println(b);
            c = a;
            a = b;
            b = c;
            b += a;
        }
    }
}