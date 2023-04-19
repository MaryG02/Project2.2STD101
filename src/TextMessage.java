public class TextMessage extends BaseMessage {
    private String text;
    public TextMessage(String date, String author, String text){
        super(date, author);
        this.text = text;
    }
    public String getText(){
        return text;
    }
    @Override
    public String output(){
        return getText();
    }
}
