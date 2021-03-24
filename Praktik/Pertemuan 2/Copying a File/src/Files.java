// ****************************************************************
// Files.java
//
// Provides file method.
//
// ****************************************************************

import java.io.File;
import java.io.FileNotFoundException;

public class Files {
    
    private String fileName;    
    private final String filePath = "F:\\Tugas\\Semester 4\\APPL\\Praktik\\Pertemuan 2\\Copying a File\\filetest";
    
    //Construct Files object
    public Files(String fileName){
        
        this.fileName = fileName;
    }
    
    public void openFile() throws FileNotFoundException{
        
        //open file using file path and file name
        File openedFile = new File(this.filePath + this.fileName);
        
        //if file doesn't exist throw exception
        if (!openedFile.exists())
            throw new FileNotFoundException("File not found!");
    }
    
    public void read(){
        
    }
}
