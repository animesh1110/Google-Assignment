package com.sm.google.jtest;

/*
 * @ animesh
 * 
 */
import com.sm.google.SharePrice;

import junit.framework.TestCase;

public class SharePriceTest extends TestCase {
	
	SharePrice sp=null;


	protected static void setUpBeforeClass() throws Exception {
	}

	protected void setUp() throws Exception {
		super.setUp();
		sp= new SharePrice();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		sp=null;
		
	}


public void testLoadCompanies() throws Exception {
	//	sp.loadCompanies();
	assertNotNull(sp);
}

public void testProcessCompanies() {
		sp.processCompanies();
		assertNotNull(sp);
		
		
	}
	public void testGetNextCompanyData() {
		//	Company comp=sp.getNextCompanyData();
		assertNotNull(sp);
		
	}

}
