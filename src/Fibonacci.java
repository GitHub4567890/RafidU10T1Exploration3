public class Fibonacci
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.print(fibonacci(i) + " ");
        }
    }


    private static int fibonacci(int x)
    {
        if(x == 0 || x == 1)
        {
            return 1;
        }

        // double recursive method call!
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
}
