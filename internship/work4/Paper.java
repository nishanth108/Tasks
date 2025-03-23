class Paper {
	
	public  void setPaperType(String type) {
		
		
		System.out.println("Selected Paper type:"+type);
		
		
	}
	
	
	public void setPaperSize(String size) {
		
		
		System.out.println("paper size is: "+size);
		
		
	}
	public void setPaperWeight(double weight) {
		
		System.out.println("The paper Weight is  ",weight);
		
	}
	
	public void writeOnPaper(String content, String inkColor) {
		
		
		System.out.println("The Content on the Paper ",content,"used Unk color",inkColor);
		
		
	}
	
	public void foldPaper(String foldType, int foldCount) {
		
		System.out.println("foldType :",foldType,"foldCount: ",foldCount);
		
	}
	
	public void createPaper(String type, String size, double weight){
		
		System.out.println("type:",type,"size : ",size,"weight:",weight);
		
	}
	
	public void printOnPaper(String content, String font, int fontSize){
		
		System.out.println(content,font,fontSize);
		
	}
	
	
	
}