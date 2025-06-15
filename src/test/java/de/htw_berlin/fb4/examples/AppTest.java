/*
 * My Prose App - A Java project demonstrating text composition
 * Copyright (c) 2025 Jana Maire
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

/*
 * My Prose App - A Java project demonstrating text composition
 * Copyright (c) 2025 Jana Maire
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package de.htw_berlin.fb4.examples;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import de.htw_berlin.fb4.ossd.prose.Prose;
import de.htw_berlin.fb4.ossd.prose.Sentence;
import de.htw_berlin.fb4.ossd.prose.ProseBuilder;

/**
 * Unit tests for the Prose and Sentence implementations.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Test the SimpleSentence class functionality
     */
    public void testSimpleSentence() {
        Sentence sentence = new SimpleSentence();
        assertNotNull("Sentence should not be null", sentence);
        assertNotNull("Sentence content should not be null", sentence.get());
        assertTrue("Sentence should contain text", sentence.get().length() > 0);
    }

    /**
     * Test the SimpleProse class functionality
     */
    public void testSimpleProse() {
        Prose prose = new SimpleProse();
        assertNotNull("Prose should not be null", prose);
        assertNotNull("Prose content should not be null", prose.get());
        assertTrue("Prose should contain text", prose.get().length() > 0);
    }

    /**
     * Test the conversion from Prose to Sentence
     */
    public void testConversion() {
        Prose prose = new SimpleProse();
        Sentence sentence = SimpleSentence.toSentence(prose);
        
        assertNotNull("Converted sentence should not be null", sentence);
        assertEquals("Converted sentence should contain the prose text", 
                     prose.get(), sentence.get());
    }

    /**
     * Test the ProseBuilder with our implementations
     */
    public void testProseBuilder() {
        Sentence s1 = new SimpleSentence();
        Prose prose = new SimpleProse();
        Sentence s3 = SimpleSentence.toSentence(prose);
        
        ProseBuilder pb = new ProseBuilder();
        pb.register(s1);
        pb.register(s3);
        
        String result = pb.get();
        assertNotNull("ProseBuilder result should not be null", result);
        assertTrue("ProseBuilder result should contain content", result.length() > 0);
    }
}
