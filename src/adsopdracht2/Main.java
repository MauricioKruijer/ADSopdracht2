/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adsopdracht2;

/**
 *
 * @author John
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Word word = new Word("JOHNHOJ");
        Math math = new Math(9, 8);
        word.print();
        System.out.println("");
        word.printr();
        System.out.println("");
        word.checkPalin();
        System.out.println(math.doMath());
        
    }
}