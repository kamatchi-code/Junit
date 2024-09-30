package itlearnjunit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import ecommerceJunit.JunitUser;
import ecommerceJunit.JunitUser1;

public class Junit1RunAll {
	@Test
	public  void test() {
	Result rs = JUnitCore.runClasses(dashboard1.class,MasterofSoftwareTesting1.class);
	System.out.println("run time"+rs.getRunCount());
	
	System.out.println("failure time"+rs.getFailureCount());
	List<Failure> Fa = rs.getFailures();
	for (Failure x : Fa) {
		System.out.println(x);
}}}

