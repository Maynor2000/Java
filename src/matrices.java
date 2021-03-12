
public class matrices {

	public static void main(String[] args) {
		// matriz unidimencional
		int[] my_primer=new int[2];
			my_primer[0]=1;
			my_primer[1]=2;
			
		//matriz bidimencional
		int[][] my_matriz= new int [2][2];
			my_matriz[0][0]=1; my_matriz[0][1]=3;
			my_matriz[1][0]=2; my_matriz[1][1]=4;
		
		//matiz tridimencional
		int [][][]tridime=new int[3][2][2];
			tridime[0][0][0]=1;  tridime[0][1][0]=3;  tridime[0][1][1]=5;
			tridime[1][0][0]=2;  tridime[1][1][0]=4;  tridime[1][1][1]=6;
				
		
		
		int[][] matis = new int[3][4];
		matis[0][0]=1; 
		matis[0][1]=2;
		matis[0][2]=3;
		matis[0][3]=4;
		 
		matis[1][0]=1;
		matis[1][1]=2;
		matis[1][2]=3;
		matis[1][3]=4;
		
		matis[2][0]=1;
		matis[2][1]=2;
		matis[2][2]=3;
		matis[2][3]=4;
	

		//System.out.println(matis.length);
		
		for(int i=0;i<matis.length;i++) {
			System.out.println();
			for(int j=0;j<3;j++) {
				System.out.print(matis[i][j]+" ");
				
			}
		}
	}

}
