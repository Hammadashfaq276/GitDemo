package Dropdown;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class List_Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Getnames();
		//StreamFilter();
		//StreamMap();
		StreamCollect();
	}
	public static void StreamFilter()
	{ 
		ArrayList<String> names =new ArrayList<String>();
		names.add("Ali");
		names.add("Raza");
		names.add("Ahmed");
		names.add("Arooj");
		names.add("Fatima");
		long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		long d=Stream.of("Ali","Fatima","Arooj","Saiqa","Ahsan").filter(s->{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
	
	public static void StreamMap()
	{
	    ArrayList<String> names =new ArrayList<String>();
	    names.add("man");
	    names.add("don");
	    names.add("women");
	    Stream.of("Ali","Fatima","Arooj","Saiqa","Ahsan").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	    List<String> names1 = Arrays.asList("Ali","Fatima","Arooj","Saiqa","Ahsan");
	    names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	    Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
	    boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Arooj"));
	    System.out.println(flag);
	    Assert.assertTrue(flag);
	}
	
	public static void StreamCollect()
	{ 
	    List<String> ls= Stream.of("Ali","Fatima","Arooj","Saiqa","Ahsan").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
	    System.out.println(ls.get(0));
	    List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
	    values.stream().distinct().forEach(s->System.out.println(s));
	    List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
	    System.out.println(li.get(2));
	}
     
	public static void Getnames()
	{
		ArrayList<String> names =new ArrayList<String>();
		names.add("Ali");
		names.add("Raza");
		names.add("Ahmed");
		names.add("Sidra");
		names.add("Fatima");
		int count=0;
		for(int i=0;i<names.size();i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
