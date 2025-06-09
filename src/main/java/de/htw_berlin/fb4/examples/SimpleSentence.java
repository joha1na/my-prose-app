package de.htw_berlin.fb4.examples;

import de.htw_berlin.fb4.ossd.prose.Sentence;
import de.htw_berlin.fb4.ossd.prose.Prose;

/**
 * Eine einfache Implementierung der Sentence-Schnittstelle.
 */
public class SimpleSentence implements Sentence {
    private String text = "Hallo, das ist ein einfacher Satz.";

    public static Sentence toSentence(Prose prose) {
        SimpleSentence sentence = new SimpleSentence();
        sentence.text = prose.get();
        return sentence;
    }

    @Override
    public String get() {
        return text;
    }
}