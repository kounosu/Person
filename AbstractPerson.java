public abstract class AbstractPerson {

	private static final String MAN = null;

    protected abstract String getGender();

	public void speak() {
		System.out.println("I'm a " + MAN);
	}
}
