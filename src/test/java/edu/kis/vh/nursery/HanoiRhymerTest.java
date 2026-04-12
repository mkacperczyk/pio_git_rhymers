package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerTest {

    @Test
    public void reportRejected() {
        HanoiRhymer rhymer = new HanoiRhymer();
        rhymer.countIn(10);
        rhymer.countIn(15);
        Assert.assertEquals(1, rhymer.reportRejected());
    }

    @Test
    public void countIn() {
        HanoiRhymer rhymer = new HanoiRhymer();
        rhymer.countIn(10);
        Assert.assertEquals(10, rhymer.peekaboo());
    }
}