package ru.netology.service;

import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainIfAmountLessThanBoundary() {
        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainIfAmountBoundary() {
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainIfAmountMoreThanBoundary() {
        int actual = service.remain(1200);
        int expected = 800;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainIfAmountZero() {
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }
}