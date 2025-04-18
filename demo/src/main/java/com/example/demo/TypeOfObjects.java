package com.example.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TypeOfObjects {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		Class cls = Class.forName("PersonEntity"); 
//		PersonEntity entity = (PersonEntity)cls.newInstance();
		PersonEntity student = new PersonEntity("Phool", "Babu");
		 try (FileOutputStream fileOut = new FileOutputStream("student.ser");
	             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
	            out.writeObject(student);
	            System.out.println("Serialized data saved in student.ser");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}
