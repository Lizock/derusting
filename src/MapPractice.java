import java.util.*;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> orders = new HashMap<String, Integer>();

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    orders.put("Tea", 3);
    orders.put("Coffee", 1);
    orders.put("Smoothie", 1);

    // Get the value associated with a given key in the Map
    System.out.println(orders.get("Smoothie"));

    // Find the size (number of key/value pairs) of the Map
    System.out.println(orders.size());

    // Replace the value associated with a given key (the size of the Map shoukld not change)
    orders.put("Tea", 5);
    System.out.println(orders);

    // Check whether the Map contains a given key
    System.out.println(orders.containsKey("Coffee"));

    // Check whether the Map contains a given value
    System.out.println(orders.containsValue(3));

    // Iterate over the keys of the Map, printing each key
    for (int quantity : orders.values()){
      System.out.println(quantity);
    }

    // Iterate over the values of the map, printing each value
    for (String drink : orders.keySet()){
      System.out.println(drink);
    }

    // Iterate over the entries in the map, printing each key and value
    for (Map.Entry<String, Integer> order : orders.entrySet()){
      System.out.println(order.getKey() + ": " + order.getValue());
    }

    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
