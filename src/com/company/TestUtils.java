package com.company;

import java.util.Collection;
import java.util.List;
import java.util.Set;
public class TestUtils {

    public static int ITERATION_COUNT  = 50000;


    public static long testAddToCollection(Collection<Integer> collection){
        long startTime = System.currentTimeMillis();

        for ( int i=0; i<ITERATION_COUNT; i++){
            collection.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;

    }

    public static long testAddToTheBegining(List<Integer> collection){
        long startTime = System.currentTimeMillis();

        for ( int i=0; i<ITERATION_COUNT; i++){
            collection.add( 0, i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;

    }
    public static long testAddToTheEnding(List<Integer> collection){
        long startTime = System.currentTimeMillis();

        for ( int i=0; i<ITERATION_COUNT; i++){
            collection.add( collection.size(), i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;

    }

    public static long testSetContains (Set<Integer> collection ){
        long startTime = System.currentTimeMillis();

        for ( int i=0; i<ITERATION_COUNT; i++){
            collection.add(i);
        }

        for ( int i=0; i<collection.size(); i++){
            collection.contains(5);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
    public static long testListContains (List<Integer> collection ){
        long startTime = System.currentTimeMillis();

        for ( int i=0; i<ITERATION_COUNT; i++){
            collection.add(i);
        }

        for ( int i=0; i<collection.size(); i++){
            collection.contains(5);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }




}
