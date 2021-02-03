package de.telran.action;

import de.telran.FileAction;
import de.telran.FileOperations;

import java.util.ArrayList;
import java.util.List;

public class CapitalLettersFileAction extends FileAction {

    public CapitalLettersFileAction(FileOperations fileOperations) {
        super(fileOperations);
    }

    @Override
    protected List<String> perform(List<String> text) {
        List<String> res = new ArrayList<>();
        for (String s : text) {
            res.add(s.toLowerCase());
        }
        return res;
    }
}
