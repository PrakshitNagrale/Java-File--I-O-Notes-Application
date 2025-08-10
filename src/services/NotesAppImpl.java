package services;

import java.io.*;
import java.util.Scanner;

public class NotesAppImpl implements NotesApp{

    Scanner sc = new Scanner(System.in);
    FileReader fr = null;
    FileWriter fw = null;

    BufferedReader br = null;


    String notesFile = "/Users/prakshitnagrale/Documents/My Work/Prakshit doc/Elevate_Labs_Internship/NotesApp.txt";

    @Override
    public void write() { //to write in file

        System.out.println("Please start writing your notes: ");
        String notes = sc.nextLine();

        try{
            fw = new FileWriter(notesFile,true);//to close fw & to append the previous notes

            fw.write(notes + System.lineSeparator());//writing into notes file from notes String
            System.out.println("----Successfully Saved!----");

        } catch (IOException e) {
            System.out.println("Error message "+e.getMessage());
        }
        finally {
            try{
                if(fw!=null){
                    fw.close();//closing file writer
                }
            }catch (IOException e){
                System.out.println("Error message "+ e.getMessage());

            }
        }
    }

    @Override
    public void read() {

        System.out.println("----Your Notes----");

//        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
        try{
            boolean emptyFile= true;

            fr = new FileReader(notesFile);//giving file path to file reader
            br = new BufferedReader(fr);//creating buffer reader to read fast
            String notes;

            while((notes = br.readLine())!= null){ //reading line by line from notes file
                System.out.println(notes); //printing in the console

                emptyFile = false;
            }
            if(emptyFile){
                System.out.println("File is empty");//If no notes present
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found "+ e.getMessage());
        }catch (IOException e){
            System.out.println("Error message "+ e.getMessage());
        }
        finally {
            try{
               if(fr!=null){
                   fr.close();//closing files
               }
                if(br!=null){
                    br.close();
                }
            }catch (IOException e ){
                System.out.println("Error message "+e.getMessage());
            }

        }

    }

    @Override
    public void clearNotes() {   // to clear all notes from files

        try(FileWriter fw = new FileWriter(notesFile)){ //creating file writer , it will overwrite the previous file


            System.out.println("-----All Notes Cleared!-----");
        } catch (IOException e) {
            System.out.println("Error message "+e.getMessage());
        }


    }
}
