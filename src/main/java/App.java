import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kieran Jimenez
 */
/*
 *           "Pizza Party" output
 *How many people? 8
 *How many pizzas do you have? 2
 *How many slices per pizza? 8
 *8 people with 2 pizzas (16 slices)
 *Each person gets 2 pieces of pizza.
 *There are 0 leftover pieces.
 */
public class App
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("How many people? ");
        int numPeople = in.nextInt();
        System.out.print("How many pizzas do you have? ");
        int numPizza = in.nextInt();
        System.out.print("How many slices per pizza? ");
        int numSlices = in.nextInt();

        int totalSlices = numSlices * numPizza;

        System.out.printf("%d people with %d pizzas (%d slices)\n", numPeople, numPizza, totalSlices);

        int leftovers = totalSlices%numPeople;
        totalSlices -= leftovers;
        System.out.printf("Each person gets %d pieces of pizza.\n", totalSlices/numPeople);
        System.out.printf("There are %d leftover pieces.", leftovers);
    }
}