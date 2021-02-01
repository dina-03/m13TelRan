package de.telran;

import de.telran.concatenator.IPrintStream;
import de.telran.concatenator.IPrintWriter;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class PrintConcatenation {
    public static void main(String[] args) throws IOException {
        String filenamePW = "pw.txt";
        String filenamePS = "ps.txt";
        List<String> stringList = Arrays.asList("\"Well, Prince, so Genoa and Lucca are now just family estates of " +
                "the\n" +
                "Buonapartes. But I warn you, if you don't tell me that this means war,\n" +
                "if you still try to defend the infamies and horrors perpetrated by that\n" +
                "Antichrist--I really believe he is Antichrist--I will have nothing more\n" +
                "to do with you and you are no longer my friend, no longer my 'faithful\n" +
                "slave,' as you call yourself! But how do you do? I see I have frightened\n" +
                "you--sit down and tell me all the news.\"\n" +
                "\n" +
                "It was in July, 1805, and the speaker was the well-known Anna Pavlovna\n" +
                "Scherer, maid of honor and favorite of the Empress Marya Fedorovna. With\n" +
                "these words she greeted Prince Vasili Kuragin, a man of high rank and\n" +
                "importance, who was the first to arrive at her reception. Anna Pavlovna\n" +
                "had had a cough for some days. She was, as she said, suffering from la\n" +
                "grippe; grippe being then a new word in St. Petersburg, used only by the\n" +
                "elite.\n" +
                "\n" +
                "All her invitations without exception, written in French, and delivered\n" +
                "by a scarlet-liveried footman that morning, ran as follows:\n" +
                "\n" +
                "\"If you have nothing better to do, Count (or Prince), and if the\n" +
                "prospect of spending an evening with a poor invalid is not too terrible,\n" +
                "I shall be very charmed to see you tonight between 7 and 10--Annette\n" +
                "Scherer.\"\n" +
                "\n" +
                "\"Heavens! what a virulent attack!\" replied the prince, not in the\n" +
                "least disconcerted by this reception. He had just entered, wearing an\n" +
                "embroidered court uniform, knee breeches, and shoes, and had stars on\n" +
                "his breast and a serene expression on his flat face. He spoke in that\n" +
                "refined French in which our grandfathers not only spoke but thought, and\n" +
                "with the gentle, patronizing intonation natural to a man of importance\n" +
                "who had grown old in society and at court. He went up to Anna Pavlovna,\n" +
                "kissed her hand, presenting to her his bald, scented, and shining head,\n" +
                "and complacently seated himself on the sofa.\n" +
                "\n" +
                "\"First of all, dear friend, tell me how you are. Set your friend's mind\n" +
                "at rest,\" said he without altering his tone, beneath the politeness\n" +
                "and affected sympathy of which indifference and even irony could be\n" +
                "discerned.\n" +
                "\n" +
                "\"Can one be well while suffering morally? Can one be calm in times like\n" +
                "these if one has any feeling?\" said Anna Pavlovna. \"You are staying the\n" +
                "whole evening, I hope?\"\n" +
                "\n" +
                "\"And the fete at the English ambassador's? Today is Wednesday. I must\n" +
                "put in an appearance there,\" said the prince. \"My daughter is coming for\n" +
                "me to take me there.\"\n" +
                "\n" +
                "\"I thought today's fete had been canceled. I confess all these\n" +
                "festivities and fireworks are becoming wearisome.\"\n" +
                "\n" +
                "\"If they had known that you wished it, the entertainment would have been\n" +
                "put off,\" said the prince, who, like a wound-up clock, by force of habit\n" +
                "said things he did not even wish to be believed.\n" +
                "\n" +
                "\"Don't tease! Well, and what has been decided about Novosiltsev's\n" +
                "dispatch? You know everything.\"");

        IConcatenator printWriter = new IPrintWriter();
        IConcatenator printStream = new IPrintStream();

        IPrintTest test;
        test = new IPrintTest(printWriter);
        test.test(100000, stringList, filenamePW);

        IPrintTest test1;
        test1 = new IPrintTest(printStream);
        test1.test(100000, stringList, filenamePS);
    }
}
