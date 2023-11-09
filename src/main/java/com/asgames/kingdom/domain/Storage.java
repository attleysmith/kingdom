package com.asgames.kingdom.domain;

import lombok.Getter;

class Storage {

    @Getter
    private int food = 0;
    private int wood = 0;
    private int stone = 0;
    private int metal = 0;
    private int clay = 0;

    void addFood(int food) {
        this.food += food;
    }

    void removeFood(int food) {
        this.food -= food;
    }

    void addWood(int wood) {
        this.wood += wood;
    }

    void addStone(int stone) {
        this.stone += stone;
    }

    void addMetal(int metal) {
        this.metal += metal;
    }

    void addClay(int clay) {
        this.clay += clay;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "food=" + food +
                ", wood=" + wood +
                ", stone=" + stone +
                ", metal=" + metal +
                ", clay=" + clay +
                '}';
    }
}
