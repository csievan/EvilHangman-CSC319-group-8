/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evilhangman;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author redninjasir
 */
public class Dictionary {

    HashMap map = new HashMap();
    String Familykey;
    File file;
    int count;

    public Dictionary(String file) {
        this.file = new File("dictionary.txt");
        this.count = 0;
    }

    public String format(String word, char ch, String CurrendFk) {
        return "asdf";
    }

    public HashSet<String> game(HashSet<String> remaingingWords, char ch, String currentFamilyK) throws FileNotFoundException {

        // Read the file using whitespace as a delimiter (default)
// so that the input will be split into words
        Scanner sc = new Scanner(new File("dictionary.txt"));

        Set<String> crime = new HashSet<>();
// For each word in the input
        while (sc.hasNext()) {
            // Convert the word to lower case, trim it and insert into the set
            // In this step, you will probably want to remove punctuation marks
            crime.add(sc.next().trim().toLowerCase());
        }

        System.out.println("Enter a word to search for: ");
        Scanner input = new Scanner(System.in);
// Also convert the input to lowercase
        String search = input.next().toLowerCase();

// Check if the set contains the search string
        if (crime.contains(search)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        return null;

    }

    public HashSet getSet(int wordLength) {
        return null;

    }

    public boolean validWordLength() {
        return false;
    }

    public String getFamilykey() {
        return Familykey;
    }

    public static void readFile() {
        Map<String, String> questions = new HashMap<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream(new File("dictionary.txt")));
            while (scanner.hasNext()) {
                String question = scanner.nextLine();
                String answer = scanner.nextLine();
                questions.put(question, answer);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dictionary.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        // get an iterator
        Iterator<Map.Entry<String, String>> itr = questions.entrySet().iterator();
        // and go through it
        while (itr.hasNext()) {
            // get the entryset from your map
            Map.Entry<String, String> value = itr.next();
            // return only the key
            String question = value.getKey();
            System.out.println("Get answer by key: " + questions.get(question));
            System.out.println("Question: " + value.getKey() + " - Answer: " + value.getValue());
        }
    }

    public static void read() {
        try {
            // Read the file using whitespace as a delimiter (default)
// so that the input will be split into words
            Scanner sc = new Scanner(new File("dictionary.txt"));

            Set<String> crime = new HashSet<>();
// For each word in the input
            while (sc.hasNext()) {
                // Convert the word to lower case, trim it and insert into the set
                // In this step, you will probably want to remove punctuation marks
                crime.add(sc.next().trim().toLowerCase());
            }

            System.out.println("Enter a word to search for: ");
            Scanner input = new Scanner(System.in);
// Also convert the input to lowercase
            String search = input.next().toLowerCase();

// Check if the set contains the search string
            if (crime.contains(search)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dictionary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
