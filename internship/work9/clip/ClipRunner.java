
public class ClipRunner {

public static void main(String[] args) {
	
	Clip clip1 = new Clip();
	clip1.color="blue";
	Clip clip2 = new Clip();
	clip1.color="grey";
	Clip clip3 = new Clip();
	clip1.color="yellow";
	Clip clip4 = new Clip();
	clip1.color="white";
	Clip clip5 = new Clip();
	clip1.color="purple";
	
	Clip[] clips={clip1,clip2,clip3,clip4,clip5};
	
	Puspa puspa=new Puspa();
	
	puspa.clip = clips;
	puspa.useClip();
}
}