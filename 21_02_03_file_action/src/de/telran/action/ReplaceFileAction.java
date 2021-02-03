package de.telran.action;

import de.telran.FileAction;
import de.telran.FileOperations;

import java.util.ArrayList;
import java.util.List;

public class ReplaceFileAction extends FileAction {
    private final String pattern;
    private final String target;

    public ReplaceFileAction(FileOperations fileOperations, String pattern, String target) {
        super(fileOperations);
        this.pattern = pattern;
        this.target = target;
    }

    @Override
    protected List<String> perform(List<String> text) {
        List<String> res = new ArrayList<>();
        for (String s : text) {
            res.add(s.replace(target, pattern));
        }
        return res;
    }
}
