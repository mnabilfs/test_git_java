import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int pilih;
        long nim;
        String adminIn, adminPw;
        int input;
        do {
            input = 0;
            Scanner scan12 = new Scanner(System.in);

            System.out.println("==== Library System ===");
            System.out.println("1. Login as student");
            System.out.println("2. Login as admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3) : ");
            pilih = scan12.nextInt();

            switch (pilih){
                case 1:
                    System.out.print("Enter your NIM : ");
                    nim = scan12.nextLong();
                    scan12.nextLine();
                    if (String.valueOf(nim).length() == 15){
                        System.out.println("Successfull Login as Student");
                    } else {
                        System.out.println("User Not Found");
                    }
                    break;
                case 2:
                    System.out.print("Enter your username (admin) : ");
                    adminIn = scan12.next();

                    System.out.print("Enter your password (admin) : ");
                    adminPw = scan12.next();

                    if (adminIn.equals("admin") && adminPw.equals("admIn")) {
                        System.out.println("Successfull Login as Admin");
                    } else {
                        System.out.println("Admin User Not Found!!");
                    }
                    break;
                case 3:
                    System.out.println("Sayonara~");
                    break;
                default:
                    System.out.println("Input anda salah");
                    input = 1;
                    break;
            }
        } while (input == 1);

    }
}