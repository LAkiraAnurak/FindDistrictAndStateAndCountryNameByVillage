package vasu;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class Search 
{
	public static String search() throws Exception
	{
		String ret="";
		Scanner sc=new Scanner(System.in);
		LinkedHashMap<String, LinkedHashMap<String,LinkedHashMap<String,ArrayList<String>>>> countries
		=CountryToVillage.getCountry(sc);
		System.out.print("Enter village you want to search : ");
		String vl=sc.nextLine();
		for(String country:countries.keySet())
		{
			for(String state:countries.get(country).keySet())
			{
				for(String district:countries.get(country).get(state).keySet())
				{
					for(String village:countries.get(country).get(state).get(district))
					{
						if(vl.toLowerCase().equals(village.toLowerCase()))
							ret+= "Village = "+village
									+"\n District "+district
									+"\n State "+state
									+"\n Country "+country+"\n";
					}
				}
			}
		}
		sc.close();
		if(ret.equals("")) return "Not found";
		else return ret;
	}
	public static void main(String[] args) 
	{
		String result="";
		try
		{
			result=search();
			System.out.println(result);
		}
		catch(Exception ex)
		{
			System.out.println("Please enter valid input\n");
			main(args);			
		}
	}
}
