package Composition;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

/*
You will create a Folder class and a File class that will represent the File System on your computer. They should have all the proper member variables, setters and getters.
The folder class will have a print function that prints out all subfolders and files. The file class will have a print function that prints out the name of the file.
A Folder can contain zero or more Files. A Folder can also contain zero or more Sub-Folders.
A File must be stored within a folder.
If a folder is deleted all the files and sub-folders in the folder are also deleted.

In the structure below we see php_demo1 is a folder and has a sub-folder of Source Files.
**Recreate the structure below:**

1.	As part of the driver program print out the php_demo1 folder and all sub folders. All sub folders should also print out their content until the full structure above is printed.
2.	Now delete the folder app and print out the full structure.
3.	Now delete the folder public and print out the full structure.
 */
public class CompositionDriver {
    public CompositionDriver() {
        List<File> emptyFile = new ArrayList<File>();
        List<Folder> emptyFolder = new ArrayList<Folder>();

        List<File> filesInSourceFiles = new ArrayList<File>();
        List<Folder> foldersInSourceFiles = new ArrayList<Folder>();
        List<Folder> foldersInApp = new ArrayList<Folder>();
        List<Folder> foldersInPhpdemo1 = new ArrayList<Folder>();

        File file1 = new File(".htaccess");
        File file2 = new File(".htrouter.php");
        File file3 = new File("index.html");
        Folder folder2 = new Folder(".phalcon", emptyFile, emptyFolder);
        Folder folder3 = new Folder("cache", emptyFile, emptyFolder);
        Folder folder4 = new Folder("public", emptyFile, emptyFolder);
        Folder subFolder1 = new Folder("config", emptyFile, emptyFolder);
        Folder subFolder2 = new Folder("controllers", emptyFile, emptyFolder);
        Folder subFolder3 = new Folder("library", emptyFile, emptyFolder);
        Folder subFolder4 = new Folder("migrations", emptyFile, emptyFolder);
        Folder subFolder5 = new Folder("models", emptyFile, emptyFolder);
        Folder subFolder6 = new Folder("views", emptyFile, emptyFolder);
        Folder folderphp1 = new Folder("Include Path", emptyFile, emptyFolder);
        Folder folderphp2 = new Folder("Remote Files", emptyFile, emptyFolder);

        filesInSourceFiles.add(file1);
        filesInSourceFiles.add(file2);
        filesInSourceFiles.add(file3);
        foldersInSourceFiles.add(folder2);
        foldersInSourceFiles.add(folder3);
        foldersInSourceFiles.add(folder4);
        foldersInApp.add(subFolder1);
        foldersInApp.add(subFolder2);
        foldersInApp.add(subFolder3);
        foldersInApp.add(subFolder4);
        foldersInApp.add(subFolder5);
        foldersInApp.add(subFolder6);
        foldersInPhpdemo1.add(folderphp1);
        foldersInPhpdemo1.add(folderphp2);

        Folder folderApp = new Folder("app", emptyFile, foldersInApp);
        foldersInSourceFiles.add(folderApp);
        Folder folderSourceFiles = new Folder("Source Files", filesInSourceFiles, foldersInSourceFiles);
        foldersInPhpdemo1.add(folderSourceFiles);
        Folder folderPhpdemo1 = new Folder("php_demo1", emptyFile, foldersInPhpdemo1);

        System.out.println("php_demo1 Files: " + folderPhpdemo1.getFiles() + ", Folders: " + folderPhpdemo1.getFolders());
        System.out.println("Source Files Files: " + folderSourceFiles.getFiles() + ", Folders: " + folderSourceFiles.getFolders());
        System.out.println("app Files: " + folderApp.getFiles() + ", Folders: " + folderApp.getFolders());

        folderApp = null;
        System.gc();
        System.out.println("**app folder deleted**");

        System.out.println("php_demo1 Files: " + folderPhpdemo1.getFiles() + ", Folders: " + folderPhpdemo1.getFolders());
        System.out.println("Source Files Files: " + folderSourceFiles.getFiles() + ", Folders: " + folderSourceFiles.getFolders());

        folder4 = null;
        System.gc();
        System.out.println("**public folder deleted**");

        System.out.println("php_demo1 Files: " + folderPhpdemo1.getFiles() + ", Folders: " + folderPhpdemo1.getFolders());
        System.out.println("Source Files Files: " + folderSourceFiles.getFiles() + ", Folders: " + folderSourceFiles.getFolders());
    }
}
