package data.java.animal.dog;
import data.java.animal.Animal;
import data.java.animal.dog.Dog;

public class Dog extends Animal {
	public Dog(String animalString) {
		super(animalString);
	}

    public static void main(String[] args) {
		Dog dog_01 = new Dog("Dog_01");
   		Animal animal_01 = new Animal("Animal_01");
		System.out.println("works at last...");
	}
}
