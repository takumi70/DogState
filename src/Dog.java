class Dog {

	private DogState mystate;

	public Dog() {
		mystate =TanoshiiState.getInstance();
	}

	public void roudou() {
		mystate.tukareta(this);
	}

	public void shokuji() {
		mystate.tabeta(this);
	}

	public void changeState(DogState d) {
		mystate = d;
	}

	public void print() {
		System.out.print("現在、わたしは「");
		System.out.print(mystate.toString());
		System.out.println("」です。");
	}

}
