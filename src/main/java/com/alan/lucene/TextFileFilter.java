package com.alan.lucene;

import java.io.File;
import java.io.FileFilter;

/**
 * @author Administrator
 * 此类用于为 .txt 文件过滤器
 */
public class TextFileFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.getName().toLowerCase().endsWith(".txt");
    }
}
