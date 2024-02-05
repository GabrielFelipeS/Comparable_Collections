package com.br.collectioncomparison.model.entities;

import java.util.ArrayDeque;

import com.br.collectioncomparison.model.domain.Employee;
import com.br.collectioncomparison.model.interfaces.CollectionTest;

public class DequeAddFirstTestADD implements CollectionTest {

	@Override
	public long test(Employee[] employees) {
		ArrayDeque<Employee> list = new ArrayDeque<>();

		long start = getMilliseconds();

		for (Employee e : employees) {
			list.addFirst(e);
		}

		long end = getMilliseconds();

		return end - start;
	}

}