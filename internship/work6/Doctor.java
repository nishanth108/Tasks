class Doctor
{
	public static void treatment(String patientname,int age)
	{
	 System.out.println("Name:"+patientname+" Age: "+age);
	 Nurse.assit(patientname);
	}
}