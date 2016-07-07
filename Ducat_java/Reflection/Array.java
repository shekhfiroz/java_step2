import java.util.Scanner;
public class Array {
int no;
String name[no];
//System.out.println();

public static void main(String... s) {
Array obj=new Array();
String name[]=new String[no];
Scanner input=new Scanner(System.in);
System.out.println("how many students");
obj.no=input.nextInt();
System.out.println(obj.no);

System.out.println("lists of students");
for(int i=0; i<obj.no; i++){
obj.name[i]=input.next();
}

System.out.println("...................");
for(int i=0; i<obj.no;i++){
System.out.println(obj.name[i]);
}
}
}



import java.util.Scanner;

public class Array {
int no;
String name[];

public static void main(String[] args) {
Array obj=new Array();
Scanner input=new Scanner(System.in);
System.out.println("how many students");
obj.no=input.nextInt();
System.out.println(obj.no);

obj.name[]=new String[obj.no];

System.out.println("lists of students");
for(int i=0; i<obj.no; i++){
obj.name[i]=input.next();
}
System.out.println("...................");
for(int i=0; i<obj.no;i++){
System.out.println(obj.name[i]);
}

}
Like · Reply · 1 · June 10 at 7:00pm