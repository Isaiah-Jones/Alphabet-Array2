 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabetarray2;

/**
 * CSC 206 
 * Mr.Osborne
 * @author Isaiah J Jones
 * 2-28-17
 */
public class AlphabetArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create an array of 100 chacracters
        char[] letters = new char[100];

        //Fill the array with random letters form "a" to "z"
        for (int i = 0; i < letters.length; i++) {
            letters[i] = AlphabetArray2.getRandomLowerCaseLetter(); 
        }

        //Print the array in a 10x10 table
        System.out.println("BEFORE: ");
        print10(letters);
        
        System.out.println();
        
        //Sort the array
        //Print out the arranged array
        System.out.println("AFTER: ");
        AlphaSort(letters);
        print10(letters);

    }

    public static char getRandomCharacter(char a, char z) {
        return (char) (a + Math.random() * (z - a + 1));
    }

    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    public static void print10(char[] letters) {
        for (int j = 0; j < letters.length; j++) {
            if (j == 9 || j == 19 || j == 29 || j == 39 || j == 49 | j == 59 || j == 69 || j == 79 || j == 89 || j == 99) {
                System.out.println(letters[j] + " ");
            } else {
                System.out.print(letters[j] + " ");
            }
        }
    }

    public static void AlphaSort(char[] letterClone) {
        for (int i = 0; i < letterClone.length - 1; i++) {

            char currentMin = letterClone[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < letterClone.length; j++) {
                if (currentMin > letterClone[j]) {
                    currentMin = letterClone[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                letterClone[currentMinIndex] = letterClone[i];
                letterClone[i] = currentMin;
            }
        }
    }
}
