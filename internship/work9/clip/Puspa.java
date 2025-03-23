class Puspa {
	
	Clip[] clip;
	
	void useClip() {
		
		for(Clip ref : clip)
		if(ref!=null ) {
			ref.displayColor();
			ref.hold();
		}
		else {
			System.out.println("Pointing to null");
		}
	}
	
}