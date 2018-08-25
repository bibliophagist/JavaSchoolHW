package lecture8;


import java.io.File;

public class lambda {
    public static void main(String[] args) {
        File file = new File("C:\\");
        File[] files = file.listFiles(fileL -> fileL.isDirectory());
        if (files != null) {
            for (File filePrint : files) {
                System.out.println(filePrint.getName());
            }
        } else {
            System.out.println("There is not subdirectories!");
        }
    }
}
