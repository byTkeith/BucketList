import java.io.*;
import java.util.*;
public class Bill{
    public static void main(String[] args) {
        ArrayList<String> listInShop= new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name of the products file:");
        String fileName=scanner.nextLine();
        System.out.println("Enter the shopping list:");
        String groceryList=scanner.nextLine();

        try{File file=new File(fileName);
            scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                listInShop.add(scanner.nextLine());

            }

        }catch(FileNotFoundException e){
            System.out.println("File not found askies");
        }finally{
            if(scanner!=null){
                scanner.close();
            }
        }//System.out.println(listInShop);
        String[] itemsFromGrocery=groceryList.split(" ");
        int total=0;
        for(String groceryItem: itemsFromGrocery){
            for(String shopitem: listInShop){
                String[] productInShop=shopitem.split(" ");
                String eachItemInShop=productInShop[0];
                int eachItemInShopPrice=Integer.parseInt(productInShop[1]);
                //System.out.println("the items in shop order:\n"+item);
                if(groceryItem.equals(eachItemInShop)){
                    System.out.println(groceryItem+" : "+eachItemInShopPrice);
                    total=eachItemInShopPrice+total;
                }

            }
        }System.out.println("TOTAL : "+total);
    }
}