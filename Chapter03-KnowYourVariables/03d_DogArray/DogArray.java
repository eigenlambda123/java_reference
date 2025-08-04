class DogArray {
	String name;
	public static void main (String[] args) {
		// make a Dog object and access it
		DogArray dog1 = new DogArray();
		dog1.bark();
		dog1.name = "Bart";
		
		// Dog array
		DogArray[] myDogs = new DogArray[3];

		// Assign Dog objects
		myDogs[0] = new DogArray();
		myDogs[1] = new DogArray();
		myDogs[2] = dog1;

		// Access Dogs using the array references
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";

		System.out.println("Last Dog's name is");
		System.out.println(myDogs[2].name);

		// Loop through the array and tell all dogs to bark
		int x = 0;
		while (x < myDogs.length) {
			myDogs[x].bark();
			x = x + 1;
		}
	}	

	public void bark() {
		System.out.println(name + " says Ruff!");
	}
}