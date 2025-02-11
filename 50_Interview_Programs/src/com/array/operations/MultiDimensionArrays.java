package com.array.operations;

@SuppressWarnings("unused")
public class MultiDimensionArrays 
{
	public static void main(String[] args) 
	{
        //2D Arrays
		int[][] twoDArray1;
		 
		int twoDArray2[][];
		 
		int[] twoDArray3[];
		 
		//3D Arrays
		int[][][] threeDArray1;
		 
		int threeDArray2[][][];
		 
		int[] threeDArray3[][];
		 
		int[][] threeDArray4[];
		 
		//4D Arrays
		int[][][][] fourDArray1;
		 
		int fourDArray2[][][][];
		 
		int[] fourDArray3[][][];
		 
		int[][] fourDArray4[][];
		 
		int[][][] fourDArray5[];
		
		//can you specify an array dimension after an empty dimension? 
		//A: No
		//int[][][] a = new int[][5][];    //Compile time error
		 
		//int[][][] b = new int[5][][5];   //Compile time error
		 
		//int[][][] c = new int[][5][5];   //Compile time error
		
		int[][][] d = new int[5][][];    //No Error
	}//main
}//class