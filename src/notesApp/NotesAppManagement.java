package notesApp;

import services.NotesApp;
import services.NotesAppImpl;

import java.util.Scanner;

public class NotesAppManagement {

    Scanner sc ;
    NotesApp  notesApp;

    public NotesAppManagement() {
        this.sc = new Scanner(System.in);
        this.notesApp = new NotesAppImpl();
    }

    public  void startNotesApp(){


        System.out.println("------------------------------");
        System.out.println("NOTES APP STARTED");
        System.out.println("------------------------------");

        boolean keepRunning = true;

        while(keepRunning){

            System.out.println("1. Write to a File");
            System.out.println("2. Read From a File");
            System.out.println("3. Clear File");
            System.out.println("4.Exit");
            System.out.println("Choose Option to Perform: ");


            try{
                String input = sc.nextLine();
                int option = Integer.parseInt(input);

                switch(option){

                    case 1:
                        notesApp.write();
                        break;
                    case 2:
                        notesApp.read();
                        break;
                    case 3: notesApp.clearNotes();
                         break;
                    case 4:
                        keepRunning = false;
                        System.out.println("-----Application Terminated!-----");
                        break;

                    default:
                        System.out.println("Please enter valid input!");
                }
            }catch (NumberFormatException exception){
                System.out.println("Invalid Input!. Please enter a valid number (1-3)");
                System.out.println("----------------------------------------------------");
            }
        }

    }
}
