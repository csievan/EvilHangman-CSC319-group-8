/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evilhangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author redninjasir
 */
public class Dictionary {

    HashMap<Integer, String> map;
    String Familykey;
    File file;
    int count;
    String word;

    public Dictionary(String file) {
        this.map = new HashMap<>();
        this.file = new File("dictionary.txt");
        this.count = 0;
    }
    public void ReadWord() {
        try {
            Scanner sc = new Scanner(new File("dictionary.txt"));
            while (sc.hasNext()) {
                count++;
                map.put(count, sc.next().trim().toLowerCase());
            }
            List<Integer> key = new ArrayList<>(map.keySet());
            int randomIn = new Random().nextInt(key.size());
            //System.out.println("Enter a word to search for: ");
            //Scanner input = new Scanner(System.in);
            //int search = input.nextInt();
            word = map.get(randomIn);
            //System.out.println(map.get(search));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dictionary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String getWord(){
        return word;
    }

}
