package com.asgames.kingdom.domain;

import static java.lang.Math.min;

public abstract class Parcel {

    private final int size;
    protected int food = 0;
    protected int wood = 0;
    protected int stone = 0;
    protected int metal = 0;
    protected int clay = 0;
    protected int workers = 0;

    protected Parcel(int size) {
        this.size = size;
    }

    int harvest(int allocatedWorkers, Storage storage) {
        int harvestedSize = workers == 0 ? size : min(size, allocatedWorkers / workers);
        fillStorage(harvestedSize, storage);
        return allocatedWorkers - (harvestedSize * workers);
    }

    private void fillStorage(int harvestedSize, Storage storage) {
        storage.addFood(harvestedSize * food);
        storage.addWood(harvestedSize * wood);
        storage.addStone(harvestedSize * stone);
        storage.addMetal(harvestedSize * metal);
        storage.addClay(harvestedSize * clay);
    }
}
