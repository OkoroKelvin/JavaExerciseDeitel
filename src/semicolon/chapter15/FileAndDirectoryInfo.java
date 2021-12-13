package semicolon.chapter15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file or directory name");
        Path path = Paths.get(input.nextLine());

        if(Files.exists(path)){
            System.out.println(path.getFileName()+" exists");
            System.out.printf("%s a directory %n",Files.isDirectory(path)?"Is":"Is not");
            System.out.printf("%s an absolute path %n",path.isAbsolute() ? "Is": "Is not");
            System.out.println("Last Modified : "+Files.getLastModifiedTime(path));
            System.out.println("Size: "+Files.size(path));
            System.out.println("Path: "+path);
            System.out.println("Absolute path is: "+path.toAbsolutePath());
        }

        if(Files.isDirectory(path)){
            System.out.println("Directory Contents");
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
            for(Path content : directoryStream){
                System.out.println(content);
            }

        }
        else{
            System.out.println(path+" does not exist");
        }

    }
}
