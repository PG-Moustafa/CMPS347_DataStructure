package dStructures_Lab1_Ex2;

//Data Structures - Lab 1 - Ex 2
//Shayma Hicham Obeid
//Moustafa Haydar - 2024 03 077

public class Main {

	public static void main(String[] args) {
		// Create a GymSubscriber object
		GymSubscriber gym = new GymSubscriber();

		// Creating some Subscriber objects
		Subscriber sub1 = new Subscriber("John Doe", "123-456-7890", "ID001",
				'M');
		Subscriber sub2 = new Subscriber("Jane Smith", "987-654-3210", "ID002",
				'F');
		Subscriber sub3 = new Subscriber("John Doe", "555-123-4567", "ID003",
				'M');

		// Testing AddSubscriber
		System.out.println("Adding subscribers:");
		gym.AddSubscriber(sub1);
		gym.AddSubscriber(sub2);
		gym.AddSubscriber(sub3);

		// Display the list of current subscribers
		System.out.println("\nDisplaying current subscribers:");
		gym.printSubscriberList();

		// Testing SearchByName
		System.out.println(
				"\nSearching for subscribers with the name 'John Doe':");
		gym.SearchByName("John Doe");

		// Testing searchByIdCard
		System.out.println("\nSearching for subscriber with ID 'ID002':");
		gym.searchByIdCard("ID002");

		// Testing isFull and isEmpty methods
		System.out.println("\nIs the subscriber list full? " + gym.isFull());
		System.out.println("Is the subscriber list empty? " + gym.isEmpty());

		// Adding more subscribers to test the full capacity
		System.out.println("\nAdding more subscribers to reach full capacity:");
		for (int i = 4; i <= 50; i++) {
			gym.AddSubscriber(new Subscriber("Subscriber " + i,
					"000-000-000" + i, "ID00" + i, 'M'));
		}

		// Display after adding more subscribers
		System.out.println("\nDisplaying subscribers after adding more:");
		gym.printSubscriberList();

		// Trying to add another subscriber when the list is full
		System.out.println("\nTrying to add another subscriber when full:");
		gym.AddSubscriber(new Subscriber("Extra Subscriber", "111-111-1111",
				"ID051", 'F'));

		// Display final state
		System.out.println("\nFinal state of the subscribers list:");
		gym.printSubscriberList();
	}
}
