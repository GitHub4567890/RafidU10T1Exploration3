import java.util.ArrayList;

public class ArrayListMystery
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(5);
        numList.add(7);
        numList.add(8);
        numList.add(5);
        numList.add(6);
        numList.add(5);
        numList.add(4);
        numList.add(1);
        System.out.println(mystery(numList, 5));
    }

    public static int mystery(ArrayList<Integer> list, Integer num)
    {
        Integer current;

        if (list.size() == 0)
        {
            return 0;
        }

        // recall the arraylist "remove" method returns the removed value!
        current = list.remove(0);

        // use equals here instead of == since we are comparing Integers, not ints
        if (current.equals(num))
        {
            return 1 + mystery(list, num);
        }
        return mystery(list, num);
    }
}
