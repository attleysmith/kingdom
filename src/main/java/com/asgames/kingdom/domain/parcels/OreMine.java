package com.asgames.kingdom.domain.parcels;

import com.asgames.kingdom.domain.Parcel;

public class OreMine extends Parcel {

    public OreMine(int size) {
        super(size);
        this.metal = 100;
        this.workers = 5;
    }
}
