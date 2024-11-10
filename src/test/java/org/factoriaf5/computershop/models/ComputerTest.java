package org.factoriaf5.computershop.models;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

public class ComputerTest {
    @Test
    void testGetBrand() {
        Computer computer = new Computer("HP", 8, "Intel i7", "Windows 11", 700.0);
        assertThat(computer.getBrand(), is(equalTo("HP")));
    }

    @Test
    void testGetMemory() {
        Computer computer = new Computer("HP", 6, "Intel i6", "Windows 10", 700.0);
        assertThat(computer.getMemory(), is(equalTo(6)));

    }

    @Test
    void testGetPrice() {
        Computer computer = new Computer("SONY", 8, "Intel i5", "Windows 10", 900.0);
        assertThat(computer.getPrice(),is(equalTo(900.0)));

    }

    @Test
    void testGetProcessador() {
        Computer computer = new Computer("Lenovo", 8, "Intel i7", "Windows 10", 700.0);
        assertThat(computer.getProcessor(), is(equalTo("Intel i7")));

    }

    @Test
    void testSetBrand() {
        Computer computer = new Computer("Dell", 8, "Intel i7", "Windows 10", 700.0);
        computer.setBrand("HP");
        assertThat(computer.getBrand(), is(equalTo("HP")));

    }

    @Test
    void testSetMemory() {
        Computer computer = new Computer("HP", 6, "Intel i8", "Windows 11", 700.0);
        computer.setMemory(10);
        assertThat(computer.getMemory(), is(equalTo(10)));

    }

    @Test
    void testSetPrice() {
        Computer computer = new Computer("Dell", 8, "Intel i7", "Windows 10", 700.0);
        computer.setPrice(400.0);
        assertThat(computer.getPrice(), is(equalTo(400.0)));

    }

    @Test
    void testSetProcessador() {
        Computer computer = new Computer("HP", 8, "Intel i7", "Windows 11", 990.0);
        computer.setProcessor("Core 10");
        assertThat(computer.getProcessor(), is(equalTo("Core 10")));

    }
}