package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class ClassModel {
    String name;
    ArrayList<VariableModel> vars = new ArrayList<>();

    ClassModel(String name, VariableModel...arr){
        this.name = name;
        this.vars.addAll(Arrays.asList(arr));
    }

    public void addVar(VariableModel...arr){
        this.vars.addAll(Arrays.asList(arr));
    }

    public static String generate(){
        return "pis pis";
    }

}
