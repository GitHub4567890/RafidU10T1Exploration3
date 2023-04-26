public class MoreStringFun
{
    public static void main(String [] args)
    {
        mystery("computer");
    }

    public static void mystery(String s)
    {
        if (s.length() > 1)
        {
            mystery(s.substring(2));
            System.out.print(s.substring(0, 1));
        }
    }
}
