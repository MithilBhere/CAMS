package Success;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) throws IOException {
        File f = new File("success.txt");
       /* try{
            f.createNewFile();
        } catch (Exception e) {
            System.out.println(e);
        }*/
        //      Scanner sc = new Scanner(f);
//        if(sc.hasNextLine()){
//            System.out.println(sc.nextLine());
//        }

        try{
            FileWriter fileWriter = new FileWriter("success.txt");
            fileWriter.write("This is the first line");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        try{
            FileWriter fileWriter = new FileWriter("success.txt",true);
            fileWriter.write("\t Anish is *****");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        f.delete();


    }
}
