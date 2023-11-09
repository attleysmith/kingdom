package com.asgames.kingdom.domain.parcels;

import com.asgames.kingdom.domain.Parcel;

public class ClayMine extends Parcel {

    public ClayMine(int size) {
        super(size);
        this.clay = 100;
        this.workers = 5;
    }
}
