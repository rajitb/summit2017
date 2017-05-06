package com.adobe.summit2017.tl09.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junitx.util.PrivateAccessor;

public class MultilineModelTest {

	private MultilineModel model = new MultilineModel();
		  
	@Test
	public void testGetCalculationSuccess() throws NoSuchFieldException {
		
		PrivateAccessor.setField(model, "lines", new String[0]);
		assertEquals(0, model.getNumLines());
		
		PrivateAccessor.setField(model, "lines", new String[] {"one"});
		assertEquals(1, model.getNumLines());

	}

}
