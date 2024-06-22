package com.tnsif.programs;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation obj = new Encapsulation();// created an object
		//classname obj_name = new Classname();
//		obj.serialnum = 22; //calling datamember by using obj
//		obj.name = "Shruti";
//		obj.age = 21;
		
		obj.setName("Shruti");
		obj.setSerialnum(22);
		obj.setAge(21);
		System.out.println(obj);//obj representation
		obj.show();
	}
}
