package com.santanu.backend.sproutsystemproject;
import java.util.Date;
import java.time.LocalDate;

public class UserDto {

    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    private String address;

    private String phoneNumber;

    private Date currentTime;

    // public UserDto(String username, String password, String firstName, String lastName, LocalDate dateOfBirth, String address, String phoneNumber, Date currentTime) {
    //     this.username = username;
    //     this.password = password;
    //     this.firstName = firstName;
    //     this.lastName = lastName;
    //     this.dateOfBirth = dateOfBirth;
    //     this.address = address;
    //     this.phoneNumber = phoneNumber;
    //     this.currentTime = currentTime;
    // }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date date) {
        this.currentTime = date;
    }
}