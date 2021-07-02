package Test;

import Pojos.JsonError;
import Pojos.JsonSuccess;
import genericos.Generica;

public class TestGeneric {
	
	public static void main(String[] args) {
		
		//Integer
		Generica<Integer> myObjectTest = new Generica<>(15);
		myObjectTest.showDataType();
		
		//Integer
		Generica<String> myObjectTest2 = new Generica<>("Hola Mundo");
		myObjectTest2.showDataType();
		
//		Generica<Object> myObjectTest3 = new Generica<>(new JsonSuccess());
		Generica<Object> myObjectTest3 = new Generica<>(new JsonError());
		myObjectTest3.showDataType();
		
//		if (true) {
			//Success
//			Generica<JsonSuccess> myObjectTest3 = new Generica<>(new JsonSuccess());
//			myObjectTest3.showDataType();
		
//			JsonSuccess js = (JsonSuccess) myObjectTest3.getMyObject();
//			js.setName("Luis");
//			System.out.println(js.getName());

//		} else {
			JsonError je = (JsonError) myObjectTest3.getMyObject();
			je.setCode(123);
			System.out.println(je.getCode());
//		}
	}
}