package week05.slot01;

public class Giraffe extends Animal implements Playful {

	public Giraffe(String fav_food, boolean hunger) {
		super(fav_food, hunger);
	}

	public void play() {
		System.out.println("Giraffe! I am playing.");
	}

	@Override
	public void makeNoise() {
		System.out.println("NEIGH!");		
	}

	@Override
	public void eat() {
		System.out.println("NEIGH! I am eating.");
	}
	
}
