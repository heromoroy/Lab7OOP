package LR_7;

import java.util.Scanner;

public class Builders {
	private String[] nameBuilding;
	private String[] vozBuildings;
	
	public Builders()
	{
		Scanner in = new Scanner(System.in);
		Scanner in1 = new Scanner(System.in);

		System.out.print("������� ����� ������� �� �������������:\n");	
		nameBuildings(in.nextLine());
		System.out.print("������� ����� �����:\n");
		vozBuildings(in1.nextLine());
	}
	
	public void nameBuildings(String building)
	{
		nameBuilding=building.split("\\s");
	}
	public void vozBuildings(String building)
	{
		vozBuildings = building.split("\\s");
	}
	public String GetnameBuilding()
	{
		String name = "";
		for(int i = 0; i < nameBuilding.length; i++) { 
	         name = nameBuilding[i]+ " " + vozBuildings[i] + " ������ ";
	      }
		return name; 
	}

}
