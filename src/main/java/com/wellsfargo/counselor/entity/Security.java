package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue
    private long securtyId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "portfolioId")
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private float quantity;

    protected Security {

    }

    public Security(String name, String category, float purchaseprice, String purchasedate, float quantity) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchaseprice;
        this.purchaseDate = purchasedate;
        this.quantity = quantity;
    }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public String getCategory() { return this.category; }

    public void setCategory(String category) { this.category = category; }

    public float getPurchasePrice() { return this.purchasePrice; }

    public void setPurchasePrice(float purchaseprice) { this.purchasePrice = purchaseprice; }

    public String getPurchaseDate() { return this.purchaseDate; }

    public void setPurchaseDate(String purchasedate) { this.purchaseDate = purchasedate; }

    public float getQuantity() { return this.quantity; }

    public void setQuantity(float quantity) { this.quantity = quantity; }
}
