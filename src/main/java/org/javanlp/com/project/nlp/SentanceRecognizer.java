package org.javanlp.com.project.nlp;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class SentanceRecognizer {
    public static void main(String[] args) {
        StanfordCoreNLP coreNLP = Pipeline.getPipeLine();
        String text="Hey !, I am sanket deshpande. I am software developer . I write a code ";
        CoreDocument coreDocument= new CoreDocument(text);
        coreNLP.annotate(coreDocument);
        List<CoreSentence> sentences = coreDocument.sentences();

        sentences.forEach(System.out::println);

    }
}
