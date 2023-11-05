/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multidimimensionalarray;

/**
 *
 * @author Dell-User
 */
public class MultiDimimensionalArray {

    //this program access the array element of 2d
    public static void main(String[] args) {
        int[][] Numbers = {{1,2,3,4},{5,6,7,8,9}};
        
       for(int i=0; i<Numbers.length; i++){
           for(int j=0; j<Numbers[i].length; j++){
               System.out.println(Numbers[i][j]);
           }
       }
    }
}
