package vasu;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountryToVillage 
{
	public static LinkedHashMap<String, LinkedHashMap<String,LinkedHashMap<String,ArrayList<String>>>> getCountry(Scanner sc) 
	{
		LinkedHashMap<String, LinkedHashMap<String,LinkedHashMap<String,ArrayList<String>>>>
			countries=new LinkedHashMap<>();
		System.out.print("No.of countries you want to enter : ");
		int ct_n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<ct_n;i++)
		{
			System.out.print("Enter Country "+(i+1)+" name : ");
			String country=sc.nextLine();
			System.out.print("Enter how many states you want to enter : ");
			int st_n=Integer.parseInt(sc.nextLine());
			LinkedHashMap<String,LinkedHashMap<String,ArrayList<String>>> states=
					new LinkedHashMap<>();
			for(int j=0;j<st_n;j++)
			{
				System.out.print("Enter State "+(j+1)+" name : ");
				String state=sc.nextLine();
				System.out.print("Enter how many Districts you want to enter : ");
				int dt_n=Integer.parseInt(sc.nextLine());
				LinkedHashMap<String,ArrayList<String>> districts=new LinkedHashMap<>();
				for(int k=0;k<dt_n;k++)
				{
					System.out.print("Enter district "+(k+1)+" name : ");
					String district=sc.nextLine();
					System.out.print("Enter how many Villages you want to enter : ");
					int vl_n=Integer.parseInt(sc.nextLine());
					ArrayList<String> villages=new ArrayList<>();
					for(int l=0;l<vl_n;l++)
					{
						System.out.print("Enter village "+(l+1)+" name : ");
						String village=sc.nextLine();
						villages.add(village);
					}
					districts.put(district, villages);
				}
				states.put(state, districts);
			}
			countries.put(country, states);
		}
		//sc.close();
		return countries;
	}
}
