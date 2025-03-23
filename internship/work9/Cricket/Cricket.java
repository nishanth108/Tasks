public class Criket {
	
	Ticket ticket;
	
	public Criket(Ticket ticket) {
		
			this.ticket = ticket;
		
	}
	
	public void  cricketType() {
		if(this.ticket!=null) {
			System.out.println("Seat Type");
            this.ticket.type();
		} else System.err.println("Pointing to null");
	}
	
	 public void watch(){
	 
		if(this.ticket!=null){
			
			 this.ticket.buy();
			System.out.println("Watching the match");
			
		
		} else System.err.println("Pointing to null");
		
	 
	 }
	
	
	
	
}