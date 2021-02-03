package de.telran.action;

import de.telran.FileAction;
import de.telran.FileOperations;

import java.util.ArrayList;
import java.util.List;

public class SpacesToStarsFileAction extends FileAction {

    String space;
    String star;

    public SpacesToStarsFileAction(FileOperations fileOperations) {
        super(fileOperations);
    }

    @Override
    protected List<String> perform(List<String> text) {
        space = " ";
        star = "*";
        List<String> res = new ArrayList<>();
        for (String s : text) {
            res.add(s.replace(space, star));
        }
        return res;
    }
}
