package com.in28minutes.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SomeBusinessImplStubTest {

    @Test
    void findTheGreatestFromAllData_basicScenario() {
        DataService dataServiceStub1 = new DataServiceStub1();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub1);

        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(25, result);
    }

 @Test
    void findTheGreatestFromAllData_withOneValue() {
        DataService dataServiceStub2 = new DataServiceStub2();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub2);

        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(35, result);
    }

}

class DataServiceStub1 implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int []{25, 15, 5};
    }
}

class DataServiceStub2 implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int []{35};
    }
}