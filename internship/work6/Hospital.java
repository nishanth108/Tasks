class Hospital
{
    public static void checkup(String patientname,int age,String mobile,String email,String sickness)
    {
        System.out.println("Checking up " + patientname + " Age: " + age + ", Mobile: " + mobile + ", Email: " + email + ", Sickness: " + sickness + ".");
        Doctor.treatment(patientname, age);
    }
}