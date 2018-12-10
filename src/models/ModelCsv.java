package models;


import java.io.*;


public class ModelCsv extends javax.swing.JPanel {

    private String base;
    private String path;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    public void openBase(String message, String path) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file, true);
            try (PrintWriter printWriter = new PrintWriter(fileWriter)) { 
                printWriter.println(message);
                printWriter.close();
            }
        } catch (IOException err) {
            System.err.println("error " + err.getMessage());
        }
    }

    public String text(String name, String email) {
        String file = name + "," + email + "\n";
        System.out.println(file);
        return file;
    }
}
