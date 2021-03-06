import java.util.ArrayList;



public class Bedroom {


    private int roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> guestList;
    private int rate;
    private String surprise;


    public Bedroom(int roomNumber, int capacity, String type, int rate, String surprise){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guestList = new ArrayList<>();
        this.rate = rate;
        this.surprise = surprise;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public int getRoomCapacity(){
        return this.capacity;
    }

    public String getRoomType(){
        return this.type;
    }

    public int getGuestCount(){
        return this.guestList.size();
    }

    public void addGuest(Guest guest){
        guestList.add(guest);
    }
    public void removeGuest(Guest guest){
        if (this.guestList.contains(guest)){
            this.guestList.remove(guest);
        }
    }

    public ArrayList<Guest> getGuestList(){
        return this.guestList;
    }

    public int getRate(){
        return this.rate;
    }




}
