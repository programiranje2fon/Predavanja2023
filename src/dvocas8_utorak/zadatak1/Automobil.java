package dvocas8_utorak.zadatak1;

public class Automobil extends MotornoVozilo {

	@Override
	public double  izracunajRegistraciju() {
		double iznos = 6000 + getKubikaza() *8 + getSnaga()*2;
		return iznos;
	}

	@Override
	public String toString() {
		return "Automobil [getMarkaModel()=" + getMarkaModel() + ", getRegistracija()=" + getRegistracija()
				+ ", getSnaga()=" + getSnaga() + ", getKubikaza()=" + getKubikaza() + "]";
	}

	
	

}
