package org.javanlp.com.project.nlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class TokenizeExample {

    public static void main(String[] args) {
        System.out.println("Applicaiton started ");
        StanfordCoreNLP coreNLP = Pipeline.getPipeLine();
        System.out.println("get the core nlp object succeess ");
        String text="Hey! , This is sanket deshpande";
        System.out.println("text intilized ");
        CoreDocument coreDocument=new CoreDocument(text);
        System.out.println("get the coredocument object success  ");
        coreNLP.annotate(coreDocument);
        System.out.println("Printing the data ");
        List<CoreLabel> tokens = coreDocument.tokens();
        for (CoreLabel  coreLabel: tokens){
            System.out.println(coreLabel.originalText());
        }

    }
}
