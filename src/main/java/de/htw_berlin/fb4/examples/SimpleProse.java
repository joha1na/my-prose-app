package de.htw_berlin.fb4.examples;

import de.htw_berlin.fb4.ossd.prose.Prose;

/**
 * Eine einfache Implementierung der Prose-Schnittstelle.
 */
public class SimpleProse implements Prose {
    private String text = "Dies ist ein einfacher Prose-Text, der die Prose-Schnittstelle implementiert.";

    @Override
    public String get() {
        return text;
    }
}
