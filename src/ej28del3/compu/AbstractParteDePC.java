package ej28del3.compu;

public abstract class AbstractParteDePC {
	boolean turnedOn;
	
	public boolean isTurnedOn() {
		return turnedOn;
	}

	public void setTurnedOn(boolean turnedOn) {
		this.turnedOn = turnedOn;
	}

	public void encender() {
		System.out.println(this.getClass().getName() + " encendida");
		setTurnedOn(true);
	}
	
	//public abstract void ejemploAbstractMethod();
}
