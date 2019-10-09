/*Programming Practice 4.1

Write an application called rollDie that rolls a die and displays the result.  Let the user pick the number of sides on the die.
Use the Die class (the object class) to represent the die in your program.
Instantiate a Die object and access its roll() method in DieDriver.

Push your code to GitHub.  You ONLY need to push the contents of the src folder.

You will be receiving two grades for this assignment:
The application runs, checked in class the same as other programming practices.
Your GitHub file, where I will be checking your class construction and style
*/


import java.util.Random;
import java.util.Scanner;

public class rollDie
{
    int sides;
    int roll;

    public rollDie()
    {
        sides = 0;
    }
    public rollDie(int newSides)
    {
        sides = newSides;
    }
    public int getSides()
    {
        return sides;
    }
    public String roll()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("choose the sides you want on your die.");
        sides = scan.nextInt();
        Random generator = new Random();
        roll = generator.nextInt(sides);
        String output = "";
        output += "You got a " +  roll;
        return output;
    }

}



