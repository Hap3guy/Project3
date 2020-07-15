// the import keyword is used to load in additional Java PACKAGE code for our programs
// in this case, we are loading in the standard "util" package for the Scanner class
import java.util.*;

// we use the class keyword to denote an OBJECT
// an object is simply a collection of PROPERTIES (variables)
// and METODS (functions) that relate to each other
public class Project3 {

  // all of our Java programs will have a "main method"
  // this is the ENTRY POINT of our program
  // the keywords prior to main:
  // - public: denotes the access permissions for other objects
  // - static: denotes procedural style code (i.e., not Object Oriented)
  // - void: the return type of the method (in this case NOTHING)
  public static void main(String[] args) {

    // initialize a variable of type OBJECT Scanner and call its CONSTRUCTOR with the System.in parameter)
    Scanner user_input = new Scanner(System.in);

    // a standard Java method for output of a STRING LITERAL
    // the \n denotes a "carriage return" - or blank line
    System.out.println("-- Project3 --");
    System.out.println("\nYou are creating an email that you can copy & paste to your friends...\n");
    
    while (true) {
      String[] hi = {"Hello!", "Hi!", "Greetings!", "Good morning!", "Good afternoon!", "Good evening!"};
      System.out.println("Choose a greeting (or hit enter for default):");
      System.out.println(" 1 Hello!\n 2 Hi!\n 3 Greetings!\n 4 Good morning!\n 5 Good afternoon!\n 6 Good evening!");
      String greet = user_input.nextLine();
      int greetDefault = 0;

      if (greet.matches("^[1-6]$")) {
        int greetInt = Integer.parseInt(greet);
        greet = hi[greetInt - 1];
      } else {
        greet = hi[greetDefault];
      }

      System.out.println("Enter your full name:");
      String name = user_input.nextLine();

      System.out.println("Enter your favorite color");
      String color = user_input.nextLine();
      
      System.out.println("Enter your favorite food:");
      String food = user_input.nextLine();

      System.out.println("Enter your favorite animal (PLURAL):");
      String animal = user_input.nextLine();

      System.out.println("Enter something else you want to tell someone special (no exclamations or questions):");
      String other = user_input.nextLine();

      String[] bye = {"Bye!", "Goodbye!", "Have a good day!", "Adios!", "See ya!", "Take care!"};
      System.out.println("Choose a farewell (or hit enter for default):");
      System.out.println(" 1 Bye!\n 2 Goodbye!\n 3 Have a good day!\n 4 Adios!\n 5 See ya!\n 6 Take care!");
      String farewell = user_input.nextLine();
      int farewellDefault = 0;

      if (greet.matches("^[1-6]$")) {
        int farewellInt = Integer.parseInt(farewell);
        farewell = bye[farewellInt - 1];
      } else {
        farewell = bye[farewellDefault];
      }

      System.out.println("Here is your message to send to all your friends:\n");
      System.out.println(greet + "\n\n   My name is " + name + " and I like eating " + food + " while petting " + color + " " + animal + ". One final thing that I would like to tell you is that " + other + ".\n\n" + farewell + "\n~" + name);

      System.out.println("\n\nHit enter to write another message or a key + enter to exit");
      String loop = user_input.nextLine();
      if (loop.matches("^$")) {
        continue;
      } else {
        break;
      }
    }
  }
}
