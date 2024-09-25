package dStructures_Lab1_Ex2;

// Data Structures - Lab 1 - Ex 2
// Shayma Hicham Obeid
// Moustafa Haydar - 2024 03 077

public class Subscriber {
	private String _Name;
	private String _PhoneNumber;
	private String _ID;
	private char _Gender;

	public Subscriber(String _Name, String _PhoneNumber, String _ID,
			char _Gender) {
		super();
		this._Name = _Name;
		this._PhoneNumber = _PhoneNumber;
		this._ID = _ID;
		this._Gender = _Gender;
	}

	public String get_Name() {
		return _Name;
	}

	public void set_Name(String _Name) {
		this._Name = _Name;
	}

	public String get_PhoneNumber() {
		return _PhoneNumber;
	}

	public void set_PhoneNumber(String _PhoneNumber) {
		this._PhoneNumber = _PhoneNumber;
	}

	public String get_ID() {
		return _ID;
	}

	public void set_ID(String _ID) {
		this._ID = _ID;
	}

	public char get_Gender() {
		return _Gender;
	}

	public void set_Gender(char _Gender) {
		this._Gender = _Gender;
	}

	@Override
	public String toString() {
		return "Subscriber Info: \n_Name=" + _Name + ",\n _PhoneNumber="
				+ _PhoneNumber + ",\n _ID=" + _ID + ",\n _Gender=" + _Gender;
	}

}
