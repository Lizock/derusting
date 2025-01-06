public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float floatNum = -1.12f;

    // Create an int with a positive value and assign it to a variable
    int intNum = 9;

    // Use the modulo % operator to find the remainder when the int is divided by 3
    int remainder = intNum % 3;
  
    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
    String evenOrOdd = "";
    if (intNum % 2 == 0){
      evenOrOdd = "Number is even";
    } else {
      evenOrOdd = "Number is odd";
    }

    // Divide the number by another number using integer division
    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */
    int divided = intNum / 2;

     System.out.println(floatNum + ", " + intNum + ", " + remainder + ", " + evenOrOdd + ", " + divided );
  }
}
