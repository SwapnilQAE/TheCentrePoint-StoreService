package com.tcp.storeService.serviceLayer.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "store")
@Data
public class Store {
    @Id
    @GeneratedValue
    private long storeID;

    @GeneratedValue
    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private Timestamp createdAt;

    @GeneratedValue
    @Column(name = "modified_at")
    @UpdateTimestamp
    private Timestamp modifiedAt;

    @Column(name = "is_open", nullable = false)
    private boolean isOpen;

    @Column(name = "pin_code", nullable = false)
    private int pinCode;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private double latitude;

    @Column(nullable = false)
    private double longitude;

    public Store() {
    }

    public Store(int pinCode, String address, double latitude, double longitude) {
        this.pinCode = pinCode;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeID=" + storeID +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                ", isOpen=" + isOpen +
                ", pinCode=" + pinCode +
                ", address='" + address + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
