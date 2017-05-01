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

    HashMap<Integer, String> dmap;
    String Familykey;
    File file;
    int count;
    int count1;
    String word;
    String newWord;

    public Dictionary(String file) {
        this.dmap = new HashMap<>();
        this.file = new File("dictionary.txt");
        this.count = 0;
        this.count1 = 0;
    }

    public void ReadWord() {
        try {
            Scanner sc = new Scanner(new File("dictionary.txt"));
            while (sc.hasNext()) {
                String sci = sc.next().trim().toLowerCase();
                dmap.put(sci.length(), sci);
            }
            /*if(dmap.values().toString().length() == ranlength){
               List<String> value = new ArrayList<>(dmap.values());
            }*/
            List<Integer> key = new ArrayList<>(dmap.keySet());
            int randomIn = new Random().nextInt(key.size());
            word = dmap.get(randomIn);
            //int wordlength = word.length();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dictionary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getWord() {
        return word;
    }
}
