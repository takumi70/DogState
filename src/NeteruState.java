
class NeteruState extends DogState{

	private static NeteruState s = new NeteruState();

	private NeteruState() {}

	public static DogState getInstance() {
		return s;
	}

	public void okita(Dog moto) {
		moto.changeState(IrairaState.getInstance());
	}

	public void tukareta(Dog moto) {

	}

	public void tabeta(Dog moto) {

	}

	public String toString() {
		return "寝てる状態";
	}

}
