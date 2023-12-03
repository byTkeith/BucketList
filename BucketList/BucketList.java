package BucketList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class BucketList {
    /*
     * linked list is better than a hashmap because order of the string values is maintained.
     * order is important because this keeps the values in a monitored position when searching
     */
    static LinkedHashMap<String, ArrayList<String>> map= new LinkedHashMap<>();//linked list to store the string keys and their respective values in order
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name of the categories file:");
        String fileName=scanner.nextLine();
        System.out.println("Enter a comma-separated list of words:");
        String wordsString = scanner.nextLine();//variable with the list of words entered
        try{File file=new File(fileName);
            scanner= new Scanner(file);
            while(scanner.hasNextLine()){
                ArrayList<String> empty=new ArrayList<>();
                map.put(scanner.nextLine(), empty);//maps the key to an arraylist of strings

            }

        }catch(FileNotFoundException e){
            System.out.println("File not Found Askies!!");
        }finally{
            if(scanner!=null){
                scanner.close();
            }
        }
        String[] words = wordsString.split(", ");//splits the entered line in separate words.

        ArrayList<String> uncategorised = new ArrayList<String>();//array list to store the string values without a category.
        /*
         * loops through the entered words comparing the character values to the key character values
         * if the characters are the same the string is added to a list
         */
        for(String word:words){
            char[] chars =word.toCharArray();
            String mostValues="";
            int maxLength=0;

            //loops through the key values in the linkedhashmap
            for(String key:map.keySet()){
                
            }
        }

        
    }
    
}
