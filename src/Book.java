/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pranit Bankar
 */
public class Book {
    String Name;
    String Author;
    String Publisher;
    String PublicationYear;
    int Position;
    Book() 
    {
        Name=null;
        Author=null;
        Publisher=null;
        PublicationYear=null;
        Position=-1;
    }
    
    Book(String A,String B,String C,String D,int E)
    {
        Name=A;
        Author=B;
        Publisher=C;
        PublicationYear=D;
        Position=E;
    }
}