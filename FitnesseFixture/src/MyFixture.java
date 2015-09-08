import fit.ColumnFixture;

public class MyFixture extends ColumnFixture {

	public String memberName;

	public String greeting() {
		String greet = "Hello " + memberName + ". Today is Tuesday.";
		return greet;
	}

}
