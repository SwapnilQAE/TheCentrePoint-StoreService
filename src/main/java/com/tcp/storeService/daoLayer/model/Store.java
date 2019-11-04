package com.tcp.storeService.daoLayer.model;

import javax.persistence.*;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "store")
@Data
public class Store {
    @Id
    @GeneratedValue
    private long store_id;

    @GeneratedValue
    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private Timestamp created_at;

    @GeneratedValue
    @Column(name = "modified_at", updatable = false)
    @UpdateTimestamp
    private Timestamp modified_at;

    @Column(name = "isOpen", nullable = false)
    private boolean is_open;

    @Column(name = "pin_code", nullable = false)
    private int pin_code;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private double latitude;

    @Column(nullable = false)
    private double longitude;

    public Store() {
    }

    public Store(int pin_code, boolean is_open, String address, double latitude, double longitude) {
        this.is_open = is_open;
        this.pin_code = pin_code;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Store(long store_id, int pin_code, boolean is_open, String address, double latitude, double longitude) {
        this.store_id = store_id;
        this.pin_code = pin_code;
        this.is_open = is_open;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "StoreDetails{" +
                "store_id=" + store_id +
                ", created_at=" + created_at +
                ", modified_at=" + modified_at +
                ", isOpen=" + is_open +
                ", pin_code=" + pin_code +
                ", address='" + address + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
