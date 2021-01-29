package org.example;

public abstract class VariableModel {
    String type;
    String name;

    VariableModel(String b, String a){
        this.name = a;
        this.type = b;
    }

    public String generate(){
        return "";
    }
}
