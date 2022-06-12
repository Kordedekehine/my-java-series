package com.company;

import java.util.ArrayList;

public class GroceryList {
    ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item){
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryItem() {
    System.out.println("The list includes " + groceryList.size() + " grocery items");
    for (int i = 0; i < groceryList.size(); i++) {
        System.out.println((i + 1) + " , " + groceryList.get(i));
    }
}

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = searchItem(currentItem);
        if (position >= 1){
            modifyGroceryItem(position,newItem);
        }
    }

    private void modifyGroceryItem(int position,String itemName){
        groceryList.set(position,itemName);
        System.out.println((position + 1) + " has been modified in the grocery list");
    }

    public void removeGroceryItem(String itemName){
        int position = searchItem(itemName);
        if (position >= 1){
            removeGroceryItem(position);
        }
    }

    public boolean onFile(String itemName){
        int position = searchItem(itemName);
        if (position >= 0){
           return true;
        }
        return false;
    }

    private void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }












    public int searchItem(String itemName){
        return groceryList.indexOf(itemName);
    }
}
