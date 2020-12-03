
package uco.cmsc1513.assignments;
import java.util.*;

public class AR07_2 {
    public static void main(String [] args){
        
        //two new array with 6 spaces
        int [] list1= new int[6];
        int [] list2= new int[6];
        
        //sends list to loop method
        loop(list1);
        loop(list2);
        
        //prints out list of arrays
        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));
        
        //passes the arrays to two methods
        System.out.println(identical((equals(list1, list2))));
    }
    //puts arrays in loop, fills in values for each index
    public static int[]loop(int list []){
        Scanner input = new Scanner(System.in);
        
        //request the values of each index
        for(int i=0; i<list.length; i++){  
            System.out.println("Please value #"+(i+1)+" for the list: ");
            
            //assigns the values to the index
            list[i]=input.nextInt();
          }
        //returns the array
        return list;
    }
    
    //finds out whether the arrays are identical
    public static boolean equals (int[] list1, int[] list2){
        boolean equals =false;
        int count =0;
        
        //here is how it works: each time the program finds a match,
        //count increases by 1, if count is equal to the total number of indexs
        // in the array, then and only then will it return true, otheriwse false
        //example: array length is 7, but count is 6, then method returns false
        for(int i=0; i < list1.length; i++){
            for(int j=0; j<list1.length; j++){
                if(list2[i] == list1[j]){
                    count ++;
                }
            }
        }
        //checks to see if count equals the total number of indexs in the array
        if(count==list1.length){
            equals=true;
        }
        return equals;
    }
    
    //returns the necessary response, based on whether it's true or false
    public static String identical(boolean orNot){
        
        String res="";
        
        if(orNot == true){
            res= "Two lists are identical";
        }
        else{
            res="Two lists are not identical";
        }
        return res;
    }
}