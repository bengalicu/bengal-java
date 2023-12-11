/*
 *  Copyright (c) 2002-2023, Manorrock.com. All Rights Reserved.
 */
package icu.bengal.interpreter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 * The JUnit tests for the Bengal interpreter.
 * 
 * @author Manfred Riem (mriem@manorrock.com)
 */
public class BengalInterpreterTest {
    
    /**
     * Test run method.
     */
    @Disabled
    @Test
    public void testRun() {
        BengalInterpreter interpreter = new BengalInterpreter();
        assertThrows(UnsupportedOperationException.class, () -> { interpreter.run(); });
    }
}
