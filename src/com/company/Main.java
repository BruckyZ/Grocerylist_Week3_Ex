

package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        /*
        * Create an array list of strings to store the grocery list
        * */

        ArrayList<GroceryItem> ShoppingCart = new ArrayList<GroceryItem>();


        String entered = "";
        String item = "";
        double price=0;
        double Calculate=0;
        Scanner keyboard = new Scanner(System.in);

        do
        {
            GroceryItem grocerieitems1 = new GroceryItem();

            System.out.print("Enter a Grocery Item:");
            grocerieitems1.setName(keyboard.nextLine());

            System.out.print("Enter the price for the Item:");
            grocerieitems1.setPrice(keyboard.nextLine());

            //GroceryItem grocerieitemscombined = new GroceryItem();
            //grocerieitemscombined

            System.out.print("Do you want to continue?");
            entered = keyboard.nextLine();

            ShoppingCart.add(grocerieitems1);

        }

        while (entered.equalsIgnoreCase("y") || !entered.equalsIgnoreCase("n"));

        for (GroceryItem grocerylist : ShoppingCart)

        {
            //System.out.println(grocerylist.getOrange());

            System.out.println(grocerylist.getName());
            System.out.println(grocerylist.getPrice());
            System.out.println(price+grocerylist.getPrice());
        }
    }
}

