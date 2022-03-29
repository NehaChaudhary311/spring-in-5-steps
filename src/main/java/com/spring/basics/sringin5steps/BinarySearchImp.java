package com.spring.basics.sringin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImp {
    @Autowired
    private SortAlgorithm sortAlgorithm;
    public BinarySearchImp(SortAlgorithm sortAlgorithm){
        super();
        this.sortAlgorithm = sortAlgorithm;
    }
    public int binarySearch(int[] numbers, int find ){
       int[] sortedNumbers = sortAlgorithm.sort(numbers);
       System.out.println(sortAlgorithm);
    return 3;
    }
}
