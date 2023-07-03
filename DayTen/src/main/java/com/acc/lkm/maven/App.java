package com.acc.lkm.maven;
import java.util.Arrays;
import java.util.List;
import java.util.List;


  public class App {
	  public static void main(String[] args) {
		  List<String> strings = Arrays.asList("Python", "Java", "ASP.NET", "Salesforce", "Generative AI");
		  strings.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
		  System.out.println(strings); 
		  }
	  }