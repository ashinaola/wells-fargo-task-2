package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioID;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = clientId)
    private long clientId;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio() {

    }

    public Portfolio(String creationdate) {
        this.creationDate = creationdate;
    }

    public String getCreationDate() { return this.creationDate; }

    public void setCreationDate(String creationdate) { this.creationDate = creationdate; }
}
