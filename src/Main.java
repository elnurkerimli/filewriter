import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String path="C:\\exam\\examfile";
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter name");
            String st1 = sc.nextLine();

            System.out.println("Enter surname");
            String st2 = sc.nextLine();

            System.out.println("Enter age");
            String st3 = sc.nextLine();

            System.out.println("Enter address");
            String st4 = sc.nextLine();

            File f = new File(path);
            if (!f.exists()) {
                f.mkdir();
            }

            FileWriter fw = new FileWriter(f + File.separator + "info.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(st1 + " " + st2 + " " + st3 + " " + st4);
            bw.newLine();
            bw.close();

            FileReader fr = new FileReader(path + File.separator + "info.txt");
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                String data = br.readLine();
                System.out.println(data);
            }
        }

    }
}