package homeWorkExceptions;

import java.util.Scanner;

public class AutoClosableClass {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String str1 = String.valueOf(sc.hasNext());
            String str2 = String.valueOf(sc.hasNextLine());
            String str3 = String.valueOf(sc.hasNextLine());
            String str4 = String.valueOf(sc.hasNextLine());
            String TotalString = str1 + str2 + str3 + str4;
            System.out.println(TotalString);
            sc.close();
            System.out.println("Scanner is closed");
            System.out.println("Trying to use scanner after close method");
            System.out.println(sc.next());
        }
        catch (Exception e ) {
            System.out.println("exception is thrown " + e);
        }
    }
}
