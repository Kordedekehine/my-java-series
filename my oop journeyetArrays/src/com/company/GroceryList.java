package com.company;

import java.util.ArrayList;

public class GroceryList {
    ArrayList<String> groceryList = new ArrayList<String>();

//    public ArrayList<String> getGroceryList() {
//        return groceryList;
//    }  //this getter is basically another proper way to access an array
//
//    public void addGroceryItem(String item){
//        groceryList.add(item);
//    }
//
//    public void printGroceryList(){
//        System.out.println("You have " + groceryList.size() + " item in your grocery List");
//        for (int i = 0; i < groceryList.size(); i++){
//            System.out.println(i + 1 + ", " + groceryList.get(i));
//        }
//    }
//    public void modifyGroceryItem(String oldItem,String newItem){ //note we need to be getting it through names
//        int position = findItem(oldItem);
//        if (position >= 0){
//           modifyGroceryItem(position,newItem); //after getting the position of the current item change it to new item
//        }
//    }
//    private void modifyGroceryItem(int position, String newItem){ //we make it private so as to force our users to use the shortcut method
//        groceryList.set(position, newItem);
//        System.out.println("Grocery Item " +position + 1 + " has been modified");
//    }
//
//    public void removeGroceryItem(String Item){ //note we need to be getting it through names
//        int position = findItem(Item);
//        if (position >= 0){
//            removeGroceryItem(position);
//        }
//    }
//    private void removeGroceryItem(int position){  //we make it private so as to force our users to use the shortcut method
//     // String theItem =  groceryList.get(position); //we do not need this line function since we are making it private..the above will do the same function
//        groceryList.remove(position);
//    }
//    private int findItem(String searchItem){ //we make it private so as to force our users to use the shortcut method
//        return groceryList.indexOf(searchItem);
//    }
//    public boolean onFile(String searchItem){
//        int position = findItem(searchItem);
//        if (position >= 0){
//            return true;
//        }else
//            return false;
//
//    }
    //add,print,modify,remove,search

    public ArrayList<String> getGroceryList(){

        return groceryList;
    }

    public void addGroceryItem(String Item){

        groceryList.add(Item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " in your grocery list");
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println(i + 1 + ", " + groceryList.get(i)  );
        }
    }
    public void modifyGroceryItem(String oldItem, String newItem){
    int position = findItem(oldItem);
        if (position >= 0) {
            modifyGroceryList(position, newItem);
        }
        }

    private void modifyGroceryList(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("groceryItem in position " + position + 1 + " has been modified to " + newItem);
    }
    public void removeGroceryList(String name){
        int position = findItem(name);
        if (position >= 0){
            removeGroceryList(position);
        }
    }

    public void removeGroceryList(int position){
        groceryList.remove(position);
    }

    private int findItem(String searchItem){
            return groceryList.indexOf(searchItem);
        }
        public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if (position >= 0){
            return true;
        }
        return false;
        }
    }

