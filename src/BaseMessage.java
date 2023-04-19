public abstract class BaseMessage {
    private String author;
    private String date;
    public BaseMessage(String date, String author){
        this.author = author;
        this.date = date;

    }
    public abstract String output();

    public String getAuthor(){
        return author;
    }
    public String getDate(){
        return date;

    }

}
