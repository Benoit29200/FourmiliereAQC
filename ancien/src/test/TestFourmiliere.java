package test;

import org.junit.Assert;
import org.junit.Test;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;

public class TestFourmiliere {
	
	@Test
	public void test() {
		Fourmiliere f = new Fourmiliere();
		try {
			f.step();
			Thread.sleep(1000);
			System.out.println(f.getDepot().getProies().size());
			System.out.println(f.getDepot().getPoidsConsommable());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		Assert.assertTrue(true);
	}
}
