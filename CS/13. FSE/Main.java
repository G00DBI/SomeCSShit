/******************************************************************************

FSE
This program will let you choose which program we have learnt to run, and be able to go back afterwards
03/25/22
Evan Brundritt

*******************************************************************************/
import java.util.Scanner;
import java.text.NumberFormat;

public class Main
{
	public static void main(String[] args) {
		String Answer;
		int loop = 0;
		
		Scanner input = new Scanner(System.in);
		NumberFormat Percent = NumberFormat.getPercentInstance();
		NumberFormat Money = NumberFormat.getCurrencyInstance();
		
		while (loop == 0) {
		    System.out.print("\033[H\033[2J");
		    System.out.println("{ Final Summative Evaluation [0] }");
		    System.out.println("\n{1}-- Time Table");
		    System.out.println("{2}-- Shopping!");
		    System.out.println("{3}-- Making Purchases");
		    System.out.println("{4}-- Discounts");
		    System.out.println("{5}-- Making A Pizza");
		    System.out.println("{6}-- Positivity");
		    System.out.println("{7}-- For Loops");
		    System.out.println("{8}-- Counting Programs");
		    System.out.println("{9}-- Credits");
		    System.out.print("\ninput~# ");
		    Answer = input.next();
		    
		    if (Answer.equals("1")) {
		        loop = 1;
		    }
		    if (Answer.equals("2")) {
		        loop = 2;
		    }
		    if (Answer.equals("3")) {
		        loop = 3;
		    }
		    if (Answer.equals("4")) {
		        loop = 4;
		    }
		    if (Answer.equals("5")) {
		        loop = 5;
		    }
		    if (Answer.equals("6")) {
		        loop = 6;
		    }
		    if (Answer.equals("7")) {
		        loop = 7;
		    }
		    if (Answer.equals("8")) {
		        loop = 8;
		    }
		    if (Answer.equals("9")) {
		        loop = 9;
		    }
		while (loop == 1) {
		    System.out.print("\033[H\033[2J");
		    System.out.format("\n");
		    System.out.format("%10s", "School Schedule\n");
		    System.out.format("\n");
		    System.out.format("%1s", "----------------------------------------\n");
		    System.out.format("%-5s %5s %-5s %5s %5s", "|", "Period", "|", "Entrepreneurship", "|\n");
		    System.out.format("%-5s %6s %-5s %13s %8s", "|", "One", "|", "8:25 - 9:40", "|\n");
		    System.out.format("%1s", "|--------------------------------------|\n");
		    System.out.format("%-5s %5s %-5s %8s %13s", "|", "Period", "|", "English", "|\n");
		    System.out.format("%-5s %6s %-5s %13s %8s", "|", "Two", "|", "9:45 - 11:00", "|\n");
		    System.out.format("%1s", "|--------------------------------------|\n");
		    System.out.format("%-6s %5s %-6s %8s %12s", "|", "Lunch", "|", " ", "|\n");
		    System.out.format("%-5s %6s %-5s %13s %8s", "|", "", "|", "11:00 - 11:45", "|\n");
		    System.out.format("%1s", "|--------------------------------------|\n");
		    System.out.format("%-5s %5s %-5s %6s %15s", "|", "Period", "|", "Drama", "|\n");
		    System.out.format("%-5s %6s %-5s %13s %8s", "|", "Three", "|", "11:45 - 1:00", "|\n");
		    System.out.format("%1s", "|--------------------------------------|\n");
		    System.out.format("%-5s %5s %-5s %6s %9s", "|", "Period", "|", "Comp Science", "|\n");
		    System.out.format("%-5s %6s %-5s %13s %8s", "|", "Four", "|", "1:00 - 2:20", "|\n");
		    System.out.format("%1s", "----------------------------------------\n");
		    System.out.println("\n{99}-- Go Back");
		    System.out.print("\ninput~# ");
		    Answer = input.next();
		    
		    if (Answer.equals("99")) {
		        loop = 0;
		    }
		} // end loop 1
		
		while (loop == 2) {
		    int USBs;
		    int Keyboards;
		    int Mice;
		    Double USBsPrice = 19.99;
		    Double KeyboardsPrice = 49.99;
		    Double MicePrice = 25.99;
		    Double Tax = 1.13;
		    
		    
		    System.out.print("\033[H\033[2J");
		    System.out.print("USBs you would like to purchase : ");
		    USBs = input.nextInt();
		    System.out.print("Keyboards you would like to purchase : ");
		    Keyboards = input.nextInt();
		    System.out.print("Mice you would like to purchase : ");
		    Mice = input.nextInt();
		    
		    System.out.print("\nSubtotal : \n");
		    System.out.print("USBs : " + USBs );
		    USBsPrice = USBsPrice*USBs;
		    System.out.println(" - USB price : " + Money.format(USBsPrice));
		    
		    System.out.print("Keyboards : " + Keyboards );
		    KeyboardsPrice = KeyboardsPrice*Keyboards;
		    System.out.println(" - Keyboards price : " + Money.format(KeyboardsPrice));
		    
		    System.out.print("Mice : " + Mice );
		    MicePrice = MicePrice*Mice;
		    System.out.println(" - Mice price : " + Money.format(MicePrice) );
		    
		    Tax = USBsPrice+KeyboardsPrice+MicePrice;
		    Tax = 1.13*Tax;
		    Double TaxTotal = Tax-USBsPrice-KeyboardsPrice-MicePrice;
		    System.out.println("\nTax : " + Money.format(TaxTotal));
		    
		    System.out.println("\nGrand total : " + Money.format(Tax));
		    System.out.println("\n{99}-- Go Back");
		    System.out.print("\ninput~# ");
		    Answer = input.next();
		    
		    if (Answer.equals("99")) {
		        loop = 0;
		    }
		} // end loop 2
		
		while (loop == 3) {
		    int Cucumbers;
		    int Strawberries;
		    int Oranges;
		    int Apples;
		    int Kiwis;
		    int Bananas;
		    int Blueberries;
		    int Pineapples;
		    Double CucumbersPrice = 1.67;
		    Double StrawberriesPrice = 4.74;
		    Double OrangesPrice = 1.78;
		    Double ApplesPrice = 2.27;
		    Double KiwisPrice = 3.97;
		    Double BananasPrice = 0.62;
		    Double BlueberriesPrice = 1.40;
		    Double PineapplesPrice = 2.75;
		    Double Tax = 1.13;
		    
		    System.out.print("\033[H\033[2J");
		    System.out.print ("How many Cucumbers would you like to purchase (2.23/lb) : ");
		    Cucumbers = input.nextInt ();
		    System.out.print("How many Strawberries would you like to purchase ($4.74/lb) : ");
		    Strawberries = input.nextInt ();
		    System.out.print ("How many Oranges would you like to purchase ($1.78/lb) : ");
		    Oranges = input.nextInt ();
		    System.out.print ("How many Apples would you like to purchase ($2.27/lb) : ");
		    Apples = input.nextInt ();
		    System.out.print ("How many Kiwis would you like to purchase (3.97/lb) : ");
		    Kiwis = input.nextInt ();
		    System.out.print("How many Bananas would you like to purchase (0.62/lb) : ");
		    Bananas = input.nextInt ();
		    System.out.print("How many Blueberries would you like to purchase (1.40/lb) : ");
		    Blueberries = input.nextInt ();
		    System.out.print("How many Pineapples would you like to purchase (2.75/lb) : ");
		    Pineapples = input.nextInt ();
		    
		    System.out.println ("\n__________________________________________");
		    
		    System.out.print ("\nSubtotal : \n");
		    System.out.print ("Cucumbers : " + Cucumbers);
		    CucumbersPrice = CucumbersPrice * Cucumbers;
		    System.out.print (" - Cucumbers price : ");
		    System.out.println (Money.format(CucumbersPrice));
		    
		    System.out.print ("Strawberries : " + Strawberries);
		    StrawberriesPrice = StrawberriesPrice * Strawberries;
		    System.out.print (" - Strawberries price : ");
		    System.out.println (Money.format(StrawberriesPrice));
		    
		    System.out.print ("Oranges : " + Oranges);
		    OrangesPrice = OrangesPrice * Oranges;
		    System.out.print (" - Oranges price : ");
		    System.out.println (Money.format(OrangesPrice));
		    
		    System.out.print ("Apples : " + Apples);
		    ApplesPrice = ApplesPrice * Apples;
		    System.out.print (" - Apples price : ");
		    System.out.println (Money.format(ApplesPrice));
		    
		    System.out.print ("Kiwis : " + Kiwis);
		    KiwisPrice = KiwisPrice * KiwisPrice;
		    System.out.print (" - Kiwis price : ");
		    System.out.println (Money.format(KiwisPrice));
		    
		    System.out.print("Bananas : " + Bananas);
		    BananasPrice = BananasPrice * Bananas;
		    System.out.print(" - Bananas price : ");
		    System.out.println(Money.format(BananasPrice));
		    
		    System.out.print("Blueberries : " + Blueberries);
		    BlueberriesPrice = BlueberriesPrice * Blueberries;
		    System.out.print(" - Blueberries price : ");
		    System.out.println(Money.format(BlueberriesPrice));
		    
		    System.out.print("Pineapples : " + Pineapples);
		    PineapplesPrice = PineapplesPrice * Pineapples;
		    System.out.print(" - Pineapples price : ");
		    System.out.println(Money.format(PineapplesPrice));
		    
		    System.out.println ("___________________________________________\n");
		    Double Subtotal = CucumbersPrice + StrawberriesPrice + OrangesPrice + ApplesPrice + KiwisPrice + BananasPrice + BlueberriesPrice + PineapplesPrice;
		    System.out.print ("Subtotal : ");
		    System.out.println(Money.format(Subtotal));
		    
		    System.out.println ("__________________________________________");
		    
		    Tax = CucumbersPrice + StrawberriesPrice + OrangesPrice + ApplesPrice + KiwisPrice + BananasPrice + BlueberriesPrice + PineapplesPrice;
		    Tax = 1.13 * Tax;
		    Double TaxTotal = Tax - CucumbersPrice - StrawberriesPrice - OrangesPrice - ApplesPrice - KiwisPrice - BananasPrice - BlueberriesPrice - PineapplesPrice;
		    System.out.print ("\nTax : ");
		    System.out.println (Money.format(TaxTotal));
		    
		    System.out.println ("__________________________________________");
		    
		    System.out.print ("\nGrand total : ");
		    System.out.println (Money.format(Tax));
		    System.out.print ("__________________________________________");
		    
		    System.out.println("\n\n{99}-- Go Back");
		    System.out.print("\ninput~# ");
		    Answer = input.next();
		    
		    if (Answer.equals("99")) {
		        loop = 0;
		    }
		} // end loop 3
		
		while (loop == 4) {
		    Double Sale = 0.0;
		    Double Spent;
		    Double Total;
		    Double TotalSaved;
		    Double GrandTotal;
		    
		    System.out.print("\033[H\033[2J");
		    System.out.print("How much money did you spend : ");
		    Spent = input.nextDouble();
		    
		    if (Spent >= 120){
		        Sale = 0.4;
		    } else if (Spent >= 80.01){
		        Sale = 0.3;
		    } else if (Spent >= 40.01){
		        Sale = 0.2;
		    } else if (Spent >= 0.01){
		        Sale = 0.1;
		    }
		    
		    System.out.print("Sale : " + Percent.format(Sale));
		    TotalSaved = Spent * Sale;
		    GrandTotal = Spent - TotalSaved;
		    
		    System.out.println("\nTotal Saved : " + Money.format(TotalSaved));
		    System.out.print("Grand Total : " + Money.format(GrandTotal));
		    
		    System.out.println("\n\n{99}-- Go Back");
		    System.out.print("\ninput~# ");
		    Answer = input.next();
		    
		    if (Answer.equals("99")) {
		        loop = 0;
		    }
		} // end loop 4
		
		while (loop == 5) {
		    Double PizzaRent = 0.99;
		    Double PizzaCost = 0.5;
		    Double Labour = 0.75;
		    Double Tax;
		    Double GrandTotal;
		    Double Subtotal;
		    int Diameter;
		    
		    System.out.print("\033[H\033[2J");
		    System.out.print("Enter the diameter of the pizza (Centimeters) : ");
		    Diameter = input.nextInt();
		    
		    if (Diameter >=40){
		        System.out.println("\nWhoa, big pizza! You might need a truck to get this home!\n");
		    } else if (Diameter >=20){
		        System.out.println("\nThis will be delicious!\n");
		    } else if (Diameter >=1){
		        System.out.println("\nWe are going to make you a cute little pizza!\n");
		    }
		    
		    PizzaCost = Diameter * 0.5;
		    Subtotal = PizzaCost + PizzaRent + Labour;
		    Tax = Subtotal * 0.13;
		    GrandTotal = Subtotal + Tax;
		    
		    System.out.println("Subtotal : " + Money.format(Subtotal));
		    System.out.println("Taxes : " + Money.format(Tax));
		    System.out.println("Grand Total : " + Money.format(GrandTotal));
		    
		    System.out.println("\n{99}-- Go Back");
		    System.out.print("\ninput~# ");
		    Answer = input.next();
		    
		    if (Answer.equals("99")){
		        loop = 0;
		    }
		} // end loop 5
		
		while (loop == 6) {
		    System.out.print("\033[H\033[2J");
		    int Random = (int) (Math.random () * (8)+1);
		    
		    System.out.print("Your positive message is : ");
		    
		    switch (Random) {
		        case 1:
		            System.out.print("Believe in yourself!");
		            break;
		        
		        case 2:
		            System.out.print("You are amazing!");
		            break;
		        
		        case 3:
		            System.out.print("You are loved!");
		            break;
		        
		        case 4:
		            System.out.print("Dont give up!");
		            break;
		        
		        case 5:
		            System.out.print("Always try your hardest!");
		            break;
		        
		        case 6:
		            System.out.print("Nobody's perfect!");
		            break;
		        
		        case 7:
		            System.out.print("You always pass failure on the way to success!");
		            break;
		            
		        case 8:
		            System.out.print("It always seems impossible until it's done!");
		            break;
		            }
		            System.out.println("\n\n{99}-- Go Back");
		            System.out.print("\ninput~# ");
		            Answer = input.next();
		            
		            if (Answer.equals("99")) {
		                loop = 0;
		            }
		} // end loop 6
		
		while (loop == 7) {
		    String Answer1;
		    
		    System.out.print("\033[H\033[2J");
		    System.out.println("Choose the one you would like to see :");
		    System.out.println("A - Count from 0 to 10 by 1");
		    System.out.println("B - Count from 100 to 0 by 10");
		    System.out.println("C - Count from 50 to 500 by 50");
		    System.out.println("D - Count from 6000 to 1000 by 1000");
		    System.out.print("\ninput~# ");
		    Answer1 = input.next();
		    
		    if (Answer.equals("A") || Answer.equals("a")) {
		        for (int Num = 0; Num <11; Num = Num + 1)
		        System.out.println("Number : " + Num);
		    } 
		    if (Answer.equals("B") || Answer.equals("b")) {
		        for (int Num = 100; Num >= 0; Num = Num - 10)
		        System.out.println("Number : " + Num);
		    }
		    if (Answer.equals("C") || Answer.equals("c")) {
		        for (int Num = 50; Num <= 500; Num = Num + 50)
		        System.out.println("Number : " + Num);
		    }
		    if (Answer.equals("D") || Answer.equals("d")) {
		        for (int Num = 6000; Num >= 1000; Num = Num - 1000)
		        System.out.println("Number : " + Num);
		    }
		    System.out.println("\n{99}-- Go Back");
		    System.out.print("\ninput~# ");
		    Answer = input.next();
		    
		    if (Answer.equals("99")) {
		        loop = 0;
		    }
		} // end loop 7
		while (loop == 8) {
		    int Selection;
		    int ToNum;
		    
		    System.out.println("Counting Program!");
		    System.out.println("\n{1}-- Count up");
		    System.out.println("{2}-- Count down");
		    System.out.print("\ninput~# ");
		    Answer = input.next();
		    
		    if (Answer.equals("1")) {
		        System.out.print("Please Make A Selection : ");
		        Selection = input.nextInt();
		        System.out.print("To What Number : ");
		        ToNum = input.nextInt();
		        
		        while (Selection <= ToNum) {
		            System.out.println(Selection);
		            Selection = Selection + 1;
		        }
		    }
		    if (Answer.equals("2")) {
		        System.out.print("Please Make A Selection : ");
		        Selection = input.nextInt();
		        System.out.print("To What Number : ");
		        ToNum = input.nextInt();
		        
		        while (Selection >= ToNum) {
		            System.out.println(Selection);
		            Selection = Selection - 1;
		        }
		    }
		    System.out.println("\n{99}-- Go Back");
		    System.out.print("\ninput~# ");
		    Answer = input.next();
		    
		    if (Answer.equals("99")) {
		        loop = 0;
		    }
		} // end loop 8
		
		while (loop == 9) {
		    System.out.print("\033[H\033[2J");
		    System.out.println("      CREDITS      ");
		    System.out.println(" { Made By : Evan }");
		    System.out.println(" { Made In 1 Day }");
		    System.out.println(" { Thank You For The Great Class");
		    System.out.println("\n{99}-- Go Back");
		    System.out.print("\ninput~# ");
		    Answer = input.next();
		    
		    if (Answer.equals("99")) {
		        loop = 0;
		    }
		} // end loop 9
		} // end loop 0
	}
}
