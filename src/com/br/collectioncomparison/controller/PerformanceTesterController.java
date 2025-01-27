package com.br.collectioncomparison.controller;

import java.time.LocalDateTime;

import com.br.collectioncomparison.model.domain.DataFile;
import com.br.collectioncomparison.model.domain.Employee;
import com.br.collectioncomparison.model.domain.PerformaceResults;
import com.br.collectioncomparison.model.domain.TestObject;
import com.br.collectioncomparison.model.interfaces.CollectionTest;
import com.br.collectioncomparison.model.service.CollectionPerformanceTester;
import com.br.collectioncomparison.model.service.EmployeeFileReader;

public class PerformanceTesterController {
	private CollectionPerformanceTester collectionPerformanceTester = new CollectionPerformanceTester(10);

	public PerformaceResults test(DataFile dataFile, CollectionTest testObject) {
		Employee[] employees = readFile(dataFile.getFileName());
		Long runtime = collectionPerformanceTester.test(testObject, employees);

		return new PerformaceResults(testObject.toString(), dataFile.getTitle(), runtime, LocalDateTime.now());
	}

	private Employee[] readFile(String nameFile) {
		return EmployeeFileReader.read(nameFile);
	}
}
