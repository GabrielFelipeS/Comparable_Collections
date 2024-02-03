package com.br.collectioncomparison.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.br.collectioncomparison.model.domain.Employee;
import com.br.collectioncomparison.model.interfaces.CollectionTest;

public class HashSetTestADD implements CollectionTest {

	@Override
	public long test(Employee[] employees) {
		Set<Employee> list = new HashSet<>();

		long start = getMilliseconds();

		for (Employee e : employees) {
			list.add(e);
		}
		
		long end = getMilliseconds();

		return end - start;
	}

}