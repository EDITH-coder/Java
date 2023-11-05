/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sortarray;

/**
 *
 * @author Dell-User
 */
import java.util.*;
public class SortArray {

    public static void main(String[] args) {
        
        int[] Numbers= new int[] {1739,5035,1299,1496,2003,
            1058,2358,1454,1572,6365,7456,2161,1452,2356};
        
        String[] strawhats = {"Luffy",
            "Jinbei","Nami","Robin","Chopper","Brook",
            "Ussop","Zoro","Vivi"};
        System.out.println(" Before Sorted " + strawhats );
        
                Arrays.sort(strawhats);
        for(int i = 0; i<= strawhats.length -1; i++){
           System.out.println(strawhats[i] );
        }
       


       

    }
}
