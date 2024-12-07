package javaio;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class worrk1 {
    public static void main(String[] args) {
        String data = "Hello World";
        try(var out = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Пользователь\\IdeaProjects\\first.project\\src\\main\\java\\javaio\\out1.txt"))) {

            byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
            out.flush();
        }
        catch(java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
