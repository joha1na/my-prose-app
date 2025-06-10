package de.htw_berlin.fb4.examples;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;
import de.htw_berlin.fb4.ossd.prose.Sentence;
import de.htw_berlin.fb4.ossd.prose.Prose;

/**
 * Main application class for demonstrating the Prose and Sentence implementations.
 * This class shows the usage of the ProseBuilder class and the conversion
 * between Prose and Sentence objects.
 * 
 * @author Jana Maire
 * @version 1.0.0
 * @see de.htw_berlin.fb4.ossd.prose.Sentence
 * @see de.htw_berlin.fb4.ossd.prose.Prose
 * @see de.htw_berlin.fb4.ossd.prose.ProseBuilder
 */
public class App {
    /**
     * The main method of the application.
     * Creates various Sentence and Prose objects, converts between them,
     * and uses the ProseBuilder to compose the texts.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main( String[] args )
    {
        Sentence s1 = new SimpleSentence();
        Sentence s2 = new SimpleSentence();
        Prose prose = new SimpleProse();
        
        // Conversion from Prose to Sentence: This step demonstrates how a Prose object can be transformed into a Sentence object 
        // to enable further processing / registration in the ProseBuilder for text composition.
        Sentence s3 = SimpleSentence.toSentence(prose);
        
        ProseBuilder pb = new ProseBuilder();
        pb.register(s1);
        pb.register(s2);
        pb.register(s3);
        System.out.println(pb.get());
    }
}
