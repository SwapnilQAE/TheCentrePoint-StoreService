package com.tcp.storeService.serviceLayer.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;


@Data
public class StoreDetails {


    private long store_id;

    @NotNull(message = "isOpen can't be missing or empty")
    private boolean isOpen;

    @Min(value = 100000, message = "The pin cade can't be less then 100000")
    @Max(value = 999999, message = "The pin code can't be greater then 999999")
    @NotNull(message = "pin_code can't be missing or empty")
    private int pin_code;

    @Length(min = 20, max = 600, message = "The length of Address must be greater then 19 character and less then 600 character")
    @NotNull(message = "address can't be null or empty")
    private String address;

    @NotNull(message = "latitude can't be null or empty")
    private double latitude;

    @NotNull(message = "longitude can't be null or empty")
    private double longitude;

    private Timestamp created_at;

    private Timestamp modified_at;

    public StoreDetails() {
    }

    public StoreDetails(@NotNull(message = "isOpen can't be missing or empty") boolean isOpen,
                        @NotNull(message = "pin_code can't be missing or empty") int pin_code,
                        @NotNull(message = "address can't be null or empty") String address,
                        @NotNull(message = "latitude can't be null or empty") double latitude,
                        @NotNull(message = "longitude can't be null or empty") double longitude) {
        this.pin_code = pin_code;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.isOpen = isOpen;
    }

    public StoreDetails(long store_id,
                        @NotNull(message = "isOpen can't be missing or empty") boolean isOpen,
                        @NotNull(message = "pin_code can't be missing or empty") int pin_code,
                        @NotNull(message = "address can't be null or empty") String address,
                        @NotNull(message = "latitude can't be null or empty") double latitude,
                        @NotNull(message = "longitude can't be null or empty") double longitude,
                        Timestamp created_at,
                        Timestamp modified_at) {
        this.store_id = store_id;
        this.isOpen = isOpen;
        this.pin_code = pin_code;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.created_at = created_at;
        this.modified_at = modified_at;
    }
}
