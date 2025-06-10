package de.htw_berlin.fb4.examples;

import de.htw_berlin.fb4.ossd.prose.Prose;

/**
 * A simple implementation of the Prose interface.
 * This class provides an immutable prose text that can be used as a basic
 * text container in the prose composition system. The text content is
 * initialized upon creation and remains constant throughout the object's lifecycle.
 * 
 * @author Jana Maire
 * @version 1.0.0
 * @see de.htw_berlin.fb4.ossd.prose.Prose
 */
public class SimpleProse implements Prose {
    private String text = "Dies ist ein einfacher Prose-Text, der die Prose-Schnittstelle implementiert.";

    /**
     * Returns the text content of this prose object.
     * This method implements the {@link Prose#get()} method from the Prose interface.
     * 
     * @return The prose text as a String, which is immutable for this implementation
     */
    @Override
    public String get() {
        return text;
    }
}
