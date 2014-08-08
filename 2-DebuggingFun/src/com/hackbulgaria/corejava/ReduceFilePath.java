package com.hackbulgaria.corejava;
import java.util.ArrayList;
import java.util.Arrays;


public class ReduceFilePath {

	public static void main(String[] args) {
		
		String path = "/srv/../";
		
		String result = reduce_file_path(path);
		System.out.println(result);
	}
	
	static String reduce_file_path (String path)
	{
		ArrayList<String> StringArray = new ArrayList<String>(Arrays.asList(path.split("[/]+")));
		
		if(!StringArray.isEmpty() && StringArray.get(0).isEmpty())
			StringArray.remove(0);
		
		int num = StringArray.size();
		int i = 0;
		
		while(i<num)
		{
			if(StringArray.get(i).equals("."))
			{
				StringArray.remove(i);
				num=num-1;
			}
			
			else if(StringArray.get(i).equals(".."))
			{
				StringArray.remove(i);
				if(i-1>=0)
				{
					StringArray.remove(i-1);
					num=num-2;
				}
				else
					num=num-1;
			}
			
			else
			{
				i++;
			}
		}
		
		
		StringBuilder result = new StringBuilder();
		
		for(int j=0; j<StringArray.size(); j++)
		{
			result.append("/");
			result.append(StringArray.get(j));
		}
		
		if(StringArray.isEmpty())
			result.append("/");
			
		return result.toString();
	}
}
