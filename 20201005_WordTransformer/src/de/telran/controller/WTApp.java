package de.telran.controller;

import de.telran.data.TransformerRuleLength3;
import de.telran.data.TransformerRuleLength6;
import de.telran.data.TransformerRulesLength4;
import de.telran.data.WordTransformer;

public class WTApp {
    public static void main(String[] args) {
        TransformerRuleLength3 tr3 = new TransformerRuleLength3();
        TransformerRuleLength3 tr4 = new TransformerRulesLength4();

       // System.out.println(WordTransformer.wordTransform("aghJ kLU jgkslg ttt")); // aghJ KLU jgkslg TTT
        //System.out.println(WordTransformer.wordTransformTwo("AGHJ kLU jgkslg ttt", 1)); //AGHJ KLU jgkslg TTT
       // System.out.println(WordTransformer.wordTransformTwo("AGHJ kLU jgkslg ttt", 2)); //AGHJ kLU jgkslg ttt
       // System.out.println(WordTransformer.wordTransformTree("AGHJ kLU jgkslg ttt", tr3)); //AGHJ KLU jgkslg TTT
       // System.out.println(WordTransformer.wordTransformTree("AGHJ kLU jgkslg ttt", tr4)); //aghj kLU jgkslg ttt
       // System.out.println(WordTransformer.wordTransformTree("AGHJ kLU jgkslg ttt", new TransformerRuleLength6()));
       //AGHJ kLU ****** ttt
       // System.out.println(WordTransformer.wordTransformTree("dhfjks jgkslg ghfhhr", new TransformerRuleLength6()));
       //****** ****** ******
    }
}
