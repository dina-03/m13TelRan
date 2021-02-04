package de.telran;

import de.telran.action.CapitalLettersFileAction;
import de.telran.action.ReplaceFileAction;
import de.telran.action.SpacesToStarsFileAction;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileActionTest {

    FileOperations fo = new FileOperations();
    List<String> text = Arrays.asList("Далеко-далеко за словесными горами в стране гласных и согласных живут рыбные тексты.");

    @Test
    public void test_replaceFileAction() throws IOException {
        fo.writeList(text, "textReplace.txt");
        ReplaceFileAction pfa = new ReplaceFileAction(new FileOperations()," ","#");
        pfa.handleFile("textReplace.txt");
        List<String> list = Arrays.asList("Далеко-далеко#за#словесными#горами#в#стране#гласных#и#согласных#живут#рыбные#тексты.");
       assertEquals(list,fo.readToList("textReplace.txt"));
    }

    @Test
    public void test_capitalLettersFileAction()throws IOException{
        fo.writeList(text,"textCap.txt");
        FileAction cap = new CapitalLettersFileAction(new FileOperations());
        cap.handleFile("textCap.txt");
        List<String> list = Arrays.asList("ДАЛЕКО-ДАЛЕКО ЗА СЛОВЕСНЫМИ ГОРАМИ В СТРАНЕ ГЛАСНЫХ И СОГЛАСНЫХ ЖИВУТ РЫБНЫЕ ТЕКСТЫ.");
        assertEquals(list,fo.readToList("textCap.txt"));
    }

    @Test
    public void test_spaceToStarsFileAction()throws IOException{
        fo.writeList(text,"textSpace.txt");
        FileAction spa = new SpacesToStarsFileAction(new FileOperations());
        spa.handleFile("textSpace.txt");
        List<String> list = Arrays.asList("Далеко-далеко*за*словесными*горами*в*стране*гласных*и*согласных*живут*рыбные*тексты.");
        assertEquals(list,fo.readToList("textSpace.txt"));
    }
}