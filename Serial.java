import java.util.ArrayList;

public class Serial extends Circuit{
	private ArrayList<Circuit> circuits;
	
	public Serial (ArrayList<Circuit> circuits) {
		this.circuits = circuits;
	}
	public double getResistance() {
		double totalResistance = 0;
		for (Circuit circuit : circuits) {
			totalResistance += circuit.getResistance();
		}
		return totalResistance;
	}
}
