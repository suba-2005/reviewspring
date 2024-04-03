package com.java.trip.Model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.NoArgsConstructor;



@Entity
@NoArgsConstructor
public class Trip{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer tripId;
    @Column(name="PassengerName")
    private String passengerName;
    @Column(name="Age")
    private int age;
    @Column(name="Gender")
    private String gender;
    @Column(name="PhoneNo")
    private String phoneNo;
    @Column(name="Departure")
    private String departure;
    @Column(name="Arrival")
    private String arrival;
    public Trip(Integer tripId, String passengerName, int age, String gender, String phoneNo, String departure,
            String arrival) {
        this.tripId = tripId;
        this.passengerName = passengerName;
        this.age = age;
        this.gender = gender;
        this.phoneNo = phoneNo;
        this.departure = departure;
        this.arrival = arrival;
    }
    public Integer getTripId() {
        return tripId;
    }
    public void setTicketId(Integer tripId) {
        this.tripId = tripId;
    }
    public String getPassengerName() {
        return passengerName;
    }
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getDeparture() {
        return departure;
    }
    public void setDeparture(String departure) {
        this.departure = departure;
    }
    public String getArrival() {
        return arrival;
    }
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }



       

}