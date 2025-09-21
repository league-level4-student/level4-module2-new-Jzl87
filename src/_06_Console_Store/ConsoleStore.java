package _06_Console_Store;

import java.util.Scanner;

import _02_Generics_Store.CandyCorn;
import _02_Generics_Store.Cart;
import _02_Generics_Store.Cheerios;
import _02_Generics_Store.Clothing;
import _02_Generics_Store.Food;
import _02_Generics_Store.FruitLoops;
import _02_Generics_Store.GummyWorm;
import _02_Generics_Store.NonFood;
import _02_Generics_Store.Toy;

public class ConsoleStore {

    /*
     * Write a program that simulates shopping in a store using the Scanner and
     * the classes in Generics_Store.
     * 
     * Note: You may need to modify existing code in Generics Store and/or add
     * additional items and pictures to fulfill all the requirements. You are
     * also free to add any additional methods or classes in Console Store that
     * might be helpful to you.
     * 
     * Requirements:
     * 
     * -Use Ternary operators in place of simple if/else statements and do-while
     * loops instead of while loops where appropriate.
     * 
     * - There should be at least four unique items the user can buy. These can
     * be food items, nonfood items or both.
     * 
     * - The user should have a stipend of money to spend and each item should
     * have its own price.
     * 
     * -The user should have the ability to add items to their cart, remove
     * items, view items or check out.
     * 
     * -The program should continue until the user chooses to check out.
     * 
     * -When the user checks out you should let them know if they do not have
     * enough money to purchase all their items and offer to put items back.
     * 
     * -If the user successfully purchases the items you should remove the
     * amount from their stipend, show them the pictures of what they bought and
     * print out a receipt showing their name, the individual prices of the
     * items and their total.
     */
	Scanner scanner = new Scanner(System.in);
	Cart <Food> StaterBrosCart;
	Cart <NonFood> AmazonCart;
	static boolean shopping = true;
	
	Double balanceRemaining = 30.00;
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	Cart <Food> StaterBrosCart = new Cart <Food>();
    	Cart <NonFood> AmazonCart= new Cart <NonFood>();
    	boolean shopping = true;
    	String name;
    	 
    	
    	Double balanceRemaining = 30.00;
    	
    	System.out.println("Hello, shopper. What is your name?");
    	name = scanner.nextLine();
    	
    	System.out.println("Welcome, " + name +"! What would you like to buy today? \n Please type what you would like from the following list. When done, write \"done\"");
    	
    	
    	//Adding/subtracting from cart
    	do {
    		System.out.println("We have: gummy worms, candy corn, toy, clothing, cheerios and fruit loops" );
    		
    		switch (scanner.nextLine()) {
    		case ("gummy worms"):
				StaterBrosCart.add(new GummyWorm());
    		case ("candy corn"):
				StaterBrosCart.add(new CandyCorn());
    		case ("cheerios"):
				StaterBrosCart.add(new Cheerios());
    		case ("fruit loops"):
				StaterBrosCart.add(new FruitLoops());
    		case ("clothing"):
				AmazonCart.add(new Clothing());
    		case ("toy"):
				AmazonCart.add(new Toy());
    		case ("done"):
    			shopping = false;
    		}
    		
    	} while (shopping);
    	
    	
    	
    	//Checking out
    	System.out.println("Thank you for shopping with us! Let us review your food cart! Type purchase after reviewing your cart!");
    	
    	System.out.println("Your food:");
    	StaterBrosCart.showCart();
    	System.out.println("Your food:");

    	if (scanner.nextLine().equals("purchase")) {
    		
    	}

    }

}
