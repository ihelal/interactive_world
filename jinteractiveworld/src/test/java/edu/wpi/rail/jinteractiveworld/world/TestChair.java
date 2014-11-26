package edu.wpi.rail.jinteractiveworld.world;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.Test;

public class TestChair {

	@Test
	public void testConstructor() throws SecurityException,
			NoSuchFieldException, IllegalArgumentException,
			IllegalAccessException {
		Field f1 = Chair.class.getDeclaredField("NAME");
		f1.setAccessible(true);
		Field f2 = Chair.class.getDeclaredField("WIDTH");
		f2.setAccessible(true);
		Field f3 = Chair.class.getDeclaredField("HEIGHT");
		f3.setAccessible(true);
		Chair c = new Chair();
		assertEquals((String) f1.get(c), c.getName());
		assertEquals((double) f2.get(c), c.getWidth());
		assertEquals((double) f3.get(c), c.getHeight());
	}
}