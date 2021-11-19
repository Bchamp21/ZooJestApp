/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo06group;



import java.util.Arrays;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Math.log;
import static java.rmi.server.LogStream.log;

/**
 * RelayHorse class extends from parent class Animal
 *
 * @author BUHVAN CHANDRA SARAKAM S544899
 */
public class RelayHorse extends Animal {
    
    /**
     * RelayHorse constructor
     * @param name - the name of this RelayHorse
     */
    public RelayHorse(String name){
        super(name);
    }
    
    /**
     * Custom speak method
     */
    @Override
    public void speak() {
        System.out.printf("I'm an RelayHorse!\n", this.name);
    }
    
    
    /**
     * Custom move method
     */
    @Override
    public void move() {
        System.out.println("When I move, I Run, Run, Run.");
    }

    /**
     * Custom profess method
     */
    void profess() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     /**
     * Custom RelayHorse function 
     *
     * @param first double input
     * @param second int input
     * @return double sum 
     */
    double getRelayHorseAddition(double first, int second) {
        return first+second;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int i=1000;
    public int j=0;
    
    public void divide(){
        System.out.println("==========================================");
        System.out.println("DIVIDING with possible ArithmeticException");
        System.out.println("==========================================");
        try {
            System.out.printf("About to divide %d by %d...", i, j);
            System.out.println();
            var result = i / j;
            System.out.println(result);

        } catch (ArithmeticException ex) {
            System.out.println("ERROR toString():       " + ex.toString());
            System.out.println("ERROR class:            " + ex.getClass());
            System.out.println("ERROR localized message:" + ex.getClass());
            System.out.println("ERROR message:          " + ex.getMessage());
//            System.out.println("ERROR stacktrace:     \n" + Arrays.toString(ex.getStackTrace()));
        }
    }
    
        // declare variables in try-catch-finally outside the blocks
        FileReader reader = null;
        String filename = "ROOT_FILEZ.txt";
        
    public void fileerror() throws IOException{

        try {
            reader = new FileReader(filename);
            reader.read();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: FileNotFoundException for " + filename);
        } catch (IOException e) {
            System.out.println("ERROR: Other IOException. " + e.toString());
        } finally {
            try {
                reader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("ERROR: can't call close() on something that doesn't exist (null). " + e.toString());
            }
        }

        // catching & handling an exception thown by a function
        try {
            int result = tryReadingFile(filename);
            System.out.println("SUCCESS: read " + filename + " result:" + result);

        } catch (IOException ex) {
            System.out.println("ERROR:Bhuvan " + filename);
        }
//        log.info("Exiting main() ");

    }
    
        /**
     * A function is a clean way to wrap up a bit of processing code. Often, the
     * function doesn't know how exceptions should be handled, so if they get an
     * exception they just throw it up to the calling method.
     *
     * @param fn - the file name to be read
     * @return - int result of reading the file
     * @throws FileNotFoundException - Cannot find that path and file
     * @throws IOException - other read/write exception
     */
    private static int tryReadingFile(String fn) throws FileNotFoundException, IOException {
        System.out.println("==========================================");
        System.out.println("THROWING EXCEPTIONS FROM FUNCTION");
        System.out.println("==========================================");
        FileReader reader;
        reader = new FileReader(fn);
        var result = reader.read();
        reader.close();
        return result;
    }

        
        

    public static void main(String[] args) throws IOException {
        var a = new RelayHorse("Tester");
        a.speak();
        a.move();
        a.profess();
        a.getRelayHorseAddition(12.0,20);
        a.divide();
        a.fileerror();
    }





    
}
