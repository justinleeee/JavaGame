package com.redomar.game.script;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by Mohamed on 28/08/2016.
 * This file tests the com.redomar.game.script.Printing class
 */
public class PrintingTest {

	private Printing printing;

	@Before
	public void setUp() throws Exception {
		printing = new Printing();
	}

	@Test
	public void printToFileWorks() throws Exception {
		printing.print("TESTING STRING", PrintTypes.TEST);
		File file = new File(".PrintType-TEST.txt");
		assertTrue(file.exists());
		assertTrue(file.delete());
	}

	@Test
	public void getMessageIsNull() {
		assertNull(printing.getMessage());
	}

	@Test
	public void getMessageIsNotNull() {
		printing.setMessage("Not Null");
		assertNotNull(printing.getMessage());
	}

	@After
	public void cleanUp(){
		printing = null;
	}

}