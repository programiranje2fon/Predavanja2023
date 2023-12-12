package dvocas8_utorak.zadatak1;

public class Motocikl extends MotornoVozilo {

	@Override
	public double izracunajRegistraciju() {
		double iznos = 4000 + getKubikaza() * 4 + getSnaga() *2;
		return iznos;
	}

	@Override
	public String toString() {
		return "Motocikl [getMarkaModel()=" + getMarkaModel() + ", getRegistracija()=" + getRegistracija()
				+ ", getSnaga()=" + getSnaga() + ", getKubikaza()=" + getKubikaza() + "]";
	}
	
	
	

}
