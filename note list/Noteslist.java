import java.text.BreakIterator;
import java.time.temporal.TemporalAmount;
import java.util.Scanner;
public class Noteslist {

    public static void main(String[] args) {                                                                                                                          Scanner scan=new Scanner(System.in);
int persons=0,age=0,notes=0;
String name;
System.out.println("Enter how many students are in the class: ");
persons=scan.nextInt();
for( int i=1;i<=persons;i++){ 
System.out.println("Enter the student's name: ");
name=scan.next();
System.out.println("Enter the student's age: ");
age=scan.nextInt();
System.out.println("Enter the student's notes: ");
notes=scan.nextInt();
if((notes>100)|| (notes<0)){
    System.out.println("You entered the wrong grade ");
}else {
    System.out.println("NAME:"+name+ "  /  "+" AGE:"+age+ "  /  "+" NOTES:"+notes);
}

 }

}
}