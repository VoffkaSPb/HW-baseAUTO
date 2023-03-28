package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemainLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int expectedRemain = 200;
        int actualRemain = service.remain(amount);
        Assert.assertEquals(expectedRemain, actualRemain);
    }

    @Test
    public void testRemainEqualToBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expectedRemain = 0;
        int actualRemain = service.remain(amount);
        Assert.assertEquals(expectedRemain, actualRemain);
    }

    @Test
    public void testRemainGreaterThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;
        int expectedRemain = 800;
        int actualRemain = service.remain(amount);
        Assert.assertEquals(expectedRemain, actualRemain);
    }
}
