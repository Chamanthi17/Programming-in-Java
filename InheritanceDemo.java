import java.io.*;
import java.util.Scanner;
public class InheritanceDemo{
public static void main(String args[]){
Person p1=new Person("XYZ",'M');
p1.eat();
p1.sleep();
Student stu1=new Student("Cham",'F',501,"vvit","cse");
stu1.learn();
stu1.play();
stu1.eat();
stu1.sleep();
}
}
class Person{
protected String personName;
protected char gender;
public Person(){
}
public Person(String personName,char gender){
super();
this.personName=personName;
this.gender=gender;
}
public void setPersonName(String personName){
this.personName=personName;
}
public void setGender(char gender){
this.gender=gender;
}
public String getPersonName(){
return personName;
}
public char getGender(){
return gender;
}
public void sleep(){
System.out.println(personName+" is sleeping");
}
public void eat(){
System.out.println(personName+" is eating");
}
}
class Student extends Person{
private int regdNo;
private String collegeName;
private String deptName;
public Student(){
}
public Student(int regdNo,String collegeName,String deptName){
super();
this.regdNo=regdNo;
this.collegeName=collegeName;
this.deptName=deptName;
}
public Student(String personName,char gender,int regdNo,String collegeName,String deptName){
super(personName,gender);
this.regdNo=regdNo;
this.collegeName=collegeName;
this.deptName=deptName;
}
public void setRegdNo(int regdNo){
this.regdNo=regdNo;
}
public void setCollegeName(String collegeName){
this.collegeName=collegeName;
}
public void setDeptName(String deptName){
this.deptName=deptName;
}
public int getRegdNo(){
return regdNo;
}
public String getCollegeName(){
return collegeName;
}
public String getDeptName(){
return deptName;
}
public void learn(){
System.out.println(personName+" is learning");
}
public void play(){
System.out.println(personName+" is playing");
}
}
