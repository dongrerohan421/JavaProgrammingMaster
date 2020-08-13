package com.section5_control_flow_statements.ce28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PaintJobTest {
    static PaintJob paintJob;

    @BeforeAll
    private static void init() {
        paintJob = new PaintJob();
    }

    @SuppressWarnings("static-access")
    @Test
    public void getBucketCountWithinRangeTest() {
        int expected = 3;
        int actual = paintJob.getBucketCount(2.75, 3.25, 2.5, 1);

        Assertions.assertEquals(expected, actual);

        expected = 5;
        actual = paintJob.getBucketCount(3.4, 2.1, 1.5);

        Assertions.assertEquals(expected, actual);

        expected = 3;
        actual = paintJob.getBucketCount(6.26, 2.2);

        Assertions.assertEquals(expected, actual);
    }

    @SuppressWarnings("static-access")
    @Test
    public void getBucketCountNotWithinRangeTest() {
        int expected = -1;
        int actual = paintJob.getBucketCount(-3.4, 2.1, 1.5, 2);

        Assertions.assertEquals(expected, actual);

        actual = paintJob.getBucketCount(-3.4, 2.1, 1.5);

        Assertions.assertEquals(expected, actual);

        actual = paintJob.getBucketCount(-6.26, 2.2);

        Assertions.assertEquals(expected, actual);
    }
}