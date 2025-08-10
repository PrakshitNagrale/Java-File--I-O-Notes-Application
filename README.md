**** Notes Applicaton ****

- A simple Java console-based Notes Application that allows you to write, read, and clear notes from a text file.  

**  Features:-

- Write Notes – Add new notes to a text file without overwriting existing ones.
- Read Notes – Display all saved notes; notifies if the file is empty.
- Clear Notes – Remove all content from the notes file.
- Persistent Storage  – Notes are saved in a `.txt` file so they are available after restarting the program.

** Technologies Used-

- **Java** – Core language
- **File Handling** – `FileReader`, `FileWriter`, `BufferedReader`
- **Exception Handling** – `try-catch-finally` blocks
- **OOP Concepts** – Interface (`NotesApp`) and Implementation (`NotesAppImpl`)

** Example Output:-

------------------------------
NOTES APP STARTED
------------------------------
1. Write to a File
2. Read From a File
3. Clear File 
4. Exit 

- Choose Option to Perform:
   1
- Please start writing your notes:
   
This is my Notes Application to Write in a file and Read back from it, so that if the system get closed the data still persist.
  
- ----Successfully Saved!----
1. Write to a File
2. Read From a File
3. Clear File 
4. Exit
   
- Choose Option to Perform:
   2
  
----Your Notes---- 

This is my Notes Application to Write in a file and Read back from it, so that if the system get closed the data still persist.
1. Write to a File
2. Read From a File
3. Clear File 
4. Exit 

- Choose Option to Perform:
   3
  
-----All Notes Cleared!-----

1. Write to a File
2. Read From a File
3. Clear File 
4. Exit 

- Choose Option to Perform:
   4
   
-----Application Terminated!-----
