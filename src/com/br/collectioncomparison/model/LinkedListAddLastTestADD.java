package com.br.collectioncomparison.model;

import java.util.LinkedList;

import com.br.collectioncomparison.model.domain.Employee;
import com.br.collectioncomparison.model.interfaces.CollectionTest;

public class LinkedListAddLastTestADD implements CollectionTest {

	@Override
	public long test(Employee[] employees) {
		LinkedList<Employee> list = new LinkedList<>();
		long start = getMilliseconds();
		for(Employee e: employees) {
			list.addLast(e);
		}
		long end = getMilliseconds();
		
		return end - start;
	}

}