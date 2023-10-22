//region Import
import com.engento.guest.Booking;
import com.engento.guest.Guest;
import com.engento.guest.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//endregion

public class Main {
    public static void main(String[] args) {


        Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan", "Dvořáček", LocalDate.of(1995,5,5));

        List<Guest> guestList = new ArrayList<>();
        guestList.add(guest1);
        guestList.add(guest2);


        Room room1 = new Room(1, 1, true, true, 1000);
        Room room2 = new Room(2, 1, true, true, 1000);
        Room room3 = new Room(3, 3, false, true, 2400);

        Booking booking1 = new Booking(LocalDate.of(2021,7,19),
                                           LocalDate.of(2021,7,26 ), room1 ,guest1);
        Booking booking2 = new Booking(LocalDate.of(2021,9,1),
                                              LocalDate.of(2021,9,14), room3 ,guestList);

        List<Booking> bookingList = new ArrayList<>();
        bookingList.add(booking1);
        bookingList.add(booking2);

        System.out.println("host:" +guest1.getFirstName()+ " " +guest1.getSurName()+": " +guest1.getDateOfBirth());
        System.out.println("host:" +guest2.getFirstName()+ " " +guest2.getSurName()+": " +guest2.getDateOfBirth());
        //System.out.println(guestList);
        //System.out.println(bookingList);

        int i = 1;
        for (Guest guest : guestList){
            System.out.println(i+": "+guest.getDateOfBirth()+" " +guest.getFirstName()+ " " +guest.getSurName()+
                               " " +guest.getDateOfBirth());
            i++;
        }

        int w = 1;
        for(Booking booking : bookingList){
            System.out.println(w+": "+booking.getGuest()+ " -" + " příjezd:" +booking.getArrival()+ " -" +" odjezd:" +booking.getDeparture()+ " - "
                               +booking.getRoom());
            w++;
        }




    }

}