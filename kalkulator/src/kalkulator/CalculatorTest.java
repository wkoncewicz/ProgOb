package kalkulator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
	@Test
	public void testAddOne(){
		Calculator sut = new Calculator();
		sut.setState(0);
		sut.add(1);
		assertEquals("0+1 = 1", 1, sut.getState(), 0.0);
	}
	
	@Test
	public void testAddInfinity(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.add(Double.POSITIVE_INFINITY);
		assertEquals("1+infinity = infinity", Double.POSITIVE_INFINITY, sut.getState(), 0.0);
	}

	@Test
	public void testMultOneByTwo(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.mult(2);
		assertEquals("1*2 = 2", 2, sut.getState(), 0.0);
	}
	
	@Test
	public void testMultByInf(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.mult(Double.POSITIVE_INFINITY);
		assertEquals("1*infinity = infinity", Double.POSITIVE_INFINITY, sut.getState(), 0.0);
	}
	
	@Test
	public void testDivByTwo(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.div(2);
		assertEquals("1/2=0.5", 0.5, sut.getState(), 0.0);
	}
	
	@Test
	public void testDivByZero(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.div(0);
		assertEquals("1/0=0", Double.NaN, sut.getState(), 0.0);
	}
	
	@Test
	public void testSubByTwo(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.sub(2);
		assertEquals("1-2=-1", -1, sut.getState(), 0.0);
	}
	
	@Test
	public void testRecall(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.saveToMemory();
		sut.setState(2);
		double n = sut.recallMemory();
		assertEquals("memory=1", 1, n, 0.0);
	}
	
	@Test
	public void testAddMemory(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.saveToMemory();
		sut.setState(2);
		sut.addMemory();
		assertEquals("1+2=3", 3, sut.getState(), 0.0);
	}
	
	@Test
	public void testMultMemory(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.saveToMemory();
		sut.setState(2);
		sut.multMemory();
		assertEquals("1*2=2", 2, sut.getState(), 0.0);
	}
	
	@Test
	public void testSubMemory(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.saveToMemory();
		sut.setState(2);
		sut.subMemory();
		assertEquals("2-1=1", 1, sut.getState(), 0.0);
	}
	
	@Test
	public void testDivMemory(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.saveToMemory();
		sut.setState(2);
		sut.divMemory();
		assertEquals("2/1=2", 2, sut.getState(), 0.0);
	}
}