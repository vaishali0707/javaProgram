package com.cap.lab.Exercise2;
import java.util.*;
import java.io.*;
public class ReadFile
{
    public static void main(String args[])throws IOException
    {
    int j=1;
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter the file name");
    String s=sc.next();
    FileInputStream fis=new FileInputStream(s);
    System.out.println("\nContents are ");
    int n= fis.available();
    System.out.println(j+" : ");
    for(int i=0;i<n;i++)
    {
        ch=fis.read();
        System.out.println(ch);
        if(ch=='\n')
        {
            System.out.println(++j + ":");
        }
    }
}
}

