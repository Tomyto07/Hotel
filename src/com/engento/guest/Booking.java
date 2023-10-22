package com.engento.guest;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private LocalDate arrival;
    private LocalDate departure;
    private Room room;
    private Guest guest;
    private List<Guest> guestList = new ArrayList<>();


    //region Konstruktor

    public Booking(LocalDate arrival, LocalDate departure, Room room, List<Guest> guestList) {
        this.arrival = arrival;
        this.departure = departure;
        this.room = room;
        this.guestList = guestList;
    }

    public Booking(LocalDate arrival, LocalDate departure, Room room, Guest guest) {
        this.arrival = arrival;
        this.departure = departure;
        this.room = room;
        this.guest = guest;
    }

    //endregion


    //region Get/Set


    public LocalDate getArrival() {
        return arrival;
    }

    public void setArrival(LocalDate arrival) {
        this.arrival = arrival;
    }

    public LocalDate getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDate departure) {
        this.departure = departure;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }

    //endregion


    @Override
    public String toString() {
        return "Booking{" +
                "arrival=" + arrival +
                ", departure=" + departure +
                ", room=" + room +
                ", guest=" + guest +
                ", guestList=" + guestList +
                '}';
    }
}
