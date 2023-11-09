package com.asgames.kingdom.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ParcelTest {

    private static class TestParcel extends Parcel {

        public TestParcel(int size, int workers, int food) {
            super(size);
            this.workers = workers;
            this.food = food;
        }
    }

    @Test
    void oneWorkerOneFood() {
        Storage storage = new Storage();
        TestParcel parcel = new TestParcel(1, 1, 1);

        parcel.harvest(1, storage);

        assertThat(storage.getFood()).isEqualTo(1);
    }

    @Test
    void oneWorkerOneOutOfTenFood() {
        Storage storage = new Storage();
        TestParcel parcel = new TestParcel(10, 1, 1);

        parcel.harvest(1, storage);

        assertThat(storage.getFood()).isEqualTo(1);
    }

    @Test
    void oneWorkerTenFood() {
        Storage storage = new Storage();
        TestParcel parcel = new TestParcel(10, 1, 1);

        parcel.harvest(10, storage);

        assertThat(storage.getFood()).isEqualTo(10);
    }

    @Test
    void notEnoughWorkers() {
        Storage storage = new Storage();
        TestParcel parcel = new TestParcel(1, 3, 2);

        int remainingWorkers = parcel.harvest(2, storage);

        assertThat(storage.getFood()).isEqualTo(0);
        assertThat(remainingWorkers).isEqualTo(2);
    }

    @Test
    void tooManyWorkers() {
        Storage storage = new Storage();
        TestParcel parcel = new TestParcel(1, 3, 2);

        int remainingWorkers = parcel.harvest(6, storage);

        assertThat(storage.getFood()).isEqualTo(2);
        assertThat(remainingWorkers).isEqualTo(3);
    }
}