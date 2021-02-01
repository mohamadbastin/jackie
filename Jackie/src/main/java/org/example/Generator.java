package org.example;

import javafx.beans.property.Property;
import org.example.models.*;

public interface Generator {

    String lang= new String();

    String classGenerator(ClassModel classObject);

    String methodGenerator(MethodModel modelObject);

    String propertyGenerator(PropertyModel propertyObject);

    String interfaceGenerator(InterfaceModel interfaceObject);

    String headerFileGenerator(HeaderFileModel headerFileObject);

    String variableGenerator(VariableModel variableObject);

    String functionGenerator(FunctionModel functionObject);

}
