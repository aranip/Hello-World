package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		//array wil store similar data type values in a array variable
int i[] = new int[4];
i[0] =10;
i[1] =20;
i[2] =30;
i[3] =40;
System.out.println(i[2]);
//System.out.println(i[4]); //array index out of bound exception
System.out.println(i.length);
//print all the values of array : use for loop
for (int j = 0; j<i.length ;j++){
	System.out.println(i[j]);
}

//2. double array;
double d[] = new double[3];
d[0] = 12.33;
d[1] = 13.44;
d[2] = 14.55;
System.out.println(d[2]);

//3. char array
char c[] = new char[4];
c[0] = 'a';
c[1]= 'b';
c[2] = 'c';
c[3] = 'd';
System.out.println(c[3]);

//4.string array

String s[] =new String[3];
s[0]= "les";
s[1]="more";
s[2] = "andy";
System.out.println(s[1]);

//5.boolean array

boolean b[] = new boolean[2];
b[0] = true;
b[1] = false;
System.out.println(b[0]);

//advantage is i can store mulitple values in a single variable with similar data types
//disadvantage is 1. size is fixed ---static array---To overcome this we use colletions --arraylist or Hashtable --use dynamic array
//2. stores only similar data types--- To overcome this we use Object array  

//6. Object Array (object is a class)

Object ob[] = new Object[6];
ob[0] = "tom";
ob[1] = 25;
ob[2] = 12.33;
ob[3] = "1/1/1989";
ob[4]= 'M';
ob[5]= "london";

System.out.println(ob.length);
System.out.println(ob[4]);
	}

}
