import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");


//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");
        for (String island : scottishIslands){

            if(island.contains("Coll")){
                System.out.println("Task 1: " + island);
            }

        }

//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");

        for (String island : scottishIslands){
            if (island == "Tiree"){
                System.out.println("Task 2: " + island + " on index "+ scottishIslands.indexOf("Tiree"));
            }
        }

//        3. Add "Islay" after "Jura" and before "Mull"

        scottishIslands.add(2, "Islay");
        System.out.println("Task 3: "+ scottishIslands);

//        4. Print out the index position of "Skye"

        System.out.println("Task 4: " + scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name

        for (String island : scottishIslands){
            if (island == "Tresco"){
                scottishIslands.remove(island);
                System.out.println("Task 5: "+ scottishIslands);
            }
        }

//        6. Remove "Arran" from the list by index

        for (String island : scottishIslands){
            if (island == "Arran"){
                int arran = scottishIslands.indexOf(island);
                scottishIslands.remove(arran);
                System.out.println("Task 6: "+ scottishIslands);
            }
        }


//        7. Print the number of islands in your arraylist

        System.out.println("Task 7: "+ scottishIslands.size());

//        8. Sort the list alphabetically

        System.out.println("Task 8: List before sorted: "+ scottishIslands);
        Collections.sort(scottishIslands);
        System.out.println("List after sorted : " + scottishIslands );

//        9. Print out all the islands using a for loop

        System.out.println("Task 9: ");

        for (int i = 0; i < scottishIslands.size(); i++){

            System.out.println(scottishIslands.get(i));
        }

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
//        2. Print the difference between the largest and smallest value
//        3. Print True if the list contains a 1 next to a 1 somewhere.
//        4. Print the sum of the numbers,
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.

    }

}
