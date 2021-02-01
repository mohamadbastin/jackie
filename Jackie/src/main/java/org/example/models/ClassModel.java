package org.example.models;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassModel extends Model{
    private final String accessModifier;
    private final String nonAccessModifier;
    private final String name;
    private ArrayList<PropertyModel> properties = new ArrayList<>();
    private ArrayList<MethodModel> methods = new ArrayList<>();
    private ArrayList<ClassModel> inheritances = new ArrayList<>();
    private ArrayList<InterfaceModel> implementations = new ArrayList<>();
    private ArrayList<ClassModel> innerClasses = new ArrayList<>();
    private ArrayList<InterfaceModel> innerInterfaces = new ArrayList<>();

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

    public ArrayList<ClassModel> getInheritances() {
        return inheritances;
    }

    public ArrayList<InterfaceModel> getImplementations() {
        return implementations;
    }

    public ArrayList<ClassModel> getInnerClasses() {
        return innerClasses;
    }

    public ArrayList<InterfaceModel> getInnerInterfaces() {
        return innerInterfaces;
    }

    public ClassModel(String accessModifier, String nonAccessModifier, String name) {
        this.accessModifier = accessModifier;
        this.nonAccessModifier = nonAccessModifier;
        this.name = name;

    }

    public void addProperties(PropertyModel...arr){
        for (int i=0; i<arr.length;i++){
            if (properties.contains(arr[i])){
                System.out.println(arr[i].getName() + " Already defined in the scope");
                System.out.println("ignoring entry");
            } else {
                properties.add(arr[i]);
            }
        }
    }
    public void addMethods(MethodModel...arr){
        for (int i=0; i<arr.length;i++){
            if (methods.contains(arr[i])){
                System.out.println(arr[i].getName() + " Already defined in the scope");
                System.out.println("ignoring entry");
            } else {
                methods.add(arr[i]);
            }
        }
    }
    public void addInheritances(ClassModel...arr){
        for (int i=0; i<arr.length;i++){
            if (inheritances.contains(arr[i])){
                System.out.println(arr[i].name + " Already extended from that class");
                System.out.println("ignoring entry");
            } else {
                inheritances.add(arr[i]);
            }
        }
    }
    public void addImplementations(InterfaceModel...arr){
        for (InterfaceModel interfaceModel : arr) {
            if (implementations.contains(interfaceModel)) {
                System.out.println(interfaceModel.getName() + " Already implemented that interface");
                System.out.println("ignoring entry");
            } else {
                implementations.add(interfaceModel);
            }
        }
    }
    public void addInnerClasses(ClassModel...arr){
        for (int i=0; i<arr.length;i++){
            if (innerClasses.contains(arr[i])){
                System.out.println(arr[i].name + " Already defined in the scope");
                System.out.println("ignoring entry");
            } else {
                innerClasses.add(arr[i]);
            }
        }    }
    public void addInnerInterfaces(InterfaceModel...arr){
        for (int i=0; i<arr.length;i++){
            if (innerInterfaces.contains(arr[i])){
                System.out.println(arr[i].getName() + " Already defined in the scope");
                System.out.println("ignoring entry");
            } else {
                innerInterfaces.add(arr[i]);
            }
        }
    }



}
