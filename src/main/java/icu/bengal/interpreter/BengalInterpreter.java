/*
 *  Copyright (c) 2002-2023, Manorrock.com. All Rights Reserved.
 */
package icu.bengal.interpreter;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * The Bengal Interpreter.
 *
 * @author Manfred Riem (mriem@manorrock.com)
 */
public class BengalInterpreter implements Runnable {

    /**
     * Stores our reader.
     */
    private LineNumberReader reader = new LineNumberReader(new InputStreamReader(System.in));

    /**
     * Stores our input lines.
     */
    private StringBuilder lines = new StringBuilder();

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

    /**
     * Show the prompt.
     */
    private void prompt() {
        System.out.print("> ");
    }

    /**
     * Read the input.
     */
    private void read() {
        try {
            String line = reader.readLine();
            while (line != null) {
                lines.append(line).append("\n");
                line = reader.readLine();
            }
        } catch (IOException ioe) {
        }
    }

    @Override
    public void run() {
        for (;;) {
            prompt();
            read();
            eval();
            print();
        }
    }
}
