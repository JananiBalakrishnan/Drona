package com.lotus.drona;

public class DayTwo {

	/*
	 * Learn Basics - if-else,for loop,while,switch cases 
	 * Access Modifiers - public,private, protected 
	 * Static, Singleton - Usage 
	 * Write a TestNG Test, Read values from DataProvider
	 */
	
	//Instead of traditional for loop, use IntStream
	for (int i = 0; i < 10; i++) {
	System.out.println(i);
	}

	//Using Intstream
	 IntStream.range(0, size).forEach(
                    size -> System.out.println("******* size")
            );
	
	//List of Hashmap Iteration
	List<HashMap> list1 = jsonPath.getList(listName);
                list1.stream().forEach((c) ->
                        softAssert.assertNotNull(c.get("attributeKeyName")
                  ));
}
