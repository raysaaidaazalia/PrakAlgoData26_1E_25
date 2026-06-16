package Jobsheet16;

import java.util.Iterator;
import java.util.Stack;

public class LoopCollection25 {
    public static void main(String[] args) {
        Stack<String> fruits25 = new Stack<>();
        fruits25.push("Banana");
        fruits25.add("Orange");
        fruits25.add("watermelon");
        fruits25.add("leci");
        fruits25.push("Salak");
        for(String fruit25 : fruits25){
        System.out.printf("%s ", fruit25);
        }
        System.out.println("\n"+fruits25.toString());

        while(!fruits25.empty()){
            System.out.printf("%s ", fruits25.pop());
        }
        fruits25.push("Melon");
        fruits25.push("Durian");
        System.out.println(" ");
        for(Iterator<String>it = fruits25.iterator(); it.hasNext();){
            String fruit25 = it.next();
          System.out.printf("%s ", fruit25);
        }
        System.out.println(" ");
        fruits25.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
       System.out.println(" ");
       for(int i=0; i < fruits25.size(); i++){
       System.out.printf("%s ", fruits25.get(i));
       fruits25.set(fruits25.size()-1, "Strawberry");
        }
        }
    }

