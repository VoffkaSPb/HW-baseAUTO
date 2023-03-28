package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemainLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int expectedRemain = 200;
        int actualRemain = service.remain(amount);
        Assert.assertEquals(actualRemain, expectedRemain);
    }

    @Test
    public void testRemainEqualToBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expectedRemain = 0;
        int actualRemain = service.remain(amount);
        Assert.assertEquals(actualRemain, expectedRemain);
    }

    @Test
    public void testRemainGreaterThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;
        int expectedRemain = 800;
        int actualRemain = service.remain(amount);
        Assert.assertEquals(actualRemain, expectedRemain);
    }
}

