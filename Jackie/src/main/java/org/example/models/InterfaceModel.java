package org.example.models;

import java.util.ArrayList;
import java.util.Arrays;

public class InterfaceModel extends Model{

    private final String accessModifier;
    private final String nonAccessModifier;
    private final String name;

    public String getAccessModifier() {
        return accessModifier;
    }

    public String getNonAccessModifier() {
        return nonAccessModifier;
    }

    public String getName() {
        return name;
    }

    public ArrayList<PropertyModel> getProperties() {
        return properties;
    }

    public ArrayList<MethodModel> getMethods() {
        return methods;
    }

    public ArrayList<InterfaceModel> getImplementations() {
        return implementations;
    }

    private ArrayList<PropertyModel> properties = new ArrayList<>();
    private ArrayList<MethodModel> methods = new ArrayList<>();
    private ArrayList<InterfaceModel> implementations = new ArrayList<>();

    public InterfaceModel(String accessModifier, String nonAccessModifier, String name) {
        this.accessModifier = accessModifier;
        this.nonAccessModifier = nonAccessModifier;
        this.name = name;
    }

    public void addProperty(PropertyModel...arr){
        for (PropertyModel propertyModel : arr) {
            if (properties.contains(propertyModel)) {
                System.out.println(propertyModel.getName() + " Already defined in the scope");
                System.out.println("ignoring entry");
            } else {
                properties.add(propertyModel);
            }
        }
    }
    public void addMethods(MethodModel...arr){
        for (MethodModel methodModel : arr) {
            if (methods.contains(methodModel)) {
                System.out.println(methodModel.getName() + " Already defined in the scope");
                System.out.println("ignoring entry");
            } else {
                methods.add(methodModel);
            }
        }
    }
    public void addImplementations(InterfaceModel...arr){
        for (InterfaceModel interfaceModel : arr) {
            if (implementations.contains(interfaceModel)) {
                System.out.println(interfaceModel.name + " Already implemented that interface");
                System.out.println("ignoring entry");
            } else {
                implementations.add(interfaceModel);
            }
        }
    }

}