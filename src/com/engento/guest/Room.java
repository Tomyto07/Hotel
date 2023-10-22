package com.engento.guest;

import java.math.BigDecimal;

public class Room {

    private int roomNumber;
    private int countOfBed;
    private boolean hasBalcony;
    private boolean viewOnSea;
    private int priceForNight;


    //region Konstruktory

    public Room(int roomNumber, int countOfBed, boolean hasBalcony, boolean viewOnSea, int priceForNight) {
        this.roomNumber = roomNumber;
        this.countOfBed = countOfBed;
        this.hasBalcony = hasBalcony;
        this.viewOnSea = viewOnSea;
        this.priceForNight = priceForNight;
    }

    //endregion


    //region get/set

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCountOfBed() {
        return countOfBed;
    }

    public void setCountOfBed(int countOfBed) {
        this.countOfBed = countOfBed;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isViewOnSea() {
        return viewOnSea;
    }

    public void setViewOnSea(boolean viewOnSea) {
        this.viewOnSea = viewOnSea;
    }

    public int getPriceForNight() {
        return priceForNight;
    }

    public void setPriceForNight(int priceForNight) {
        this.priceForNight = priceForNight;
    }


    //endregion


    @Override
    public String toString() {
        return "pokoj číslo" +":"+ roomNumber;
    }
}
