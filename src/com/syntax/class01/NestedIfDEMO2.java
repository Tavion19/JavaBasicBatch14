package com.syntax.class01;

public class NestedIfDEMO2 {

	public static void main(String[] args) {
		
		
		boolean studyHard = true;
		
		if(studyHard) 
		{
			System.out.println("we get the job in first few weeks");
			
			boolean goodCommunicationSkills=true;
			
			if(goodCommunicationSkills)
			{
				System.out.println(" can might get job in Apple Amazon, etc. ");
			}
			else
			{
				System.out.println(" we need to work on our communications skills");
			}
		}
		else
		{
			System.out.println("it might take a little longer to get the job");
		}
	}

}
