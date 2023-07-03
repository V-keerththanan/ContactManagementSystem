import java.util.Scanner;

public class ConsoleUI {


    public void show(){

        while (true){
            Scanner myScanner=new Scanner(System.in);
            AddressBook addressBook=new AddressBook();
            int option;
            System.out.println("Select what you want to perform?");
            option=myScanner.nextInt();
            System.out.println("-------------------OPTIONS--------------------");
            System.out.println("1.Add Contact");
            System.out.println("2.Remove Contact");
            System.out.println("3.Search Contact");
            System.out.println("4.Display Contact");
            System.out.println("5.Exit");
            switch (option){
                case 1:
                    System.out.println("Enter  name?");
                    String name=myScanner.nextLine();
                    System.out.println("Enter Email address?");
                    String email=myScanner.nextLine();
                    System.out.println("Enter phone number?");
                    String phone=myScanner.nextLine();
                    addressBook.createNewContact(name,email,phone);
                    break;
                case 2:
                    System.out.println("Enter Email address for delete contact?");
                    String e=myScanner.nextLine();
                    addressBook.deleteContact(e);
                    break;
                case 3:
                    System.out.println("Enter name for search the contact?");
                    String n=myScanner.nextLine();
                    addressBook.searchContactByName(n);
                    break;
                case 4:
                    addressBook.displayContact();
                    break;

                case 5:
                    System.out.println("Bye!...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Select correct option");
            }



        }



    }


}
