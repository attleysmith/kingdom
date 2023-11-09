package com.asgames.kingdom.domain.parcels;

import com.asgames.kingdom.domain.Parcel;

public class Pasture extends Parcel {

    public Pasture(int size) {
        super(size);
        this.food = 2;
        this.workers = 1;
    }
}
