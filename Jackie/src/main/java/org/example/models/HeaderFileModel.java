package org.example.models;

public class HeaderFileModel extends Model{
    private final String path;

    public String getPath() {
        return path;
    }

    public HeaderFileModel(String path) {
        this.path = path;
    }
}
