package TaggedHooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class taggedhooks {
@Before
	public void beforescenario() {
		System.out.println("this is before all scenario");
	}
@After
	public void afterscenario() {
		System.out.println("this after all scenario");
	}
@Before("@First")
	public void firstmethod() {
		System.out.println("this is before firstmethod");
	}
@Before("@Second")
	public void secondmethod() {
	System.out.println("this is before secondmethod");
	}
@Before("@Third")
	public void thirdmethod() {
	System.out.println("this is before thirdMethod");
	}
@After("@First")
public void Afterfirst() {
	System.out.println("this is after firstmethod");
}
@After("@Second")
public void Aftersecond() {
	System.out.println("this is after secondmethod");
}
@After("@Third")
public void Afterthird() {
	System.out.println("this is after thirdmethod");
}
}
