
/**
* A class to run tests on the Circuit class and subclasses
* @author Horstman
* @version 02/06/2014
*
*/
import java.util.ArrayList;
public class CircuitDemo
{ 	/**
	method that implements tests for Circuit class and subclasses
	@param args - Not Used.
 	*/
	public static void main(String[] args)
	{
		Circuit circuit1 = new Resistor(100);
		Circuit circuit2 = new Resistor(100);
		Circuit circuit3 = new Resistor(200);
		
		ArrayList<Circuit> parallelCircuits = new ArrayList<Circuit>();
			parallelCircuits.add(circuit1);
			parallelCircuits.add(circuit2);
			
		Circuit parallel = new Parallel(parallelCircuits);
		
		ArrayList<Circuit> serialCircuits = new ArrayList<Circuit>();
			serialCircuits.add(parallel);
			serialCircuits.add(circuit3);
		
		Circuit serial = new Serial(serialCircuits);
		System.out.println("Combined resistance: " + serial.getResistance());
		System.out.println("Expected: 75.0");
	}
}
