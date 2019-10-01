package com.java.exam.student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	private String sno;
	private String dept;

	public Student() {

	}

	public Student(String name, String sno, String dept) {
		super();
		this.name = name;
		this.sno = sno;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public static void doSerialiazable(Student student, String filePath) throws Exception {
		FileOutputStream fout = new FileOutputStream(filePath);
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		oout.writeObject(student);
		oout.close();
	}

	public static Object undoSerializable(String filePath) throws Exception {
		FileInputStream fin = new FileInputStream(filePath);
		ObjectInputStream oin = new ObjectInputStream(fin);
		Object obj = (Student) oin.readObject();
		return obj;
	}
}
