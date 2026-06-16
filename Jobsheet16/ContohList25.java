package Jobsheet16;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class ContohList25 {
    public static void main(String[] args){
    ArrayList<Integer> l25 = new ArrayList<>();
    l25.add(1);
    l25.add(2);
    l25.add(3);
    List<String> l25Strings = new LinkedList<>();
    l25Strings.add("cireng");
    System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n", l25.get(0), l25.size(), l25.get(l25.size() - 1));
    System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n", l25Strings.get(0), l25Strings.size(), l25Strings.get(l25Strings.size() - 1));

    l25.add(4);
    l25.remove(0);
    System.out.printf("elemen 0: %d total elemen: %d elemen terakhir : %s\n", l25.get(0), l25.size(), l25.get(l25.size() - 1));

   LinkedList<String> names25 = new LinkedList<>();
    names25.add("Noureen");
    names25.add("Akhleema");
    names25.add("Shannum");
    names25.add("Uwais");
    names25.add("Al-Qarni");
    System.out.printf("Elemen 0 : %s total elemen: %s elemen terakhir : %s\n", names25.get(0), names25.size(),names25.get(names25.size() - 1));
    names25.set(0,"My kid");
    System.out.printf("Elemen 0 : %s total elemen : %s elemen terakhir : %s\n", names25.get(0),names25.size(), names25.get(names25.size() - 1));
    System.out.println("Names: "+names25.toString());
    names25.push("Mei-mei");
    System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", names25.getFirst(),names25.size(),names25.getLast());
    System.out.println("Names: "+names25.toString());
    }
   
}