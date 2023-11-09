package com.asgames.kingdom.domain.parcels;

import com.asgames.kingdom.domain.Parcel;

public class Cropland extends Parcel {

    public Cropland(int size) {
        super(size);
        this.food = 5;
        this.workers = 3;
    }
}
