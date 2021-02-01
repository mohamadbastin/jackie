package org.example;

import com.sun.webkit.Timer;
import javafx.beans.property.Property;
import org.example.models.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Engine {
    static ArrayList<ClassModel> classes = new ArrayList<>();
    static ArrayList<VariableModel> vars = new ArrayList<>();
    static ArrayList<FunctionModel> functions = new ArrayList<>();
    static ArrayList<HeaderFileModel> headerFiles = new ArrayList<>();


//    Engine() {
//        classes.addAll(Arrays.asList(arr));
//    }


    public static void addClasses(ClassModel... classes) {
        Engine.classes.addAll(Arrays.asList(classes));
    }

    public static void addHeaderFiles(HeaderFileModel... headers) {
        Engine.headerFiles.addAll(Arrays.asList(headers));
    }

    public static void addVars(VariableModel... vars) {
        Engine.vars.addAll(Arrays.asList(vars));
    }

    public static void addFunctions(FunctionModel... functions) {
        Engine.functions.addAll(Arrays.asList(functions));
    }

    public static void generate(Generator generator) throws IOException {

        if (generator.lang == "cpp") {

            File myObj = new File("out/project.cpp");
            myObj.createNewFile();
            FileWriter writer = new FileWriter("out/project.cpp");

            for (HeaderFileModel header : headerFiles) {
                writer.write(generator.headerFileGenerator(header));
            }

            for (VariableModel var : vars) {
                writer.write(generator.variableGenerator(var));
            }

            for (FunctionModel func : functions) {
                writer.write(generator.functionGenerator(func));
            }

            for (ClassModel clas : classes) {
                writer.write(generator.classGenerator(clas));
            }

            writer.close();

        } else if (generator.lang == "java") {

            if (!vars.isEmpty() || !functions.isEmpty()) {
                File myObj = new File("out/Global.java");
                myObj.createNewFile();
                FileWriter writer = new FileWriter("out/Global.java");

                ClassModel global = new ClassModel("public", "", "Global");
                for (VariableModel v : vars) {
                    PropertyModel p = new PropertyModel(v.getAccessMod(), v.getNonAccessMod(), v.getType(), v.getName());
                    global.addProperties(p);
                }
                for (FunctionModel f: functions){
                    MethodModel m = new MethodModel(f.getAccessModifier(), f.getNonAccessModifier(), f.getReturnType(),
                            f.getName(), f.getOverridden());
                    for (String s: f.getParameters()){
                        m.addPars(s);
                    }
                    global.addMethods(m);
                }

                writer.write(generator.classGenerator(global));
                writer.close();
            }

            for (ClassModel c: classes){
                File myObj = new File("out/" + c.getName() +".java");
                myObj.createNewFile();
                FileWriter writer = new FileWriter("out/"+c.getName()+".java");

                writer.write(generator.classGenerator(c));
            }

        }
    }


}
