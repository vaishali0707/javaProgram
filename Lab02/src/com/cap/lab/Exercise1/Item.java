package com.cap.lab.Exercise1;

public abstract class Item
{
	private int uid;
	private String name;
	private int noOfCopies;
	
	public Item(int uid,String name,int noOfCopies)
	{
		this.uid=uid;
		this.name=name;
		this.noOfCopies=noOfCopies;
	}
	public String toString()
	{
		return "Book Unique identification Number is "+uid+"Book name is "+name+"No. of copies "
				+ "available are "+noOfCopies;
	}
}
class WrittenItem extends Item
{
	private String author;
	
	public String toString()
	{
		return "WrittenItem [author=" + author + "]";
	}
	
	public WrittenItem(int uid, String name, int noOfCopies, String author) 
	{
		super(uid, name, noOfCopies);
		this.author = author;
	}
	void setAuthor(String author)
	{
		this.author=author;
	}
	String getAuthor()
	{
		return author;
	}
}
class Books extends WrittenItem
{
	public Books(int uid, String name, int noOfCopies, String author)
	{
		super(uid, name, noOfCopies, author);
	}	
}
class JournalPaper extends WrittenItem
{
	
	public JournalPaper(int uid, String name, int noOfCopies, String author)
	{
		super(uid, name, noOfCopies, author);	
	}

	private int yearOfPublishing;

	public String toString() 
	{
		return "JournalPaper [yearOfPublishing=" + yearOfPublishing + "]";	
	}

	public int getYearOfPublishing() 
	{
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing)
	{
		this.yearOfPublishing = yearOfPublishing;
	}
		
}
class MediaItem extends Item
{
	public MediaItem(int uid, String name, int noOfCopies) 
	{
		super(uid, name, noOfCopies);
	}
	private int runTime;
	public int getRunTime() 
	{
		return runTime;
	}
	public void setRunTime(int runTime)
	{
		this.runTime = runTime;
	}
}
class CD extends MediaItem
{
	public CD(int uid, String name, int noOfCopies) 
	{
		super(uid, name, noOfCopies);
	}
}
class Video extends MediaItem
{
	public Video(int uid, String name, int noOfCopies) 
	{
		super(uid, name, noOfCopies);
	}
	private int yearReleased;
	public int getYearReleased()
	{
		return yearReleased;
	}
	public void setYearReleased(int yearReleased)
	{
		this.yearReleased = yearReleased;
	}
	private String genre;
	public String getGenre()
	{
		return genre;
	}
	public void setGenre(String genre) 
	{
		this.genre = genre;
	}
	private String director;
	public String getDirector()
	{
		return director;
	}
	public void setDirector(String director) 
	{
		this.director = director;
	}
}
class Library
{
	public static void main(String[] args) {
	Video v=new Video(112,"abc",2);
	System.out.println(v);
	WrittenItem w=new WrittenItem(123,"NoOne",3,"Ashish Singh");
	System.out.println(w);
	}
	
}


