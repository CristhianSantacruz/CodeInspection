package labcodeinspection;

public class Email {

	private final String mFirstName; 
	private final String mLastName;
	private String password;
	private String department;
	private final int defaultPasswordLength = 8;
	private String email;

	public Email(String firstName, String lastName) {
		this.mFirstName = firstName;
		this.mLastName = lastName;
		this.password = null;
	}

	public void showInfo() {
		System.out.println("\nFIRST NAME= " + mFirstName + "\nLAST NAME= " + mLastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}

	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			this.department = "other";
			System.out.println("Invalid department choice.");
			break;
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}

	public void generateEmail() {
		this.password = this.randomPassword(this.defaultPasswordLength);
		this.email = this.mFirstName.toLowerCase() + this.mLastName.toLowerCase() + "@" + this.department
				+ ".espol.edu.ec";
	}
}
