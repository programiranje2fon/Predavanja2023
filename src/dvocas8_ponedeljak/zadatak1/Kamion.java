package dvocas8_ponedeljak.zadatak1;

public class Kamion extends MotornoVozilo {

	@Override
	public double izracunajRegistraciju() {
		return 20000 + getSnaga() * 3;
	}

}
