/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.util.*; 

/**
 *
 * @author 2ndyrGroupA
 */

/**
 *
 * @author 2ndyrGroupA
 */
class sortArrayList {
    
    private ArrayList<String> arrayList;

        public sortArrayList(ArrayList<String> arrayList) {
            this.arrayList = arrayList;
            
        }

        public ArrayList<String> getArrayList() {
            return this.arrayList;
        }

        public ArrayList<String> sortAscending() {
            Collections.sort(this.arrayList);
            return this.arrayList;
        }

    
    
    
}

