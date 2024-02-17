package Composition;

public class File {
    private String fileName;

    public File(String newFileName) {
        this.fileName = newFileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public void displayFileName() {
        System.out.println(fileName);
    }
}
