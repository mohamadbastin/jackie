package org.example.models;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodModel extends Model {
    private final String accessModifier;
    private final String nonAccessModifier;
    private final String returnType;
    private final String name;
    private final boolean isOverridden;

    private ArrayList<String> parameters = new ArrayList<>();

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

    public boolean isOverridden() {
        return isOverridden;
    }

    public ArrayList<String> getParameters() {
        return parameters;
    }

    public MethodModel(String accessModifier, String nonAccessModifier, String returnType, String name,
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

    public void addPars(String...arr){
        this.parameters.addAll(Arrays.asList(arr));
    }
}
