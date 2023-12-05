/*
 *  Copyright (c) 2002-2023, Manorrock.com. All Rights Reserved.
 */
package icu.bengal.interpreter;

/**
 * The Bengal Interpreter.
 * 
 * @author Manfred Riem (mriem@manorrock.com)
 */
public class BengalInterpreter implements Runnable {

    private void eval() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Main method.
     * 
     * @param arguments the arguments.
     */
    public static void main(String[] arguments) {
        BengalInterpreter interpreter = new BengalInterpreter();
        interpreter.run();
    }

    private void print() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void prompt() {
        System.out.print("> " );
    }
    
    private void read() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void run() {
        for(;;) {
            prompt();
            read();
            eval();
            print();
        }
    }
}
