package de.htw_berlin.fb4.examples;

import de.htw_berlin.fb4.ossd.prose.Sentence;
import de.htw_berlin.fb4.ossd.prose.Prose;

/**
 * A simple implementation of the Sentence interface.
 * This class represents a single sentence and provides functionality
 * to convert Prose objects into Sentence objects. It maintains its text content
 * and can be used as a building block in larger text compositions through
 * the ProseBuilder system.
 * 
 * @author Jana Maire
 * @version 1.0.0
 * @see de.htw_berlin.fb4.ossd.prose.Sentence
 * @see de.htw_berlin.fb4.ossd.prose.Prose
 */
public class SimpleSentence implements Sentence {
    private String text = "Hallo, das ist ein einfacher Satz.";

    /**
     * Converts a Prose object into a Sentence object.
     * This static factory method creates a new SimpleSentence instance
     * containing the text from the provided Prose object.
     * 
     * @param prose The Prose object to convert
     * @return A new Sentence object containing the text from the Prose object
     * @throws NullPointerException if the provided Prose object is null
     * @see de.htw_berlin.fb4.ossd.prose.Prose#get()
     */
    public static Sentence toSentence(Prose prose) {
        SimpleSentence sentence = new SimpleSentence();
        sentence.text = prose.get();
        return sentence;
    }

    /**
     * Returns the text content of this sentence.
     * This method implements the {@link Sentence#get()} method from the Sentence interface.
     * The text content represents a single sentence that can be used in text composition.
     * 
     * @return The sentence text as a String
     */
    @Override
    public String get() {
        return text;
    }
}