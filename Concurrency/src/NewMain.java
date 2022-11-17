import java.io.*;
import java.util.Vector;

public class NewMain{
    public static void main(String[] args) throws IOException {
        FileInputStream file1 = new FileInputStream("/home/pranav/Data/programming/Java/Concurrency/out/production/Concurrency/file1.txt");
        FileInputStream file2 = new FileInputStream("/home/pranav/Data/programming/Java/Concurrency/out/production/Concurrency/file2.txt");

        Vector<FileInputStream> v = new Vector<>();
        v.add(file1);
        v.add(file2);

        FileOutputStream outputStream = new FileOutputStream("/home/pranav/Data/programming/Java/Concurrency/out/production/Concurrency/output.txt");

        SequenceInputStream sequenceInputStream = new SequenceInputStream(file1, file2);

        int i = 0;
        while((i = sequenceInputStream.read()) != -1){
            outputStream.write((char)i);
        }

    }
}