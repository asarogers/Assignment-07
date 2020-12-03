
package uco.cmsc1513.assignments;
import java.util.*;

public class AR07_1 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        //Accepts total number of students
        System.out.println("Please enter the number of students: ");
        int length=input.nextInt();
        
        //creates new array, makes it the length of total students
        String[] students = new String[length];
        
        //creaates new array, makes it the length of total students
        int[] grades= new int[length]; 

        
        //aceepts the names of each student && their grades
        for(int i=0; i <length; i++){
            System.out.println("Please enter student "+(i+1)+"'s name and grade");
            students[i]=input.next();
            grades[i]=input.nextInt();

        }
        
        System.out.println(Arrays.toString(descend(students, grades)));

    }
    
    //This method will accept a string array && int array, 
    //returns them in a descending order
    public static String [] descend(String[] arr, int[] array){
        
        //loop will last the length of the array
        for(int i=0; i<array.length; i++){
            
            //everytime the first loop runs once,2nd checks each values
            for(int j=0; j<array.length; j++)
                
                //sorts the array in descending order
                if(array[i] > array[j]){
                    
                    //this makes it so the names change according to the grades
                    String tempo=arr[i];
                    int temp=array[i];
                    
                    array[i]=array[j];
                    arr[i]=arr[j];
                    
                    array[j]=temp;
                    arr[j]=tempo;
                }
        }
        //makes a new array to hold the values && names of the newly sorted array above
        String [] response = new String[array.length];
        for(int i=0; i<array.length; i++){
            response[i]=arr[i]+ " "+array[i];
    }
                return response;
    }
}