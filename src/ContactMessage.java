public class ContactMessage extends BaseMessage{
    private String phoneNumber;
    private String contactName;

    public ContactMessage(String date, String author, String contactName, String phoneNumber){
        super(date, author);
        this.phoneNumber = phoneNumber;
        this.contactName = contactName;
    }

    public String getContactName() {
        return contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String output(){
        return "Contact information: \nName:" + getContactName()+"\nPhone number:"+ getPhoneNumber();
    }
}
