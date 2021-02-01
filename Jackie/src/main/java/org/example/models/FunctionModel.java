package org.example.models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FunctionModel extends Model{
    private final String accessModifier;
    private final String nonAccessModifier;
    private final String returnType;
    private final String name;
    private final Boolean isOverridden;

    public String getAccessModifier() {
        return accessModifier;
    }

    public String getNonAccessModifier() {
        return nonAccessModifier;
    }

    public String getReturnType() {
        return returnType;
    }

    public String getName() {
        return name;
    }

    public Boolean getOverridden() {
        return isOverridden;
    }

    public ArrayList<String> getParameters() {
        return parameters;
    }

    private ArrayList<String> parameters = new ArrayList<>();


    public FunctionModel(String accessModifier, String nonAccessModifier, String returnType, String name,
                         boolean isOverridden, String...arr) {
        this.accessModifier = accessModifier;
        this.nonAccessModifier = nonAccessModifier;
        this.returnType = returnType;
        this.name = name;
        this.isOverridden = isOverridden;
        for (String s : arr) {
            if (parameters.contains(s)) {
                System.out.println(s + " Already defined in the scope");
                System.out.println("ignoring entry");
            } else {
                parameters.add(s);
            }
        }
    }
}
