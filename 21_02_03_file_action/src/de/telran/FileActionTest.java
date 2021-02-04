package de.telran;

import de.telran.action.CapitalLettersFileAction;
import de.telran.action.ReplaceFileAction;
import de.telran.action.SpacesToStarsFileAction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FileActionTest {
   // @Mock
    FileOperations fileOperations;
    // @InjectMocks
    FileAction capLet;

    /*FileOperations fo = new FileOperations();
    List<String> text = Arrays.asList("Далеко-далеко за словесными горами в стране гласных и согласных живут рыбные
    тексты.");

    @Test
    public void test_replaceFileAction() throws IOException {
        fo.writeList(text, "textReplace.txt");
        ReplaceFileAction pfa = new ReplaceFileAction(new FileOperations()," ","#");
        pfa.handleFile("textReplace.txt");
        List<String> list = Arrays.asList
        ("Далеко-далеко#за#словесными#горами#в#стране#гласных#и#согласных#живут#рыбные#тексты.");
       assertEquals(list,fo.readToList("textReplace.txt"));
    }

    @Test
    public void test_capitalLettersFileAction()throws IOException{
        fo.writeList(text,"textCap.txt");
        FileAction cap = new CapitalLettersFileAction(new FileOperations());
        cap.handleFile("textCap.txt");
        List<String> list = Arrays.asList("ДАЛЕКО-ДАЛЕКО ЗА СЛОВЕСНЫМИ ГОРАМИ В СТРАНЕ ГЛАСНЫХ И СОГЛАСНЫХ ЖИВУТ
        РЫБНЫЕ ТЕКСТЫ.");
        assertEquals(list,fo.readToList("textCap.txt"));
    }

    @Test
    public void test_spaceToStarsFileAction()throws IOException{
        fo.writeList(text,"textSpace.txt");
        FileAction spa = new SpacesToStarsFileAction(new FileOperations());
        spa.handleFile("textSpace.txt");
        List<String> list = Arrays.asList
        ("Далеко-далеко*за*словесными*горами*в*стране*гласных*и*согласных*живут*рыбные*тексты.");
        assertEquals(list,fo.readToList("textSpace.txt"));
    }*/
    @BeforeEach
    public void init() {
        fileOperations = mock(FileOperations.class);
        capLet = new FileAction(fileOperations) {
            @Override
            protected List<String> perform(List<String> text) {
                return null;
            }
        };
        capLet = spy(capLet);
    }

    @Test
    public void test_handle() throws IOException {
       /* capLet.handleFile("source.txt");
        List<String> readStrings = new FileOperations().readToList("source.txt");
        List<String> exp = Arrays.asList("TWINKLE, TWINKLE, LITTLE STAR, HOW I WONDER WHAT YOU ARE.");
        assertEquals(exp, readStrings);*/
        when(fileOperations.readToList("filename")).thenReturn(Arrays.asList("Hello!", "guys!"));
        when(capLet.perform(Arrays.asList("Hello!", "guys!"))).thenReturn(Arrays.asList("!olleH", "!syug"));

        capLet.handleFile("filename");

        verify(fileOperations, times(1))
                .writeList(Arrays.asList("!olleH", "!syug"), "filename");
    }
}