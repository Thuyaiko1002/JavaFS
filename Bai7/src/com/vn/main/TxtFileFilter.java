package com.vn.main;

import java.io.File;
import java.io.FilenameFilter;

public class TxtFileFilter implements FilenameFilter {
    private static final String TXT = ".txt";

	@Override
    public boolean accept(File dir, String name) {
 
        if (name.endsWith(TXT)) {
            return true;
        }
        return false;
    }
}