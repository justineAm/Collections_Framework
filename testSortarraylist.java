/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;


import java.util.ArrayList;

/**
 *
 * @author 2ndyrGroupA
 */
public class testSortarraylist {
    public static void main(String[]args){         
    ArrayList<String> scholarsList = new ArrayList<>();         
    scholarsList.add("James Llyod");         
    scholarsList.add("Justine");         
    scholarsList.add("Romeo");         
    scholarsList.add("Patrick Carl");         
    scholarsList.add("Dave");  
    scholarsList.add("Guian"); 
    sortArrayList sortArrayList = new sortArrayList(scholarsList);
    
    ArrayList<String> unsortedArrayList = sortArrayList.getArrayList(); 
    
    System.out.println("Unsorted ArrayList: " + unsortedArrayList);  
    
    ArrayList<String> sortedArrayListAscending = sortArrayList.sortAscending();         
    System.out.println("Sorted ArrayList in Alphabetical Order : " + sortedArrayListAscending);
    
}
}
