package dvocas8_ponedeljak.zadatak1;

public class Motocikl extends MotornoVozilo {

	@Override
	public double izracunajRegistraciju() {
		return 4000 + 4 * getKubikaza() + 2 * getSnaga();
	}

}
