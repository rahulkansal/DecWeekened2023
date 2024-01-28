package stepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@Sanity")
	public void before() {
		System.out.println("Before Smoke method");
	}
	
	@Before("@Regression")
	public void before_Regression() {
		System.out.println("Before Refression method");
	}

	@After("@Sanity")
	public void After_Smoke() {
		System.out.println("After Smoke method");
	}
	
	@After("@Regression")
	public void After_Regression() {
		System.out.println("After Regression method");
	} 
	
	
	@Before
	public void before_Regression1() {
		System.out.println("Before Scenario method");
	}

	@After
	public void After_Smoke1() {
		System.out.println("After scenario method");
	}
}
