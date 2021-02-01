package org.example.models;

public class VariableModel extends Model{
    private final String type;
    private final String name;
    private final String accessMod;
    private final String nonAccessMod;

    VariableModel(String accessMod, String nonAccessMod, String type, String name){
        this.name = name;
        this.type = type;
        this.accessMod = accessMod;
        this.nonAccessMod = nonAccessMod;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getAccessMod() {
        return accessMod;
    }

    public String getNonAccessMod() {
        return nonAccessMod;
    }
}
