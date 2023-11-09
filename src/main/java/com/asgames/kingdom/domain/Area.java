package com.asgames.kingdom.domain;

import com.asgames.kingdom.domain.parcels.*;

public class Area {

    private final Village village = new Village(1);
    private final Forest forest = new Forest(185);
    private final River river = new River(23);
    private final Lake lake = new Lake(16);
    private final ClayMine clayMine = new ClayMine(13);
    private final StonePit stonePit = new StonePit(16);
    private final OreMine oreMine = new OreMine(4);
    private final Cropland cropland = new Cropland(131);
    private final Pasture pasture = new Pasture(226);
    private final Wasteland wasteland = new Wasteland(10);
    private final Population population = new Population();
    private final Storage storage = new Storage();

    public void harvest() {
        harvestByPrecedence(village, cropland, pasture, river, lake, forest, clayMine, stonePit, oreMine, wasteland);
        storage.removeFood(population.feedPopulation(storage.getFood()));
        population.growPopulation();
    }

    private void harvestByPrecedence(Parcel... parcels) {
        int workers = population.getPeople();
        for (Parcel parcel : parcels) {
            workers = parcel.harvest(workers, storage);
        }
    }

    @Override
    public String toString() {
        return "Area{" + System.lineSeparator() +
                " population=" + population + System.lineSeparator() +
                " storage=" + storage + System.lineSeparator() +
                '}';
    }
}
