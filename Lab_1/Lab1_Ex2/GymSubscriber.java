package dStructures_Lab1_Ex2;

// Data Structures - Lab 1 - Ex 2
// Shayma Hicham Obeid
// Moustafa Haydar - 2024 03 077

public class GymSubscriber {
	private Subscriber[] gymSubscribers;
	int currentSubscriber;
	private final int size;

	public GymSubscriber() {
		this.size = 50;
		this.gymSubscribers = new Subscriber[size];
		this.currentSubscriber = 0;
	}

	public boolean isEmpty() {
		return currentSubscriber == 0;
	}

	public boolean isFull() {
		return currentSubscriber == gymSubscribers.length;
	}

	public void AddSubscriber(Subscriber gymSub) {
		if (isFull()) {
			System.out.println("Sorry! Can't add more subscribers.");
			return;
		}
		gymSubscribers[currentSubscriber++] = gymSub;
		System.out.println("Subscriber is added.");
	}

	public void SearchByName(String name) {
		System.out
				.println("List of subscribers with the name \"" + name + "\":");
		for (int i = 0; i < currentSubscriber; i++) {
			if ((gymSubscribers[i].get_Name()).equals(name))
				System.out.println(gymSubscribers[i]);
		}
	}

	public void searchByIdCard(String id) {
		System.out.println("Subscriber having the id \"" + id + "\":");
		for (int i = 0; i < currentSubscriber; i++) {
			if ((gymSubscribers[i].get_ID()).equals(id))
				System.out.println(gymSubscribers[i]);
		}
	}

	public void printSubscriberList() {
		if (isEmpty()) {
			System.out.println("No subscribers are registered in the GYM!");
			return;
		}

		System.out.println("Gym Subscribers: ");
		for (int i = 0; i < currentSubscriber; i++) {
			if (gymSubscribers[i] != null) {
				System.out.println(gymSubscribers[i]);
			}
		}
		System.out.println();
	}

}
