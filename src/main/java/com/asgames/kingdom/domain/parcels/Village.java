package com.asgames.kingdom.domain.parcels;

import com.asgames.kingdom.domain.Parcel;

public class Village extends Parcel {

    public Village(int size) {
        super(size);
        this.food = 20;
    }
}
