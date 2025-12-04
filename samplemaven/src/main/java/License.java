
public class License {

	public static void main(String[] args) throws LicenseException {
		{
			int age = 10;
			if (age>=18)
			{
			System.out.println("Eligible for driving license ");
			}
			else
			{
				throw new LicenseException("Age under 18!");
			}
			}
			}



	

}
