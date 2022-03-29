package com.spring.basics.sringin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SringIn5StepsApplication {

	public static void main(String[] args) {


		ApplicationContext applicationContext = SpringApplication.run(SringIn5StepsApplication.class, args);
		BinarySearchImp binarySearch = applicationContext.getBean(BinarySearchImp.class);
		int res = binarySearch.binarySearch(new int[] {2,5,6,3}, 3);
		System.out.println(res);
	}

}
