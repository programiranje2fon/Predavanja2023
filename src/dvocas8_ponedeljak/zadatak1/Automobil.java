package dvocas8_ponedeljak.zadatak1;

public class Automobil extends MotornoVozilo {

	@Override
	public double izracunajRegistraciju() {
		return 6000 + 8 * getKubikaza() + 2 * getSnaga();
	}

}
