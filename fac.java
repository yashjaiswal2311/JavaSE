											//[PACKAGES]
//keyword : package

package com.dbase.faculty;
class fac
{
	public static void main(String[] args)
	{
		System.out.println("main method");
	}
}



/*
to compile package file use

[javac -d . fac.java]

to run
[java com.dbase.faculty.fac]


this will create a folder named com which contains a folder named dbase which will contain folder faculty
along with student which we have cretaed in previous code and if we want to crete one or more folder 
in student or faculty then we can write com.dbase.student.etc
or com.dbase.faculty.etc 
*/