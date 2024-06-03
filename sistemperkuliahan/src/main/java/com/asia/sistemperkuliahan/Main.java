/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asia.sistemperkuliahan;
/**
 *
 * @author A-25
 */
import com.asia.sistemperkuliahan.sistemlogic.SistemPerkuliahan;
import com.asia.sistemperkuliahan.ui.TextUI;
import java.util.Scanner;

public class Main {
    
    // private static DataManager dataManager;
    public static void main(String[] args) {
        // Create DataManager instance (specify array sizes)
        //dataManager = new dataManager(!00, 50, 20, 200);
        SistemPerkuliahan sistemPerkuliahan = new SistemPerkuliahan();
        TextUI ui = new TextUI();
        ui.run();
    }
}

    



    





