package genericos;

public class Generica<T> {

	T myObject;

	public Generica(T myObject) {
		this.myObject = myObject;
	}

	public void showDataType() {
		System.out.println("El tipo T es: " + this.myObject.getClass().getSimpleName());
	}

	public T getMyObject() {
		return myObject;
	}

}