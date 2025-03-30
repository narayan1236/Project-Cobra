import java.io.*;

class acehack
{

public static void main(String args[])throws Exception
{
String name,phno,desc,time;
int age,phlen,pdlen;

DataInputStream in=new DataInputStream(System.in);
acehack obj=new acehack();
int i;
System.out.println("WELCOME TO OUR SYSTEM");
System.out.println("THIS IS PROJECT COBRA MADE BY TEAM LAZY STUDENTS");
System.out.println("");
System.out.println("");
System.out.println("OUR MOTIVE IS TO REDUCE THE NUMBER OF DEATHS DUE TO SNAKEBITE");
System.out.println("");
System.out.println("NOTE-->>>A HUMAN BEING HAS APPROXIMATELY 45 MINUTES TO GET ANTIVENOM AFTER GETING BITE FROM A VENOUSMOUS SNAKE LIKE KING COBRA, RUSSEL VIPER, KRAIT AND MORE DANGEROUS SNAKES");
System.out.println("");
System.out.println("OUR SYSTEM WILL HELP VICTIMS TO REACH FAST TO THE HOSPITAL WHERE ANTIVENOM IS AVAILABLE");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("PLEASE ENTER THE DETAILS");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("ENTER VICTIMS NAME");
name=in.readLine();

for(i=0;i<=5;i++)
	System.out.println("");


System.out.println("PLEASE ENTER VICTIM's AGE");
age=Integer.parseInt(in.readLine());
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("ENTER YOUR PHONE NUMBER");
phno=in.readLine();
phlen=phno.length();

System.out.println("");
if(phlen==10)
{
System.out.println("VALID PHONE NUMBER");
}
else
{
System.out.println("INVALID PHONE NUMBER");
System.out.println("ENTER A VALID NUMBER AGAIN");
System.out.println("");
System.out.println("YOU HAVE 2 ATTEMPTS LEFT TO ENTER A VALID NUMBER");
System.out.println("OTHERWISE OUR SYSTEM WILL EXIT");
System.out.println("ENTER YOUR PHONE NUMBER(2nd ATTEMPT)");
phno=in.readLine();
phlen=phno.length();
if(phlen==10)
{
System.out.println("VALID PHONE NUMBER");
}
else
{
System.out.println("INVALID PHONE NUMBER");
System.out.println("ENTER A VALID NUMBER AGAIN");
System.out.println("");
System.out.println("YOU HAVE 1 ATTEMPTS LEFT TO ENTER A VALID NUMBER");
System.out.println("OTHERWISE OUR SYSTEM WILL EXIT");
System.out.println("ENTER YOUR PHONE NUMBER(LAST ATTEMPT)");
phno=in.readLine();
phlen=phno.length();
if(phlen==10)
{
System.out.println("VALID PHONE NUMBER");
}
else
{
System.out.println("INVALID PHONE NUMBER");
System.out.println("ALL YOUR ATTEMPTS ARE OVER NOW");
System.out.println("GOODBYE USER!!");
System.out.println("WILL MEET YOU SOON");
System.exit(0);
}
}
}

for(i=0;i<=5;i++)
	System.out.println("");

System.out.println("PLEASE DESCRIBE WHICH SNAKE DETAILS IF YOU KNOW");
desc=in.readLine();

System.out.println("PLEASE TELL THE TIME OF SNAKEBITE");
time=in.readLine();

System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("HERE ARE SOME PRECAUTIONS PLEASE FOLLOW THEM");
System.out.println("1:");
System.out.println("2:");
System.out.println("3:");
System.out.println("4:");
System.out.println("5:");

System.out.println("WE ARE CHECHKING WHERE ANTIVENOM IS AVAILABLE");
System.out.println("WE WILL LET YOU KNOW SOON");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THIS IS PROTOTYPE OF OUR PROJECT");
System.out.println("AND THIS PROJECT IS NOT COLLABORATED WITH HOSPITALS TILL NOW");
System.out.println("IF IN FUTURE THIS FUTURE COLLABORATED WITH HOSPITALS THEN WE WILL ADD OPTIONS AS REQUIRED");

}

}


