package com.sethjava;

import java.util.ArrayList;
import java.util.List;

public class GroceryList {
    private List<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have "+ groceryList.size() + " item in your grocery list");
        int itemNum = 1;
        for(String item : groceryList){
            System.out.println(itemNum + ". "+ item);
            itemNum++;
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item "+ (position+1) + " has been modified");
    }

    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findGroceryItem(String searchItem){
        //boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position >= 0)
            return groceryList.get(position);
        return null;
    }
}
