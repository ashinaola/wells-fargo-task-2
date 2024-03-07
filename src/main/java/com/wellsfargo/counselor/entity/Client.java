package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientID;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "advisorId")
    private long advisorId;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String email;

    protected Client() {

    }

    public Client(String lastName1, String firstName1, String address1, String phoneNumber1, String email1) {
        this.firstName = firstName1;
        this.lastName = lastName1;
        this.address = address1;
        this.phoneNumber = phoneNumber1;
        this.email = email1;
    }

    public long getClientID() { return clientID; }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public void setFirstName(String firstname) { this.firstName = firstname; }

    public void setLastName(String lastname) { this.lastName = lastname; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String phonenumber) { this.phoneNumber = phonenumber; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }
}
