package Poly;

// A few classes to work with Bird, Robin, Swallow and Pelican
class Bird {
	// hasFeathers() Method
	public void hasFeathers() {
		System.out.println("Has Feathers.");
	}

	// sing() Method
	public void sing() {
		System.out.println("Sings Tweet! Tweet! Tweet!");
	}

	// size() Method
	public void size() {
		System.out.println("Is small in size.");
	}
}

// Robin class
class Robin extends Bird {

}

// Sparrow class
class Sparrow extends Bird {

}

// Pelican class
class Pelican extends Bird {
	// This extends Bird but we Override sing() and size() methods locally.
	@Override
	public void sing() {
		System.out.println("Is Big in size");
	}

	@Override
	public void size() {
		System.out.println("Sings Caaaw! Caaaw! Caaaw!");
	}

}

// Begin the main class
public class Polymorphism {
	// The main runner
	public static void main(String[] args) {
		// Intro
		System.out.println("========================");
		System.out.println("Title: Polymorphism");
		System.out.println("Genre: Java Basics");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("========================\n");
		System.out.println("");

		// Create a Bird
		Bird b = new Bird();
		System.out.println("A Bird...");
		b.hasFeathers();
		b.sing();
		b.size();
		// Create a Robin
		System.out.println("\nA Robin...");
		Robin r = new Robin();
		r.hasFeathers();
		r.sing();
		r.size();
		// Create a Robin
		System.out.println("\nA Sparrow ...");
		Sparrow s = new Sparrow();
		s.hasFeathers();
		s.sing();
		s.size();
		// Create a Pelican. This extends Bird but Overrides sing and size methods.
		System.out.println("\nA Pelican...");
		Pelican p = new Pelican();
		p.hasFeathers();
		p.sing();
		p.size();

		// Added an Explanation
		System.out.println("\n----------------------------------------------------------");
		System.out.println("This has been a basic exmaple of Polymorphism.");
		System.out.println("All the Birds are alike in that they extend Bird.");
		System.out.println("The Robin and Swallow classes hold very little data");
		System.out.println("They inherit the data from bird.");
		System.out.println("Pelican however does extend Bird but it Overrides size()");
		System.out.println("and sing() methods in its class as they differ.");
		System.out.println("----------------------------------------------------------");
	}
}
