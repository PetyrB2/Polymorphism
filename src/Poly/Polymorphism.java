package Poly;

//=========================================================================
// A few classes to work with Bird, Robin, Swallow and Pelican
class Bird {

	// Create a FINAL Object that cannot be Overridden
	public void species() {
		final String spec = "Species is Bird";
		System.out.println(spec);
	}

	// Every Bird should have a Name
	public void name() {
		System.out.println("A_Bird");
	}

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

//=========================================================================
// Robin class
class Robin extends Bird {
	// Robin extends Bird but we Override the name() method locally.
	@Override
	public void name() {
		System.out.println("A Robin");
	}
}

//=========================================================================
// Sparrow class
class Sparrow extends Bird {
	// Sparrow extends Bird but we Override the name() method locally.
	@Override
	public void name() {
		System.out.println("A Sparrow");
	}
}

//=========================================================================
// Pelican class
class Pelican extends Bird {
	// Pelican extends Bird but we Override name(), sing() and size() methods
	// locally.

	@Override
	public void name() {
		System.out.println("A Pelican");
	}

	@Override
	public void sing() {
		System.out.println("Sings Caaaw! Caaaw! Caaaw!");
	}

	@Override
	public void size() {
		System.out.println("Is Big in size");
	}

}
//=========================================================================
// Begin the main class
public class Polymorphism {
	// The main runner
	public static void main(String[] args) {
		// Intro
		System.out.println("========================");
		System.out.println("Title: Polymorphism");
		System.out.println("Genre: Java Basics / Intermediate");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("========================\n");

		// Create a Bird
		Bird b = new Bird();
		System.out.println("A Bird...");
		b.species();
		b.hasFeathers();
		b.sing();
		b.size();

		// Create a Robin
		System.out.println("\nA Robin...");
		Robin r = new Robin();
		r.species();
		r.hasFeathers();
		r.sing();
		r.size();
		// Create a Robin
		System.out.println("\nA Sparrow ...");
		Sparrow s = new Sparrow();
		s.species();
		s.hasFeathers();
		s.sing();
		s.size();
		// Create a Pelican. This extends Bird but Overrides sing and size methods.
		System.out.println("\nA Pelican...");
		Pelican p = new Pelican();
		p.species();
		p.hasFeathers();
		p.sing();
		p.size();

		// Added an Explanation
		System.out.println("\n----------------------------------------------------------");
		System.out.println("This has been a basic exmaple of Polymorphism.");
		System.out.println("All the Birds are alike in that they extend Bird.");
		System.out.println("The Robin and Sparrow classes hold very little data");
		System.out.println("They inherit the data from bird.");
		System.out.println("Pelican however does extend Bird but it Overrides size()");
		System.out.println("and sing() methods in its class as they differ.");
		System.out.println("----------------------------------------------------------");

		// =========================================================================
		// Second way of Printing the data out.
		System.out.println("----------------------------");
		System.out.println("Using an Array and For Loop");
		System.out.println("----------------------------");
		System.out.println("");

		Bird birds[] = new Bird[4];
		birds[0] = new Robin();
		birds[1] = new Sparrow();
		birds[2] = new Pelican();
		birds[3] = new Bird();

		// For loop to iterate through the data
		for (int a = 0; a < birds.length; a++) {
			System.out.println("\n-------------------------");
			birds[a].species();
			birds[a].name();
			birds[a].hasFeathers();
			birds[a].sing();
			birds[a].size();
		}

		System.out.println("\n-------------------------");
		for (int x = 0; x < birds.length; x++) {
			System.out.println("\n-------------------------");
			birds[x].species();
			birds[x].name();
			birds[x].hasFeathers();
			birds[x].sing();
			birds[x].size();
		}

	}
}
//=========================================================================