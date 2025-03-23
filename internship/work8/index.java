class index {
	
	int value;
	
	index(int val) {
		this();
		this.value = val;
		System.out.println("The Value is ="+value);

	}
	
	index() {
		System.out.println("In no parameter constructer");
	}
	
	void setValue(int value) {
		this.value = value;
		System.out.println("The Value is ="+value);
	}
	
}