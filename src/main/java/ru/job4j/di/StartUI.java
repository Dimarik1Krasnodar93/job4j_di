package ru.job4j.di;

import lombok.Data;
import ru.job4j.tracker.input.Input;

@Data
public class StartUI {

    private Store store;
    private Input input;

    public StartUI(Store store) {
        this.store = store;
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}
