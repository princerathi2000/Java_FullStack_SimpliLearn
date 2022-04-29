package com.company.lockers;

import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class LockMe {
	static final String projectPath="C:\\Users\\dell\\eclipse-workspace\\CompanyLockersProject\\LockMeFile";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0;
		
		do
		{
			displayMenu();
			System.out.println("Enter your choice : ");
			Scanner scr=new Scanner(System.in);
			ch=Integer.parseInt(scr.nextLine());
			
			switch(ch)
			{
			case 1: getAllFiles();
					break;
			case 2 : createFile();
					break;
			case 3 : deleteFile();
					break;
			case 4:searchFile();
					break;
			case 5: System.exit(0);
					break;
			default : System.out.println("Choose a valid option");
							break;
		}
		}while(ch>0);
		
	}
	
	public static void displayMenu()
	{
		System.out.println("\n\n****************************************************************");
		System.out.println("\tWelcome To Company Locker - Lockme.com");
		System.out.println("\tDeveloper Name : ANSUL RATHI");
		System.out.println("****************************************************************");
		System.out.println("\t1. Diplay all the Fields");
		System.out.println("\t2. Add file to existing Directory");
		System.out.println("\t3. Delete a file");
		System.out.println("\t4. Search a file");
		System.out.println("\t5. Exit");
		System.out.println("****************************************************************");
	}
		
	public static void getAllFiles() 
	{
		File[] listOfFiles=new File(projectPath).listFiles();
		
		if(listOfFiles.length==0)
			System.out.println("File not Present");
		else
		{
			for(File l:listOfFiles)
				System.out.println(l.getName());
		}
	}
	
	public static void createFile()
	{
		try
		{
			Scanner obj=new Scanner(System.in);
			String fileName=null;
			int lineCount=0;
			System.out.println("Enter File Name : ");
			fileName=obj.nextLine();
			
			System.out.println("Enter how many lines you want to enter : ");
			lineCount=Integer.parseInt(obj.nextLine());
			
			FileWriter fw=new FileWriter(projectPath+"\\"+fileName);
			for(int i=1;i<=lineCount;i++)
			{
					System.out.println("Enter file content line ");
					fw.write(obj.nextLine()+"\n");
			}
			System.out.println("File Created Successfully");
			fw.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

			
	}
	
	public static void deleteFile()
	{
		Scanner sc=new Scanner(System.in);
		String fileName=null;
		System.out.println("Enter the file name you want to delete : ");
		fileName=sc.nextLine();
		
		File f1=new File(projectPath+"\\"+fileName);
		if(f1.exists())
		{
			f1.delete();
			System.out.println("File deleted successfully");
		}
		else
		{
			System.out.println("File not found");
		}
	}
	
	public static void searchFile()
	{
		try
		{
			LinkedList<String> fileNames=new LinkedList<String>();
			
			System.out.println("Enter the file name you want to search : ");
			String fileName=null;
			Scanner sc=new Scanner(System.in);
			fileName=sc.nextLine();
			
			File[] listOfFiles=new File(projectPath).listFiles();
			for(File l:listOfFiles)
			{
				fileNames.add(l.getName());
			}
			
			if(fileNames.contains(fileName))
			{
				System.out.println("File is available");
			}
			else
			{
				System.out.println("File is not available");
			}
		}
		catch(Exception ex)
		{
			System.out.println(""+ex);
		}
		
	}
	
	
	


}
