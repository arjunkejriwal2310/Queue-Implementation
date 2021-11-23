// Arjun Kejriwal (Class of 2024)

import java.util.Scanner;

public class UseQueue
{
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("How many guests are there?");
        int guests = keyboard.nextInt();

        CS112QueueInterface myQ = new CS112QueueB(guests);

        System.out.println("What is the value of N?");
        int N = keyboard.nextInt();

        for (int i = 1; i <= guests; i++)
        {
            myQ.enqueue(i);
        }
        myQ.writeQueue();

        int pasta = myQ.dequeue();
        System.out.println("");
        System.out.println("The person in seat " + pasta + " just got their hair pastaed");
        myQ.writeQueue();

        for (int i = 0; i < guests - 2; i++)
        {
            for (int j = 0; j < N - 1; j++)
            {
                int safe = myQ.dequeue();
                myQ.enqueue(safe);
            }

            pasta = myQ.dequeue();
            System.out.println("");
            System.out.println("The person in seat " + pasta + " just got their hair pastaed");
            myQ.writeQueue();
        }

        int winner = myQ.peek();
        System.out.println("");
        System.out.println("The person in seat " + winner + " gets the gold coin");
    }
}