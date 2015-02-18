package com.github.akarnokd.scp;

import static org.junit.Assert.*;

import org.junit.Test;

import rx.Observable;

public class TestDependencies {

    @Test
    public void test() {
        assertEquals((Integer)1, Observable.just(1).toBlocking().first());
    }

    public void testLambda() {
        Runnable r = System.out::println;
        r.run();
    }
}
