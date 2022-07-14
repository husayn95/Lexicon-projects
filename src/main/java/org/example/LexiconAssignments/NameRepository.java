package org.example.LexiconAssignments;

import java.util.Arrays;
public class NameRepository {

    private static String[] names = {"Christopher Ojaide",
            "Husayn Ganiev",
            "Jonas Eira",
            "Julia Lindman",
            "Julius Büchner",
            "Nader Alhamwi",
            "Patrik Axelsson",
            "Roudabeh Adnani",
            "Mohsen Forouzmand",
    "Husayn Ganiev"};


    public static void main(String[] args) {

        //Part 1
        System.out.println("The elements of String array names are: "+ Arrays.asList(names));


        System.out.println("Number of elements in array are: " + getSize());

        System.out.println("The findAll method: "+Arrays.asList(findAll()));


        //Part 2
        System.out.println("Find method: " + find("Husayn Ganiev"));

        System.out.println("Add method: " + add("Johan Karlsson"));


        //Part 3
        System.out.println("findByFirstName method: " + Arrays.toString(findByFirstName("Husayn")));

        System.out.println("findByLastName method: " + Arrays.toString((findByLastName("Karlsson"))));




        clear();
        System.out.println("After emptying the array: " + Arrays.asList(names));
    }


    //Methods
    //Part 1
    //Returns number of elements in the array
    public static int getSize(){

        int numberOfElements = names.length;

        return numberOfElements;

    }


    //Sends in an array that set the private static array.
    //This should replace all existing names.
    public static void setNames(String[] names){

        NameRepository.names = names;
    }


    //Should completely empty the array.
    public static void clear(){
        String[] empty = {};
        names = empty;

        System.out.println(Arrays.toString(names));



    }


    //Returns all names in a new array
    public static String[] findAll(){
        String[] newArr =Arrays.copyOf(names, names.length);

        return newArr;

    }



    //Part 2
    //Returns name if found and null if not found.
    public static String find(final String fullName){
        //        global variable , local variable
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);

        int index = Arrays.binarySearch(names, fullName);
        System.out.println(index);
        System.out.println(Arrays.toString(names));
        if (index > 0) {
            System.out.println(names[index]);
        } else {
            return " not found";
        }
        return names[index];
    }



    //Should add a new name to the array. Returns true when name was added and false when the array contains the name.
    public static boolean add(final String fullName){
        for (String name : names) {
            if (name.equals(fullName)) {
                return false;
            }
        }
        int size = names.length + 1;
        String[] newNames = new String[size];
        for (int i = 0; i < names.length ; i++) {
            newNames[i] = names[i];
        }
        newNames[size - 1] = fullName;
        names = newNames;
        return true;
    }




    //Part 3
    //Searches the array trying to find all names that has passed in first name.
    //Returns a String array containing all matches.
    public static String[] findByFirstName(final String firstName){
    //step 1, iterate through array
        // step 2, get the array element and split it
        // step 3, condition to compare method parameter with the element index 0
        // if both are same then add it to the new array using arrays.copy of
        // return the new array
        String[] result = new String[0];

        for (int i =0; i < names.length; i++) {
            String[] fullNameArray = names[i].split(" ");
            if (fullNameArray[0].equalsIgnoreCase(firstName)){
                String[] tmp = Arrays.copyOf(result, result.length + 1);
                tmp[tmp.length - 1] = names[i];
                result = tmp;
            }
        }
        return result;
    }



    //Searches the array trying to find all names that has passed in last name.
    // Returns a String array containing all matches.
    public static String[] findByLastName(final String lastName){
        String[] result = new String[0];

        for (int i =0; i < names.length; i++) {
            String[] fullNameArray = names[i].split(" ");
            if (fullNameArray[1].equalsIgnoreCase(lastName)){
                String[] tmp = Arrays.copyOf(result, result.length + 1);
                tmp[tmp.length - 1] = names[i];
                result = tmp;
            }
        }
        return result;
    }



    //Should find a name and replace it with new fullName if available.
    // Returns true if name was found and updated with the new name.
    //False if name could not be updated because name wasn’t found or name was found
    // but an existing name matching the updatedName already exists.
    public static boolean update(final String original, final String updatedName){
    return false;
    }




    //Part4
    // Should remove a name from the array. Returns true if name was removed and false if the name was not
    //removed for some reason.
    public static boolean remove(final String fullName){
        return false;
    }

}
















