 
 
/** 
* *** This project was done by : *** 
* 
* ABD ALRAHMAN MOHAMAD BASSAM S.SHEIKH SALEM B2015.010134 
* 
* course code : COM128 
* 
* 
* Project title : UBER SYSTEM 
*/ 
 import java.util.Scanner;
import java.time.LocalDate; // import the LocalDate class import 
import java.time.LocalTime; // import the LocalTime class import java.util.Scanner; 
public class UberSystem { 
 
 /** 
* @param args the command line arguments 
 **/ 
 
//Fields 
 public static double baesFareUberX = 2.55, baesFareUberXL = 3.85, baesFareUberXBlack 
= 7; 
 public static double costPerMinuteUberX = 0.35, costPerMinuteUberXL = 0.5, 
costPerMinuteUberXBlack = 0.65; public static double costPerKmX = 1.75, costPerKmXL 
= 2.85, costPerKmXBlack = 3.75; public static double minimumFeeX = 8, minimumFeeXL 
= 10.5, minimumFeeXBlack = 15; 
 
 public static String serviceFeeX = "NA ", serviceFeeXL = "NA", serviceFeeXBlack = "NA"; 
 
 public static int cancellationFeeX = 5, cancellationFeeXL = 9, cancellationFeeXBlack = 15; 
 
 
 public static int counterXR = 0, counterXLR = 0, counterXBR = 0; 
public static int counterXF = 0, counterXLF = 0, counterXBF = 0;
public static int counterXS = 0, counterXLS = 0, counterXBS = 0; 
public static int counterX = 0, counterXL = 0, counterXB = 0; 
 
 
 static Scanner input = new Scanner(System.in); 
 
