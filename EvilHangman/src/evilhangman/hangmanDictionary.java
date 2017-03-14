/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evilhangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author wuwei
 */
public class hangmanDictionary {
    private HashMap<Integer, HashSet<String>> map; //mapping with words organized by length
	private String cFamilyKey;

    public hangmanDictionary(String dict) throws FileNotFoundException {
        File testDict=new File(dict);
        Scanner input = new Scanner(testDict);
			map = new HashMap<Integer, HashSet<String>>();
			HashSet<String> tempSet = new HashSet<String>();
			int wordLength;
			String word;
			while(input.hasNext()){
				word = input.next();
				wordLength = word.length();
				if(map.containsKey(wordLength)){
					tempSet = map.get(wordLength);
				}
				else{
					tempSet = new HashSet<String>();
				}
				tempSet.add(word);
				map.put(wordLength, tempSet);
    }
    
}
}
