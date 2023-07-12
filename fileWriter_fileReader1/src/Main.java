import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String startMessage;
        startMessage = "Welcome";
        System.out.println(startMessage);
        String name;
        String surname;
        int age = 0;
        String address;

            Scanner userInput = new Scanner(System.in);
            name = "";
            surname = "";
            age = 0;
            address = "";
            do {
                System.out.println("Enter name ");
                userInput.hasNextLine();
                if (userInput.hasNextLine()) {

                    name = userInput.next();
                }


                System.out.println("Enter surname ");
                userInput.hasNextLine();
                if (userInput.hasNextLine()) {

                    surname = userInput.next();
                }

                System.out.println("Enter age ");
                userInput.hasNextLine();
                if (userInput.hasNextInt()) {

                    age = userInput.nextInt();
                }

                System.out.println("Enter address ");
                userInput.hasNextLine();
                if (userInput.hasNextLine()) {

                    address = userInput.next();

                    FileOutputStream fos = new FileOutputStream("myfile.txt", true);
                    PrintWriter pw = new PrintWriter(fos);
                    pw.println("name" + " " + "surname" + " " + "age" + " " + "address");
                    pw.println(name + " " + surname + " " + " " + age + " " + address);
                pw.close();
                }
                }while (true);

    }
}



