import java.util.ArrayList;
public class Parallel extends Circuit {
	private ArrayList<Circuit> circuits;
	
	public Parallel(ArrayList<Circuit> circuits) {
		this.circuits = circuits;
	}
	public double getResistance() {
		double totalResistance = 0;
		for (Circuit circuit : circuits) {
			totalResistance += 1 / circuit.getResistance();
		}
		return 1 / totalResistance;
	}
}
