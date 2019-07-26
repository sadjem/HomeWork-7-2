package HomeWork72;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
Задан текстовый файл. Вывести сколько в нём: a) строк b) слов c) символов (не получилось)
 */
public class ScanFile {
    public static void main(String[] args) throws FileNotFoundException {
        getWorldsAndLinesCount("src/HomeWork72/test.txt");
    }

    private static void getWorldsAndLinesCount(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        int words = 0;
        int lines = 0;

        while (scanner.hasNextLine()) {
            lines++;
            String[] arr = scanner.nextLine().split(" ");
            words = words + arr.length;
        }
        System.out.println("Number of words " + words);
        System.out.println("Number of lines " + lines);
        scanner.close();
    }
}
