//program that categories string values as the exact key characters
import java.io.*;
import java.util.*;
 public class BucketList{
    /*
     * linked list is better than a hashmap because order of the string values is maintained.
     * order is important because this keeps the values in a monitored position when searching
     */
    static LinkedHashMap<String, ArrayList<String>> map= new LinkedHashMap<>();//linked list to store the string keys and their respective values in order
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name of the categories file:");
        String fileName=scanner.nextLine();
        try{File file=new File(fileName);
            scanner= new Scanner(file);

        }catch(FileNotFoundException e){
            System.out.println("File not Found Askies!!");
        }finally{
            if(scanner!=null){
                scanner.close();
            }
        }

    }
 }