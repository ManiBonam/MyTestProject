package com.mytest.app;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;

import com.mytest.sample.ReadFromExcel;

public class Runner {

	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		String FILE_PATH = "S:\\DevSpace\\Test_Data\\personData.xlsx";
		ReadFromExcel readFromExcel = new ReadFromExcel(FILE_PATH);
		HashMap<List<Row>, List<String>> hashMap = new HashMap<>();
		
		readFromExcel.createPersonObject();
		readFromExcel.printValues();
		//hashMap = readFromExcel.readData();
		
	//	hashMap.forEach((key, value) -> System.out.println(key + ":" + value));

	}

}
