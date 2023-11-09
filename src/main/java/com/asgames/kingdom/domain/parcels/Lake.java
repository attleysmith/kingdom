package com.asgames.kingdom.domain.parcels;

import com.asgames.kingdom.domain.Parcel;

public class Lake extends Parcel {

    public Lake(int size) {
        super(size);
        this.food = 2;
        this.workers = 1;
    }
}
