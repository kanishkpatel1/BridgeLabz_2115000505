import java.util.*;
class HotelBooking{
    String guestName,roomType;
    int nights;
    HotelBooking(){
        this("Pawan","Full-AC",1);        
    }
    HotelBooking(String guestName,String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
    HotelBooking(HotelBooking previousHotelBooking){
        this.guestName=previousHotelBooking.guestName;
        this.roomType=previousHotelBooking.roomType;
        this.nights=previousHotelBooking.nights;
    }
    void display(){
        System.out.println("GuestName : "+guestName);
        System.out.println("roomType : "+roomType);
        System.out.println("nights : "+nights);
    }
}
public class HotelBookingSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String guestName=sc.nextLine();
        String roomType=sc.nextLine();
        int night=sc.nextInt();

        HotelBooking hb=new HotelBooking();
        HotelBooking hb1=new HotelBooking(guestName,roomType,night);
        hb.display();
        hb1.display();
    }
    
}


