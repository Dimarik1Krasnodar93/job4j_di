package ru.job4j.di;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.job4j.tracker.input.Input;

@Data
@Component
public class StartUI {

    @Autowired
    private Store store;
    @Autowired
    private Input input;

    public StartUI(Store store) {
        this.store = store;
    }

    @Autowired
    public void setStore(Store store) {
        this.store = store;
    }

    @Autowired
    public void setInput(Input input) {
        this.input = input;
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
