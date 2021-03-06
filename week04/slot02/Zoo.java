package week04.slot02;

import java.util.Arrays;

import week04.slot01.Animal;
import week04.slot01.Giraffe;

public class Zoo {

	Animal[] animals;
	
	public Zoo() {
		animals = new Animal[10];
	}
	
	public boolean adopt(Animal animal) {
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] == null) {
				animals[i] = animal;
				return true;
			}
		}
		return false;
	}
	
	public void letsPlay(int index) {
		if(animals[index] != null && animals[index] instanceof Giraffe) {
			((Giraffe) animals[index]).play();
		} else {
			if(animals[index] == null) {
				System.out.println("No animal exists in this slot.");
			} else {
				System.out.println("This animal unable to play.");
			}
		}
	}
	
	public void letsPlayOtherSolution(int index) {
		try {
			((Giraffe) animals[index]).play();
		} catch (ClassCastException e) {
			System.out.println("This animal unable to play.");
		} catch (NullPointerException e) {
			System.out.println("No animal exists in this slot.");
		}
	}

	@Override
	public String toString() {
		return "Zoo [animals=" + Arrays.toString(animals) + "]";
	}
	
}



