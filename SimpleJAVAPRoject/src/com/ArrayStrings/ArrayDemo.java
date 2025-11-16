package com.ArrayStrings;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// <Data type> Arrayname[] = new datatype[Size]

		int Arraint1[] = new int[6];// create an array

		// 0 1 2 3 4
		int Arraint2[] = { 1, 2, 3, 4, 5 };

		// insert the values in array
		Arraint1[0] = 11;
		Arraint1[1] = 12;
		Arraint1[2] = 13;
		Arraint1[3] = 14;
		Arraint1[4] = 15;

		System.out.println(Arraint1[2]);
		System.out.println(Arraint2[2]);

		System.out.println("Size of an array:  " + Arraint1.length);

		// maximum---> Size-1

//		for (int i = 0; i < Arraint1.length; i++) {
//
//			System.out.println(Arraint1[i]);
//
//		}

		// C

		// 0 1 2

		// 1 2 3 ---->0 -----------R
		// 4 5 6 ---->1
		// 8 9 10 ---- 2

		// [0][0] =1
		// [0][1] =2
		// [0][2] =3

		// [1][0] =4
		// [1][1] =5
		// [1][2] =6

		// [2][0] =8
		// [2][1] =9
		// [2][2] =10

		int multidemtional1[][] = new int[3][3];

		multidemtional1[0][0] = 1;
		multidemtional1[0][1] = 2;
		multidemtional1[0][2] = 3;

		multidemtional1[1][0] = 4;
		multidemtional1[1][1] = 5;
		multidemtional1[1][2] = 6;

		multidemtional1[2][0] = 8;
		multidemtional1[2][1] = 9;
		multidemtional1[2][2] = 10;
		
		
		
		// jagged array
		
		
		 //   1  2   3
		//    3  4
		//    1  6  7   8  9
		//    5  6  7              0           1          2               3
		
		int jaggedarray[][] = { { 1, 2, 3 }, { 3,4}, { 1 , 6, 7,8,9}, { 5 , 6, 7} };
		
		
		
		
			for (int i = 0; i < jaggedarray.length; i++) {

			for (int j = 0; j < jaggedarray[i].length; j++) {

				System.out.println(jaggedarray[i][j]);

			}

		}

	

		int multidemtional2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 8, 9, 10 } };

	}
	
	
	// copy an array1 to another array2
	
	// array1 ------>array2----copy
	
	
	
	
	
	
	

}
