package com.br.collectioncomparison.model.entities;

import java.util.ArrayDeque;

import com.br.collectioncomparison.model.domain.Employee;
import com.br.collectioncomparison.model.interfaces.CollectionTest;

public class DequeAddLastTestADD implements CollectionTest {

	@Override
	public long test(Employee[] employees) {
		ArrayDeque<Employee> list = new ArrayDeque<>();

		long start = getMilliseconds();

		for (Employee e : employees) {
			list.addLast(e);
		}

		long end = getMilliseconds();

		return end - start;

	}

}