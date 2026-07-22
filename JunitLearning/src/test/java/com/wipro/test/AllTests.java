package com.wipro.test;



import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    TestSort.class,
    TestStringConcat.class,
    TestCheckPresence.class
})
public class AllTests {

}