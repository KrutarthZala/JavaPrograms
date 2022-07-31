import java.util.*;

class Candidate
{
	int Candidate_ID;
	String Candidate_Name;
	short Candidate_Age;
	float Candidate_Weight,Candidate_Height;

	public void GetCandidateDetails()
	{
		Scanner kz = new Scanner(System.in);
		Scanner str = new Scanner(System.in);
		
		System.out.print("Enter Candidate id : ");
		Candidate_ID = kz.nextInt();
		System.out.print("Enter Candidate name : ");
		Candidate_Name = str.nextLine();
		System.out.print("Enter Candidate age : ");
		Candidate_Age = kz.nextShort();
		System.out.print("Enter Candidate weight : ");
		Candidate_Weight = kz.nextFloat();
		System.out.print("Enter Candidate height : ");
		Candidate_Height = kz.nextFloat();
	}

	public void DisplayCandidateDetails()
	{
		System.out.println("Candidate id : "+Candidate_ID);
		
		System.out.println("Candidate name : "+Candidate_Name);
	
		System.out.println("Candidate age : "+Candidate_Age);
		
		System.out.println("Candidate weight : "+Candidate_Weight);
		
		System.out.println("Candidate height : "+Candidate_Height);
		
	}
}

class ClassObj1
{
	public static void main(String[] args) {
		
		System.out.print("Enter below details of candidate.\n");

		Candidate detail = new Candidate();

		detail.GetCandidateDetails();

		System.out.print("Candidate details are shown below.\n");

		detail.DisplayCandidateDetails();


	}
}