public class FileMessage extends TextMessage{
    private String fileName;
    public FileMessage(String date, String author, String text, String fileName){
        super(date, author, text);
        this.fileName = fileName;

    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public String output(){
        return "File: " + getFileName() + "\n" + getText();
    }
}
