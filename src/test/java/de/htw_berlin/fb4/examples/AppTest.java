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

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import de.htw_berlin.fb4.ossd.prose.Prose;
import de.htw_berlin.fb4.ossd.prose.Sentence;
import de.htw_berlin.fb4.ossd.prose.ProseBuilder;

/**
 * Unit tests for the Prose and Sentence implementations.
 */
public class AppTest {
    private Sentence sentence;
    private Prose prose;
    
    @Before
    public void setUp() {
        sentence = new SimpleSentence();
        prose = new SimpleProse();
    }
    
    @After
    public void tearDown() {
        sentence = null;
        prose = null;
    }

    /**
     * Test the SimpleSentence class functionality
     */
    @Test
    public void testSimpleSentence() {
        assertNotNull("Sentence should not be null", sentence);
        assertNotNull("Sentence content should not be null", sentence.get());
        assertTrue("Sentence should contain text", sentence.get().length() > 0);
    }

    /**
     * Test the SimpleProse class functionality
     */
    @Test
    public void testSimpleProse() {
        assertNotNull("Prose should not be null", prose);
        assertNotNull("Prose content should not be null", prose.get());
        assertTrue("Prose should contain text", prose.get().length() > 0);
    }

    /**
     * Test the conversion from Prose to Sentence
     */
    @Test
    public void testConversion() {
        Sentence convertedSentence = SimpleSentence.toSentence(prose);
        
        assertNotNull("Converted sentence should not be null", convertedSentence);
        assertEquals("Converted sentence should contain the prose text", 
                     prose.get(), convertedSentence.get());
    }

    /**
     * Test the ProseBuilder with our implementations
     */
    @Test
    public void testProseBuilder() {
        ProseBuilder pb = new ProseBuilder();
        pb.register(sentence);
        
        Sentence convertedSentence = SimpleSentence.toSentence(prose);
        pb.register(convertedSentence);
        
        String result = pb.get();
        assertNotNull("ProseBuilder result should not be null", result);
        assertTrue("ProseBuilder result should contain content", result.length() > 0);
    }
}
