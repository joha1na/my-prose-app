package de.htw_berlin.fb4.examples;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;
import de.htw_berlin.fb4.ossd.prose.Sentence;
import de.htw_berlin.fb4.ossd.prose.Prose;

public class App
{
    public static void main( String[] args )
    {
        Sentence s1 = new SimpleSentence();
        Sentence s2 = new SimpleSentence();
        Prose prose = new SimpleProse();
        
        // Konvertierung von Prose zu Sentence
        Sentence s3 = SimpleSentence.toSentence(prose);
        
        ProseBuilder pb = new ProseBuilder();
        pb.register(s1);
        pb.register(s2);
        pb.register(s3);
        System.out.println(pb.get());
    }
}
