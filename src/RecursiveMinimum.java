import java.util.ArrayList;
import java.util.Scanner;

public class RecursiveMinimum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (true)
        {
            System.out.print("Please enter numbers. Enter -1 to quit: ");
            int number = input.nextInt();

            if (number == -1)
            {
                break;
            }
            else
            {
                numbers.add(number);
            }
        }

        int minimum = findMinimum(numbers);
        System.out.println("Minimum: " + minimum);
    }

    public static int findMinimum(ArrayList<Integer> list) {
        // base case: if the list is empty, there is no minimum value
        if (list.size() == 0) {
            return 0;
        }

        // base case: if the list has only one element, that element is the minimum value
        if (list.size() == 1) {
            return list.get(0);
        }

        // recursive: split the list into two halves and recursively find the minimum in each half
        int mid = list.size() / 2;
        ArrayList<Integer> leftHalf = new ArrayList<>(list.subList(0, mid));
        ArrayList<Integer> rightHalf = new ArrayList<>(list.subList(mid, list.size()));
        int leftMin = findMinimum(leftHalf);
        int rightMin = findMinimum(rightHalf);

        // return the smaller of the two minimum values found in the recursive calls
        return Math.min(leftMin, rightMin);
    }
}