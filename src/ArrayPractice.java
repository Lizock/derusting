public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] pets = new String[4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    pets[0] = "cat";
    pets[1] = "dog";
    pets[2] = "parrot";
    pets[3] = "hamster";

    // Get the value of the array at index 2
    System.out.println(pets[2]);

    // Get the length of the array
    System.out.println(pets.length);

    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < pets.length; i++){
      System.out.println(pets[i]);
    }

    // Iterate over the array using a for-each loop and print out each item
    for (String pet : pets){
      System.out.println(pet);
    }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
