import java.util.*;
public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String name = "eliza";

    // Find the length of the string
    System.out.println(name.length());

    // Concatenate (add) two strings together and reassign the result
    String name2 = "beth";
    name = name + name2;
    System.out.println(name);

    // Find the value of the character at index 3
    System.out.println(name.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(name.contains("abc"));

    // Iterate over the characters of the string, printing each one on a separate line
    for(char letter : name.toCharArray()){
      System.out.println(letter);
    }

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> lastName = new ArrayList<String>();

    // Add multiple strings to the List (OK to do one-by-one)
    lastName.add("Potter");
    lastName.add("Granger");
    lastName.add("Weasley");
    lastName.add("Malfoy");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    //String words = String.join(", ", lastName);  
    String lastNameString = String.join(", ", lastName);
    String words = "Potter, Granger, Weasley, Malfoy";
    System.out.println(lastNameString);

    // Check whether two strings are equal
    System.out.println(lastNameString.equals(words));

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
