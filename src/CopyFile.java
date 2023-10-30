package src;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        InputStream sourceFile = null;
        OutputStream targetFile = null;
        try {
            sourceFile = new FileInputStream("src/source.txt");
            targetFile = new FileOutputStream("src/target.txt");
            byte[] bytes = new byte[1024];
            int length;
            int count = 0;
            while ((length = sourceFile.read(bytes)) > 0) {
                targetFile.write(bytes, 0, length);
                count += length;
            }
            System.out.println("So ky tu: " + count);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            sourceFile.close();
            targetFile.close();
        }
    }
}
