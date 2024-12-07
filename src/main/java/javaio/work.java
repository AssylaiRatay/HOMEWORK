package javaio;

import java.io.FileInputStream;
import java.io.IOException;

public class work {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("C:\\Users\\Пользователь\\IdeaProjects\\first.project\\src\\main\\java\\javaio\\demo.txt")) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}