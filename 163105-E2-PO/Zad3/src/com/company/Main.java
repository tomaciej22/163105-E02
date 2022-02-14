package com.company;
import java.io.File;
import java.util.Arrays;
import java.io.FilenameFilter;
public class Main {
    private static File file = new File("C:\\Users\\kompu\\Music\\163105-E2-PO");
    public static void main(String[] args) {
        System.out.println(Arrays.toString(directories));
        System.out.println(Arrays.toString(directories2));
    }
    public static String[] directories = file.list(new FilenameFilter() {
        @Override
        public boolean accept(File current, String name){
            return new File(current, name).isDirectory();
        }
    });
    public static String[] directories2 = file.list((current, name) -> new File(current,name).isDirectory());
}
