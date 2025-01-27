package com.br.collectioncomparison.model.entities;

import java.util.LinkedList;
import java.util.Queue;

import com.br.collectioncomparison.model.domain.Employee;
import com.br.collectioncomparison.model.interfaces.CollectionTest;

public class QueueADD implements CollectionTest {

	@Override
	public long test(Employee[] employees) {
		Queue<Employee> list = new LinkedList<>();

		long start = getMilliseconds();

		for (Employee e : employees) {
			list.add(e);
		}

		long end = getMilliseconds();

		return end - start;
	}
	
	@Override
	public String toString() {
		return "Adicionar elementos no Queue";
	}

}
