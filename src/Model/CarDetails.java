/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author swathisharma
 */
public class CarDetails {
    
   private String carModel;
   private String carModelNumber;
   private String carSerialNumber;
   private int year;
   private int numOfSeats;
   private String registrationDate;
   private String city;
   private boolean Availability;
   private boolean Expiry;
   private int SeatCapacity;

    public int getSeatCapacity() {
        return SeatCapacity;
    }

    public void setSeatCapacity(int SeatCapacity) {
        this.SeatCapacity = SeatCapacity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean Availability() {
        return Availability;
    }

    public void setAvailability(boolean Availability) {
        this.Availability = Availability;
    }

    public boolean isExpiry() {
        return Expiry;
    }

    public void setExpiry(boolean Expiry) {
        this.Expiry = Expiry;
    }

   

    public void setExpiry(String expiry) {
        this.Expiry = Expiry;
    }
   
    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carMake) {
        this.carModel = carMake;
    }

    public String getCarModelNumber() {
        return carModelNumber;
    }

    public void setCarModelNumber(String carModelNumber) {
        this.carModelNumber = carModelNumber;
    }

    public String getCarSerialNumber() {
        return carSerialNumber;
    }

    public void setCarSerialNumber(String carSerialNumber) {
        this.carSerialNumber = carSerialNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public String getRegDate() {
        return registrationDate;
    }

    public void setRegDate(String regDate) {
        this.registrationDate = regDate;
    }


   
  
    @Override
   
    public String toString(){
        return carModel; 
        
    }
    
}
