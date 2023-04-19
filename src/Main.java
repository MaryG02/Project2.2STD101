public class Main {
    public static void main(String[] args){
    TextMessage textmes = new TextMessage("17.04.23", "Mariia", "Hi"  );
    ContactMessage contact = new ContactMessage("15.05.22", "Anna", "Dariia", "380661111111");
    FileMessage file = new FileMessage("12.11.2023", "Bob", "Here is file with my homework", "Project5.pdf");
    LocationMessage geo = new LocationMessage("2.12.2021", "Lisa", 49.995463, 36.217833);

    System.out.println(textmes.getDate() + "\n" + textmes.getAuthor()+" sent you:\n" + textmes.output()+ "\n-----------");
    System.out.println(contact.getDate() + "\n" + contact.getAuthor()+" sent you:\n" + contact.output()+ "\n-----------");
    System.out.println(file.getDate() + "\n" + file.getAuthor()+" sent you:\n" + file.output()+ "\n-----------");
    System.out.println(geo.getDate() + "\n" + geo.getAuthor()+" sent you:\n" +geo.output()+ "\n-----------");


    }
}
