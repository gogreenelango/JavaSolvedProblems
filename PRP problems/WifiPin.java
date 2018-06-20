import java.util.Scanner;
class WifiPin{
public static void password(int roomNumber,String lastName){
if(roomNumber>99&&roomNumber<1000){
int fn=roomNumber/100;
int a=roomNumber%100;
int mn=a/10;
int ln=roomNumber%10;
int total=fn+mn+ln;

int x=total%10;
int y=total/10;
int z=x+y;
if(z%2!=0){ total=total-1;}

char[] val={')','!','@','#','$','%','^','&','*','('};
String lastChar=lastName.substring(lastName.length()-1);
System.out.println(z+""+val[ln]+lastChar+mn);
}
else{
System.out.println("Invalid number");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Room number: ");
int roomNumber=sc.nextInt();
System.out.println("Enter the user lastName: ");
String lastName=sc.next();
WifiPin wp=new WifiPin();
wp.password(roomNumber,lastName);
}}