 public static int menu() { 
 // an object from the scanner class 
 
 // we give to the initial variable a max value out of our range 1..5 
	 int choice=10;
 LocalDate myObj = LocalDate.now(); // Create a date object 
 System.out.println("\n\t\t " + myObj); // Display the current date 
 LocalDate myOb = LocalDate.now();  
 System.out.println("\t " + myOb); 
 
 System.out.println("----------------------------------------------------"); 
 System.out.println("### Welcome to Uber System ###"); 
 System.out.println("----------------------------------------------------"); 
 System.out.println("| 1 : Get fare information about available rides |"); 
 System.out.println("| 2 : Get fare Estimate for your Journey |"); 
 System.out.println("| 3 : Submit Rating of your Ride |"); 
 System.out.println("| 4 : Reserve a car |"); 
 System.out.println("| 5 : Exit and display summary |"); 
 System.out.println("----------------------------------------------------"); 
System.out.print("> Please enter your choice ... (1-5) :");
// waiting for the user to enter an choice form the menu. 
// if the user enter a valid choice execute the try block
try { 
 choice = input.nextInt(); 
 // if the user enter an invalid choice execute the Exception block 
} catch (Exception e) { 
 
 } 
 return choice; 
 } 
 
 
 public static char rides(int menu) { 
 
 Scanner input = new Scanner(System.in);// an object from the scanner class 
double rideTimeInMinutes, rideDistanceKm; double total = 0; char 
choiceR, r; 
 int rate; 
 System.out.println("-------------------------------------"); 
 System.out.println("*** RIDES ***"); 
 System.out.println("-------------------------------------"); 
 System.out.println("| X or x : UberX |"); 
 System.out.println("| L or l : UberXL |"); 
 System.out.println("| B or b : UberBlack |"); 
 System.out.println("| R or r : Return to Main Menu |"); 
 System.out.print("> Please enter your choice ... "); 
 // waiting for the user to enter an choice form the rides menu 
choiceR = input.next().charAt(0); 
 // if the user enter r or R from the rides menu display invalid Choice
if (choiceR == 'R' | choiceR == 'r') { 
 System.out.println("Invalid Choice !! Please Try agin "); 
return choiceR; 
 } 
 if (menu == 4) { 
 System.out.println("Please provide the information about you :"); 
 System.out.println("-------------------------------------------------"); 
 System.out.println("Name :"); 
 String name = input.next(); 
 System.out.println("Your number : "); 
 int num = input.nextInt(); 
System.out.println("Time :"); 
 int n = input.nextInt(); 
 
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
switch (choiceR) { 
 // if the user choose 2 from the main menu and choose x or X from the rides menu 
case 'X': case 'x': 
 System.out.println("You have Reserved an UberX car "); 
 System.out.println("It will wait you five minutes before : "+n+" O'Clock"); 
break; 
 
 // if the user choose 2 from the main menu and choose l or L from the rides menu 
case 'L': case 'l': 
 System.out.println("You have Reserved an UberXL car "); 
 System.out.println("It will wait you five minutes before : "+n+" O'Clock"); 
break; 
 
 // if the user choose 2 from the main menu and choose L OR l from the rides menu 
case 'B': case 'b': 
 System.out.println("You have Reserved an UberBlack car "); 
 System.out.println("It will wait you five minutes before : "+n+" O'Clock"); 
break; 
 } 
 
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
 
 } 
 // if the user choose 2 from the main menu execute the if block 
if (menu == 2) { 
 System.out.println("Please provide the information about your journey :"); 
 System.out.println("-------------------------------------------------"); 
 System.out.println("Ride time in minutes :"); 
rideTimeInMinutes = input.nextDouble(); System.out.println("Ride distance in KM (s) :"); 
rideDistanceKm = input.nextDouble(); 
 
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
 
 switch (choiceR) { 
 // if the user choose 2 from the main menu and choose x or X from the rides menu
 case 'X': case 'x': counterXF++; total = ((rideTimeInMinutes * costPerMinuteUberX) + (rideDistanceKm * 
costPerKmX)); 
 if (total < baesFareUberX) { 
 System.out.println(" > Expected ride fare : " + baesFareUberX + "$"); 
 } else { 
 System.out.println(" > Expected ride fare : " + total + "$"); 
 } 
break; 
 
 // if the user choose 2 from the main menu and choose l or L from the rides menu 
case 'L': case 'l': counterXLF++; total 
= ((rideTimeInMinutes * costPerMinuteUberXL) + (rideDistanceKm * 
costPerKmXL)); 
 if (total < baesFareUberXL) { 
 System.out.println(" > Expected ride fare : " + baesFareUberXL + "$"); 
 } else { 
 System.out.println(" > Expected ride fare : " + total + "$"); 
 } 
break; 
 
 // if the user choose 2 from the main menu and choose L OR l from the rides menu 
case 'B': case 'b': counterXBF++; total = 
((rideTimeInMinutes * costPerMinuteUberXBlack) + (rideDistanceKm * 
costPerKmXBlack)); 
 if (total < baesFareUberXL) { 
 System.out.println(" > Expected ride fare : " + baesFareUberXL + "$"); 
 } else { 
 System.out.println(" > Expected ride fare : " + total + "$"); 
 } 
break; 
 } 
 
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
 
 } 
 
 switch (choiceR) 
{ case 'X': 
case 'x': case 
'B': case 'b': 
case 'L': case 'l': 
 if (menu == 4) { 
 if (choiceR == 'X' | choiceR == 'x') { 
 counterX++; 
 } else if (choiceR == 'L' | choiceR == 'l') { 
counterXL++; 
 } else if (choiceR == 'B' | choiceR == 'b') { 
counterXB++; 
 } 
 
 } 
 // if the user choose 1 from the main menu increment these counters 
if(menu == 1) { 
 if (choiceR == 'X' | choiceR == 'x') { 
counterXR++; 
 } else if (choiceR == 'L' | choiceR == 'l') { 
counterXLR++; 

 } else if (choiceR == 'B' | choiceR == 'b') { 
counterXBR++; 
 } 
 options(choiceR); 
} 
 // if the user choose 3 from the main menu increment these counters 
else if (menu == 3) { 
 if (choiceR == 'X' | choiceR == 'x') { 
counterXS++; 
 } else if (choiceR == 'L' | choiceR == 'l') { 
counterXLS++; 
 } else if (choiceR == 'B' | choiceR == 'b') { 
counterXBS++; 
 } 
 rate = rating(); 
 } 
 
 r = rides(menu); 
break; default: 
 System.out.println("Invalid Choice !! Please Try again "); 
r = rides(menu); 
 } 
 return choiceR; 
 } 
 
