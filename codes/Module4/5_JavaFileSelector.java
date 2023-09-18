/*  Write a java Program to  given the list of the names of the files in a directory. You have to select Java files from them. A file is a Java file if it’s name ends with “.java”. For e.g. File- “Names.java” is a Java file, “FileNames.java.pdf” is not. 

*/

import java.io.File;
import java.io.FilenameFilter;

public class JavaFileSelector {
    public static void main(String[] args) {
        // Replace with the path to your directory
        String directoryPath = "/home/anup/Desktop/Desktop/java_lab/JavaSBL2023/codes/Module4";

        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] javaFiles = directory.listFiles(new JavaFileFilter());

            if (javaFiles != null) {
                System.out.println("Java Files in the directory:");
                for (File javaFile : javaFiles) {
                    System.out.println(javaFile.getName());
                }
            } else {
                System.out.println("No Java files found in the directory.");
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }

    static class JavaFileFilter implements FilenameFilter {
        @Override
        public boolean accept(File dir, String name) {
            // Check if the file name ends with ".java" (case-insensitive)
            return name.toLowerCase().endsWith(".java");
        }
    }
}

