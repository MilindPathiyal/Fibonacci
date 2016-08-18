//Milind Pathiyal

//Code follows the magic of recursive methods and completes 3 methods: fib, multiply, and triangle 
//FIBONACCI

public class Fibonacci
{
    //Pre: Must have a valid base case, algorithm must be heading towards base case, and have at least 1 base case
    //Post: New copy of the method is used to evaluate recursive call -> Prints fibonacci sequence
    public int fib(int n)
    {
      if(n <= 1)
        return n;
      else
        return fib(n - 1) + fib(n-2);
    }
    //Pre: Must have a valid base case, algorithm must be heading towards base case, and have at least 1 base case
    //Post: New copy of the method is used to evaluate recursive call -> Multiplies two different numbers recursively 
    public int multiply(int a, int b)
    {
        if ( b == 1 )
            return a;
        else
            return a + multiply(a, b-1);
    }
    //Pre: Must have a valid base case, algorithm must be heading towards base case, and have at least 1 base case
    //Post: New copy of the method is used to evaluate recursive call -> Prints a reverse triangle recursively
    public static void stars(int n)
    {
        if(n == 0)
        {
            return;
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print("*");
        }
        System.out.println("");
        stars(n-1);
    }
}
/*
Enter a number for fibonacci.
7
The fibonacci number is 13
Enter first number to be multiplied
5
Enter first number to be multiplied
4
The answer is 20
Enter a number of lines of stars.
6
******
*****
****
***
**
*
*/