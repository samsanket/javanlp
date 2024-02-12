package org.javanlp.com.project.nlp;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

public class Pipeline {
    private static Properties properties;
    private static final String propritesName = "tokenize, ssplit , pos";
    private static StanfordCoreNLP stanfordCoreNLP;

    private Pipeline() {
    System.out.println("Geetting the pipeline object ");
    }

    static {
        System.out.println();
        properties= new Properties();
        properties.setProperty("annotators",propritesName);
    }

    public static StanfordCoreNLP getPipeLine() {
        System.out.println("Geeting StanfordCoreNLP object  ");
        if (stanfordCoreNLP == null) {
            System.out.println("Stanford core nlp object is null ");
            System.out.println("Creating new object ");
            stanfordCoreNLP = new StanfordCoreNLP(properties);
            System.out.println("Object created success ");
        }
        System.out.println("Returing new object ");
        System.out.println(stanfordCoreNLP.getProperties().toString());
        return stanfordCoreNLP;
    }
}
