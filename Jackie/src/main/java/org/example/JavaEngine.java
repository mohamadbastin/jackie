package org.example;

public class JavaEngine extends Engine {

    JavaEngine(JavaClassModel...arr){
        super(arr);
    }


    public static class JavaClassModel extends ClassModel{

        JavaClassModel(String name, VariableModel... arr) {
            super(name, arr);
        }



        public static String generate(ClassModel c) {
            StringBuilder a = new StringBuilder("public class " + c.name + "{\n");
            for (int j=0; j< c.vars.size(); j++){
                a.append(c.vars.get(j).type).append(" ").append(c.vars.get(j).name).append(";\n");
            }
            a.append("}");
            return a.toString();
        }
    }
}