 public static char options(char rides) { 
 Scanner input = new Scanner(System.in);// an object from the scanner class 
char o, choiceO; int menu = 0; 
 System.out.println("-------------------------------------"); 
 System.out.println("*** OPTIONS ***"); 
 System.out.println("-------------------------------------"); 
 System.out.println("| B or b : Base fare |"); 
 System.out.println("| M or m : Cost per minute |"); 
 System.out.println("| K or k : Cost per km |"); 
 System.out.println("| S or s : Service fee |"); 
 System.out.println("| C or c : Cancellation fee |"); 
 System.out.println("| F or f : Minimum fee |"); 
 System.out.println("| R or r : Previous Menu |"); 
 System.out.println("-------------------------------------"); 
 System.out.print("> Please enter your choice ... "); 
 // waiting for the user to enter an choice form the options menu 
choiceO = input.next().charAt(0); if (choiceO == 'R' | choiceO 
== 'r') { return 
choiceO; 
 } 
 // if the user choice was X or x execute the if block 
 if (rides == 'X' | rides == 'x') { 
switch (choiceO) { case 
'B': case 'b': 
 System.out.println("Base fare for UberX is " + baesFareUberX + "$"); 
break; case 'M': case 'm': 
 System.out.println("Cost per minute for UberX is " + costPerMinuteUberX + 
"$"); 
 break; 
case 'K': case 
'k': 
 System.out.println("Cost per km for UberX is " + costPerKmX + "$"); 
break; case 'S': case 's': 
 System.out.println("Service fee for UberX is " + serviceFeeX + 
"$"); break; case 'C': case 'c': 
 System.out.println("Cancellation fee for UberX is " + cancellationFeeX + 
"$"); 
 break; 
case 'F': case 
'f': 
 System.out.println("Minimum fee for UberX is " + minimumFeeX + "$"); 
break; default: 
 System.out.println("Invalid Choice !! Please Try agin "); 
options(rides); 
 
 } 
} 
 // if the user choice was X or x execute the if block 
 if (rides == 'L' | rides == 'l') { 
switch (choiceO) { case 
'B': case 'b': 
 System.out.println("Base fare for UberXL is " + baesFareUberXL + "$"); 
break; case 'M': case 'm': 
 System.out.println("Cost per minute for UberXL is " + costPerMinuteUberXL 
+ "$"); 
 break; 
case 'K': case 
'k': 
 System.out.println("Cost per km for UberXL is " + costPerKmXL + "$"); 
break; case 'S': case 's': 
 System.out.println("Service fee for UberXL is " + serviceFeeXL + "$"); 
break; case 'C': case 'c': 
 System.out.println("Cancellation fee for UberXL is " + cancellationFeeXL + 
"$"); 
 break; 
case 'F': case 
'f': 
 System.out.println("Minimum fee for UberXL is " + minimumFeeXL + "$"); 
break; 
 } 
} 
 // if the user choice was X or x execute the if block 
 if (rides == 'B' | rides == 'b') { 
switch (choiceO) { case 
'B': case 'b': 
 System.out.printf("Base fare for UberBlack is " + baesFareUberXBlack + 
"$"); 
 break; 
case 'M': case 
'm': 
 System.out.printf("Cost per minute for UberBlack is " + 
costPerMinuteUberXBlack + "$"); 
 break; 
case 'K': case 
'k': 
 System.out.printf("Cost per km for UberBlack is " + costPerKmXBlack + 
"$"); 
 break; 
case 'S': case 's': 
 System.out.printf("Service fee for UberBlack is " + serviceFeeXBlack + "$"); 
break; case 'C': case 'c': 
 System.out.printf("Cancellation fee for UberBlack is " + 
cancellationFeeXBlack + "$"); 
 break; 
case 'F': case 
'f': 
 System.out.printf("Minimum fee for UberBlack is " + minimumFeeXBlack + 
"$"); 
 break; 
 } 
 } 
 o = options(rides); 
 return choiceO; 
 } 
 
 
 public static int rating() { 
 // an object from the scanner class 
 Scanner input = new Scanner(System.in); 
 int rate; 
 System.out.println("-------------------------------------"); 
 System.out.println("*** RATING ***"); 
 System.out.println("-------------------------------------"); 
 System.out.println("| 1 Poor |"); 
 System.out.println("| 2 Borderline |"); 
 System.out.println("| 3 Satisfactory |"); 
 System.out.println("| 4 Good |"); 
 System.out.println("| 5 Outstanding |"); 
 System.out.print("> Please enter your choice .. (1-5) :"); // waiting for the user to enter an choice form the rating menu  
rate= input.nextInt(); 
 System.out.println(); 
 System.out.println(" Thank you for your rating !"); 
 
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
 System.out.println(" You give rating > " + rate + " <"); 
 
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
return rate; 
 
 } 
 public static void summary() { 
 System.out.println("-------------------------------------------------------------------------"); 
 System.out.println("### SUMMRY ###"); 
 System.out.println("-------------------------------------------------------------------------");
 System.out.println("| Ride |# Fare Info.|# Fare Est.|# Submitted Ratings|# Reserving car "); 
 System.out.println("| UberX | " + counterXR + " | " + counterXF + " | " + counterXS + " | "+counterX); 
 System.out.println("| UberXl | " + counterXLR + " | " + counterXLF + " | " + counterXLS + " | "+counterXL); 
 System.out.println("| UberXBlack | " + counterXBR + " | " + counterXBF + " | " + counterXBS + " | "+counterXB);  
 System.out.println("-------------------------------------------------------------------------"); 
System.out.println("**** Thank you for using Uber System! ****"); 
 } 
 
 public static void main(String[] args) { 
 
 
 //double rideTimeInMinutes , perMinute , rideDistanceKm , costPerMinute ; 
int rate, m; char r = 0; 
 // call the menu method  
m= menu(); 
 
 while (m >= 1) { 
 // if the user choose number more than 4 promot the user to enter number from 1 to 4 
 if (m > 5) { 
 System.out.println(); 
 System.out.println("Invalid Choice !! Please Try agin"); 
System.out.println(); 
} 
 //if the user enter from the menu 1 go to the rides and options and rating method 
else if (m == 1) { r = rides(m); } 
 // if the user choose from the main menu 2 or 3 go the rides method 
else if (m == 2 | m == 3) { 
 r = rides(m); 
 } 
 else if (m == 4) 
{ 
r = rides(m); } 
 // if the user choose from the main menu 5 go the summary method 
else if (m == 5) { summary(); break; 
 } 
 // when the loop finish display the main menu again m 
m = menu(); 
 } 
 } 
 }