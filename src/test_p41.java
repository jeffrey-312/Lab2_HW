
public class test_p41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test;
		test=new int[5];
		
		test[0]=69;
		test[1]=42;
		test[2]=44;
		test[3]=89;
		test[4]=77;
		
		test[10]=45;
		
		for(int i=0;i<5;i++) {
			System.out.println("第"+(i+1)+"個人的分數是"+test[i]+"分");
		}
	}

}
