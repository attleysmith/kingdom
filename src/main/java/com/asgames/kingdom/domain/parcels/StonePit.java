package com.asgames.kingdom.domain.parcels;

import com.asgames.kingdom.domain.Parcel;

public class StonePit extends Parcel {

    public StonePit(int size) {
        super(size);
        this.stone = 100;
        this.workers = 5;
    }
}
