package Composition;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

/*
Ship[] ships = new Ship[3] ;
ships[0] = new Ship("BaseShip", "2050");
ships[1] = new CruiseShip("CruiseShip","2051",1000);
ships[2] = new CargoShip("CargoShip", "2052", 50000);

for (int i = 0; i < 3; i++) {
    ships[i].displayShipInformation();
        }
 */
public class Folder {
    private String folderName;
    private final List<File> files;
    private final List<Folder> folders;

    public Folder(String newFolderName, List<File> newFiles, List<Folder> newFolders) {
        this.folderName = newFolderName;
        this.files =  newFiles;
        this.folders = newFolders;
    }
    public String getFolderName() {
        return folderName;
    }
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }
    public List<Folder> getFolders() {
        return folders;
    }
    public List<File> getFiles() {
        return files;
    }
}
