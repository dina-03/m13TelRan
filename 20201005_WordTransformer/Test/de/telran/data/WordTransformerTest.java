package de.telran.data;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordTransformerTest {
    String str = "aghJ kLU jgkslg ttt";
    WordTransformer wt = new WordTransformer();
    TransformerRuleLength3 tr3 = new TransformerRuleLength3();
    TransformerRulesLength4 tr4 = new TransformerRulesLength4();
    TransformerRuleLength6 tr6 = new TransformerRuleLength6();

    @Test
    public void testWordTransform() {
        String string = wt.wordTransform(str);
        String input = "aghJ KLU jgkslg TTT";
        Assert.assertEquals(input, string);
    }

    @Test
    public void testWordTransformTwo() {
        String str1 = "AGHJ KLU jgkslg TTT";
        String input = wt.wordTransformTwo("AGHJ kLU jgkslg ttt", 1);
        Assert.assertEquals(input, str1);
    }

    @Test
    public void testWordTransformTwo2() {
        String str1 = "AGHJ kLU jgkslg ttt";
        String input = wt.wordTransformTwo("AGHJ kLU jgkslg ttt", 2);
        Assert.assertEquals(input, str1);
    }

    @Test
    public void testWordTransformTreeTr3() {
        String str = wt.wordTransformTree("AGHJ kLU jgkslg ttt", tr3);
        String output = "AGHJ KLU jgkslg TTT";
        Assert.assertEquals(str, output);
    }

    @Test
    public void testWordTransformTreeTr4() {
        String str = wt.wordTransformTree("AGHJ kLU jgkslg ttt", tr4);
        String output = "aghj kLU jgkslg ttt";
        Assert.assertEquals(str, output);
    }

    @Test
    public void testWordTransformTreeTr6() {
        String str = wt.wordTransformTree("AGHJ kLU jgkslg ttt", tr6);
        String output = "AGHJ kLU ****** ttt";
        Assert.assertEquals(str, output);
    }

}