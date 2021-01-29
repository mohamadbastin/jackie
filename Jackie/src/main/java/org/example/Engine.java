package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Engine {
    static ArrayList<ClassModel> classes = new ArrayList<>();

    Engine(ClassModel...arr){
        classes.addAll(Arrays.asList(arr));
    }

    public static void generate(){
        for (ClassModel a : classes) {
//            System.out.println(JavaEngine.JavaClassModel.generate(a));
        }
    }

}
