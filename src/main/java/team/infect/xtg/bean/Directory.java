package team.infect.xtg.bean;

import java.io.File;

public class Directory {
    File directory;
    String path;
    String[] files;

    public Directory(String path) {
        this.directory = new File(path);
        this.path = path;
        this.files = directory.list();
    }

    public File getDirectory() {
        return this.directory;
    }

    public String getPath() {
        return this.path;
    }

    public String[] getFiles() {
        return this.files;
    }

}
