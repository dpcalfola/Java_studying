package methodPractice;

class Greeting {
	public static void hi() {
		System.out.println("Hi");
	}
}

public class AccessLevelModifiersMethod {

	public static void main(String[] args) {

		Greeting.hi();

	}

}

/// public,
// protected,
// default,
// private: only can use in same class
