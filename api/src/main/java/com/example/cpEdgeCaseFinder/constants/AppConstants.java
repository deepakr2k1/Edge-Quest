package com.example.cpEdgeCaseFinder.constants;

public class AppConstants {

    public static final String WORKING_DIR = "/Users/deepakr2k1/IdeaProjects/cp-edge-case-finder/api/code-files/";
    public static final String TXT_EXTENSION = ".txt";
    public static final String CPP_EXTENSION = ".cpp";
    public static final String JAVA_EXTENSION = ".java";
    public static final String PYTHON_EXTENSION = ".py";
    public static final Integer COMPILE_THREAD_TIMEOUT = 3;
    public static final Integer EXECUTE_THREAD_TIMEOUT = 10;

    public enum Lang {
        cpp,
        java,
        python
    }

    public enum Filetype {
        CORRECT_CODE,
        TESTING_CODE,
        INPUT_GENERATING_CODE
    }

}