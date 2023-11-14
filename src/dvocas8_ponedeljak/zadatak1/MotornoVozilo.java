package dvocas8_ponedeljak.zadatak1;

import java.util.Objects;

public abstract class MotornoVozilo {
	
	private String markaModel;
	
	private String registracija;
	
	private int snaga;
	
	private int kubikaza;

	public String getMarkaModel() {
		return markaModel;
	}

	public void setMarkaModel(String markaModel) {
		this.markaModel = markaModel;
	}

	public String getRegistracija() {
		return registracija;
	}

	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}

	public int getSnaga() {
		return snaga;
	}

	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}

	public int getKubikaza() {
		return kubikaza;
	}

	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}

	@Override
	public String toString() {
		return "MotornoVozilo [markaModel=" + markaModel + ", registracija=" + registracija + ", snaga=" + snaga
				+ ", kubikaza=" + kubikaza + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(registracija);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MotornoVozilo other = (MotornoVozilo) obj;
		return Objects.equals(registracija, other.registracija);
	}
	
	public abstract double izracunajRegistraciju();

}
