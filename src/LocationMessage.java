public class LocationMessage extends BaseMessage {
    private double X;
    private double Y;

    public LocationMessage(String date, String author, double X, double Y){
        super(date, author);
        this.X = X;
        this.Y = Y;
    }
    public double getX(){
        return X;
    }
    public double getY(){
        return Y;
    }
    @Override
    public String output(){
        return "My geolocation is: \nX:"+ getX() +"\nY:"+ getY();
    }
}
