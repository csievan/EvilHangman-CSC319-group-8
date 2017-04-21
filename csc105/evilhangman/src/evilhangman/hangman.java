/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evilhangman;

/**
 *
 * @author redninjasir
 */
public class hangman {

    Dictionary Dic;
    String showWords;
    int wordlength;
    String[] guesssLetters;
    String dashLine;
    int guessCount;
    boolean gameResult;
    String ChosenWord;

    public void hangman() {
    }

    public void setWordlength(int wordlength) {
        this.wordlength = wordlength;
    }

    public int getWordlength() {
        return wordlength;
    }

    public int getGuessCount() {
        return guessCount;
    }

    public boolean getGameResult() {
        return gameResult;
    }

    public String getChosenWord() {
        return ChosenWord;
    }

    public String[] setGuessLetter(String ch) {//ch : char
        String[] a = {" "};
        String[] b = {"Error"};
        if (ch.length() < 1) {
            if (ch.equals(" ") == false) {
                guesssLetters[guessCount] = ch;
                guessCount++;
                return a;
            } else {
                return b;
            }
        } else {
            return b;
        }
    }

    public boolean isGuessletterRepeated() {
        boolean check = false;
        for(int i = 0;i<guesssLetters.length;i++){
            if(guesssLetters[i].equals(guesssLetters[guessCount]))
                check = false;
            else
                check = true;
        }
        return check;
    }
    public boolean isLetterRightGuess() {
        return true;
    }

    public boolean selectWords() {
        return false;
    }

    public Dictionary WordListEliminating(Dictionary Dic) {//Dic : Dictionary
        return Dic;
    }

    public int setGuessCount() {

        return guessCount;
    }

    public boolean setGameResult() {
        return gameResult;
    }

    public String setChosenWord() {
        return ChosenWord;
    }

    public String displayDashLine() {
        return dashLine;
    }

    public String[] guessesLetters(String ch) { //ch : char
        return guesssLetters;
    }

    public void displayGuessesLetters(String letter) {
        for (String guesssLetter : guesssLetters) {
            letter = guesssLetter + "";
        }
        System.out.println(letter);
    }

    public int Remainningwords() {
        return wordlength;
    }
}
