package data.java.animal;
import data.java.animal.dog.Dog;

public class Animal_ref_test {
	
    public static void main(String[] args) {
    		Animal animal_01 = new Animal("Animal_01");
    		Dog dog_01 = new Dog("Dog_01");
            animal_01 = dog_01;
            System.out.println("in Animal_ref_test");
            dog_01 = animal_01;
	}
    	
}
