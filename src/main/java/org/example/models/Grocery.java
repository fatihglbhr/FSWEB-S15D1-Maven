package org.example.models;

import java.util.*;

public class Grocery {

    public static List<String> groceryList = new ArrayList<>();

    public static void startGrocery(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("0 - Dur / 1 - Ekle / 2 - Çıkar");
        int entry = scanner.nextInt();

        if(entry == 0)
            return;

        if(entry == 1){
            System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
            Scanner scanner1 = new Scanner(System.in);
            String list = scanner1.nextLine();
            addItems(list);
        }

        if(entry == 2){
            System.out.println("Çıkarılmasını istediğiniz elemanları giriniz.");
            Scanner scanner1 = new Scanner(System.in);
            String list = scanner1.nextLine();
            removeItems(list);
        }
    }

    public static void addItems(String input){
        String[] items = input.split(",");
        for(String item: items){
            if(!groceryList.contains(item))
                groceryList.add(item);
        }
        Collections.sort(groceryList);
    }

    public static void removeItems(String input){
        String[] items = input.split(",");
        groceryList.removeAll(Arrays.asList(items));
        Collections.sort(groceryList);
    }

    public static boolean checkItemIsInList(String product){
        return groceryList.contains(product);
    }

    public static void printSorted(){
        Collections.sort(groceryList);
        System.out.println(groceryList);
    }
}
