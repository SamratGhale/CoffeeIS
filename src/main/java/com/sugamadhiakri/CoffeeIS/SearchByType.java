/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sugamadhiakri.CoffeeIS;

import java.util.ArrayList;

/**
 *
 * @author samra
 */
public class SearchByType {
    public static ArrayList<Coffee> searchByType(ArrayList<Coffee> items,String types){
        ArrayList<Coffee> ret = new ArrayList<>();
        for(Coffee c:items){
            if (types == null ? c.getCategory() == null : types.equals(c.getCategory())){
                ret.add(c);
            }
        }
        return ret;
    }
    
}
