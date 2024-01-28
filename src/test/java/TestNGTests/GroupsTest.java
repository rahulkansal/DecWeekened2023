package TestNGTests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore
public class GroupsTest {

	@Test(groups = {"Regression","Smoke"},enabled=true)
	public void test() {
		System.out.println("test");;
	}
	
	@Ignore
	@Test(groups = {"Regression"})
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(groups = {"Smoke"})
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(groups = {"Sanity"})
	public void test3() {
		System.out.println("test3");
	}
}
