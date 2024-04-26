import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemos {

    public void createArray(){

        //create array
        int[] age = {12,4,5,2,5};

        //access each array element
        System.out.println("Accessing Elements of an Array ");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);
    }

    //2 and 3
    public void TraversingArray(){
        int[] age = {12,4,5};
        String[] names= {"New York", "Dallas","Las Vegas","Florida"};

        System.out.println("using for loop");
        for(int a: age){
            System.out.println(a);
        }

        for(int i=0; i<age.length; i++){
            System.out.print(age[i]);
        }

        for(String name:names){
            System.out.println(name);
        }
    }

    //4
    public void sumArray(){
        int[] numbers = {2,-9,0,5,12,-25,22,9,8,12};
        int sum = 0;
        Double average;

        //access all elements using for each loop
        for(int num: numbers){
            sum += num;
        }
        //get the total number of elements in the array
        int arrayLength = numbers.length;

        //calculate the average
        //convert the average from int to double
        average = (double) sum/ (double)arrayLength;

        System.out.println("sum: " + sum);
        System.out.println("The length of the array is: "+ arrayLength);
        System.out.println("Average: "+ average);
    }
public void meansArray(){
        int [] marks = {74,43,58,60,90,64,70};
        int sum = 0;
        int sumSq = 0;
        double mean, stdDev;

        //compute sum and square-sum using loop
    for (int i=0; i<marks.length; i++){
        sum += marks[i];
        sumSq += marks[i] * marks[i];
    }
    mean = (double) sum/marks.length;
    //stdDev = Math.sqrt((double)sumSq/marks.length- mean*mean);
    stdDev = Math.sqrt((double)sumSq / marks.length - mean * mean);

    System.out.printf("mean is: %.2f%n ", mean);
    System.out.printf("stdDev is: %.2f%n" , stdDev);
}
    public void insertElements(){
        int i, element;
        int[] arr = new int [11];
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter 10 elements: ");
        for (i=0; i<10; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter element to insert: ");
        element = scan.nextInt();
        arr[i] = element;

        System.out.println("\n Now the new array is: ");
        for(i=0; i<10; i++){
            System.out.print(arr[i] +", ");
        }
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println("");
        System.out.println(Arrays.toString(arr));
    }
}
