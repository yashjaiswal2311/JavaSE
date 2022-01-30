											//[PACKAGES]
//keyword : package

package com.dbase.student;
class stu
{
	public static void main(String[] args)
	{
		System.out.println("main method");
	}
}



/*
to compile package file use

[javac -d . stu.java]

to run
[java com.dbase.student.stu]


this will create a folder named com which contains a folder named dbase which will contain folder student
and if we want to crete one or more folder in student then we can write com.dbase.student.etc 
*/