package com.asgames.kingdom.domain.parcels;

import com.asgames.kingdom.domain.Parcel;

public class Forest extends Parcel {

    public Forest(int size) {
        super(size);
        this.food = 1;
        this.wood = 100;
        this.workers = 3;
    }
}
