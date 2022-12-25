package formulas;

public class Formulas {
////velocity formula
	static double velocity(double dist, double time) {
		return (dist / time);

	}

	static double time(double velocity, double dist) {
		return (dist / velocity);

	}

	static double distance(double velocity, double time) {
		return (velocity * time);

	}

}
