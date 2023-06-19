package org.example;

public class ToyWtite {
    public static void main(String[] args) {
        File myFile = new File("text.txt");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(myFile, true));
            writer.write("everything is good\n");
            writer.write("beautiful flower\n");
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
