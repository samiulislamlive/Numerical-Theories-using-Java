
package numerical;

public class NaiveGELIM {
    static int m = 10;
	static int i, j, n, k;
	static double sum, mult;
	
	static double matA[][] = new double[][]{{15, -2, -6, 0},
		{-2, 12, -4, -1}, {-6, -4, 19, -9}, {0, -1, -9, 21}};
	static double matB[] = new double[]{300, 0, 0, 0};
	static double matx[] = new double [m + 1];
	
	public static void testNGE()
	{
		n = 3;
		NaiveGaussElim(n, matA, matB, matx);
		
		System.out.println("The value of n is: " + n);
		System.out.println(" ");
		
		for(i = 0; i < 4; i++)
		{
			System.out.println("The value of x" + i + " is: " + matx[i]);
		}
	}
	
	public static void NaiveGaussElim(int n, double matA[][], double matB[], double matx[])
	{
		for(k = 0; k <= n; k++)
		{
			for(i = k + 1; i <= n; i = i + k + 1)
			{
				mult = matA[i][k]/matA[k][k];
				matA[i][k] = mult;
				for(j = k + 1; j <= n; j = j + k + 1)
				{
					matA[i][j] = matA[i][j] - (mult) * matA[k][j];
				}
				matB[i] = matB[i] - (mult) * matB[k];
			}
		}
		matx[n] = matB[n]/matA[n][n];
		for(i = n - 1; i >= 0; i--)
		{
			sum = matB[i];
			for(j = i + 1; j <= n; j = j + i + 1)
			{
				sum = sum - matA[i][j] * matx[j];
			}
			matx[i] = sum/matA[i][i];
		}
    
    
}
}

