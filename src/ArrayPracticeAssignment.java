import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticeAssignment {

    /*
    Task 1: Write a program that creates an array
    of integers with a length of 3. Assign the
    values 1, 2, and 3 to the indexes. Print out each
     array element.
     */
    public void creatArray(){
        int[] arr = new int[]{1,2,3};
        System.out.println(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    /*
    Task 2: Write a program that returns the middle
    element in an array. Give the following values to
    the integer array: {13, 5, 7, 68, 2} and produce
    the following output: 7
     */
    public void getMidValue() {
        int[] arr = {13, 5, 7, 68, 2};
        //System.out.println(Arrays.toString(arr));

        int midElement = arr[(arr.length-1)/2];
        //System.out.println((arr.length-1)/2);
        System.out.println(midElement);
    }
    /*
    Task 3: Write a program that creates an array
    of String type and initializes it with the
    strings “red,” “green,” “blue,” and “yellow.
    ” Print out the array length. Make a copy using
     the clone( ) method. Use the Arrays.toString( )
     method on the new array to verify that the original
     array was copied.
     */
    public void cloneArray() {

        String [] colors = new String[] {"red","green", "blue","yellow"};
        String [] colorsCopy = new String [colors.length];

        System.out.println("The length of the array is: " + colors.length);
        //colorsCopy = Arrays.copyOf(colors, colors.length);
        colorsCopy = colors.clone();
        System.out.println("colors[]: "+Arrays.toString(colorsCopy));
        System.out.println("colorsCopy[]: "+Arrays.toString(colorsCopy));
        System.out.println("--------------");
        colorsCopy [1] = "Purple";
        System.out.println("colors[]: "+Arrays.toString(colorsCopy));
        System.out.println("colorsCopy[]: "+Arrays.toString(colorsCopy));
    }

    /*
    Task 4: Write a program that creates an integer array with 5
    elements (i.e., numbers). The numbers can be any integers.
    Print out the value at the first index and the last index using
     length - 1 as the index. Now try printing the value at
     index = length (e.g., myArray[myArray.length] ).
     Notice the type of exception which is produced. Now try to
     assign a value to the array index 5. You should get the same
     type of exception.
     */
    public void arrayExceptionDemo(){
        int[] arr= {1,2,3,4,5};
        System.out.println("Value at the first index arr[0}: "+arr[0]);
        System.out.println("Value at the last index arr[arr.length-1}: "+arr[arr.length-1]);
        //System.out.println("Value at the last index arr[arr.length}: "+arr[arr.length]);
        arr[5]= 9;
    }

    /*
    Task 5: Write a program where you create an integer array with a
    length of 5. Loop through the array and assign the value of the
    loop control variable (e.g., i) to the corresponding index in the
     array.
     */

    public void loopPopulateArray(){
        int[] arr= new int [5];
        for(int i=0;i<arr.length;i++){
            arr[i]= i;
        }
        System.out.println(Arrays.toString(arr));
    }

    /*
    Task 6: Write a program where you create an integer array of
     5 numbers. Loop through the array and assign the value of the
     loop control variable multiplied by 2 to the corresponding
     index in the array.
     */
    public void loopPopulateArray2(){
        int[] arr= new int [5];
        for(int i=0;i<arr.length;i++){
            arr[i]= i*2;
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Task 7: Write a program where you create an array of 5
     * elements. Loop through the array and print the value of each
     * element, except for the middle (index 2) element.
     */
    public void loopArrayDontPrintMiddle(){
        int[] arr= new int []{1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            if(((arr.length-1)/2) !=i){
                System.out.println(arr[i]);
            }
        }
    }
    /**
     *Task 8: Write a program that creates a String array of 5
     * elements and swaps the first element with the middle
     * element without creating a new array.
     */
    public void swapFirstAndMiddle(){
        int[] arr= new int [5];
        int swap =0;

        for(int i=0;i<arr.length;i++){
            arr[i]= i*2;
        }
        System.out.println(Arrays.toString(arr));
        swap = arr[(arr.length-1)/2];
        arr[(arr.length-1)/2]= arr[0];
        arr[0]= swap;
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Task 9:
     * Write a program to sort the following int array in ascending
     * order: {4, 2, 9, 13, 1, 0}. Print the array in ascending
     * order, and print the smallest and the largest element of the
     * array. The output will look like the following:
     * Array in ascending order: 0, 1, 2, 4, 9, 13
     * The smallest number is 0
     * The biggest number is 13
     */
    public void sortArrayAscending(){
        int[] arr= new int []{4, 2, 9, 13, 1, 0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("The smallest number is "+arr[0]);
        System.out.println("The largest number is "+arr[arr.length-1]);
    }

    /**
     *Task 10: Create an array that includes an integer, 3 strings,
     *and 1 double. Print the array.
     */
     public void creatingObjectArray(){
         Object[] obj = new Object[]{1,"Java","is","fun",5.2};
         System.out.println(Arrays.toString(obj));
     }

    /**
     *Task 11: Write some Java code that asks the user how many
     *favorite things they have. Based on their answer, you should
     *create a String array of the correct size. Then ask the user
     *to enter the things and store them in the array you created.
     * Finally, print out the contents of the array.
     */

    public void favouritThings(){
        System.out.println("Please enter and integer to indicate the number of favourite thing you have: ");
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        sc.nextLine();
        String[] facouriteThings = new String[arraySize];

       for(int i=0;i<arraySize;i++){
           System.out.println("Please enter the name of the favourite thing: ");
           facouriteThings[i]= sc.nextLine();
       }
       for(String thing : facouriteThings){
           System.out.println(thing);
       }
    }
}
// git repo link: https://github.com/mca67625/ArrayTraining.git