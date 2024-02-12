package org.javanlp.com.project.nlp;

import edu.stanford.nlp.ling.CoreAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.parser.common.ParserAnnotations;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class POSExample {

    public static void main(String[] args) {
        StanfordCoreNLP coreNLP = Pipeline.getPipeLine();
        String text="Hey !, I am sanket Deshpande";
        CoreDocument coreDocument= new CoreDocument(text);
        coreNLP.annotate(coreDocument);
        List<CoreLabel> tokens = coreDocument.tokens();

        for (CoreLabel coreLabel:tokens){
            String pos= coreLabel.get(CoreAnnotations.PartOfSpeechAnnotation.class);
            System.out.println(coreLabel.originalText() + " = " + pos);
        }
    }
}
