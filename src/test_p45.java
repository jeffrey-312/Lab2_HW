import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class test_p45 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("input five numbers");
		int test[]=new int[5];
		
		for(int i=0;i<test.length;i++) {
			String str=br.readLine();
			test[i]=Integer.parseInt(str);
		}
		for(int j=0;j<test.length-1;j++) {
			for(int s=j+1;s<test.length;s++) {
				if(test[s]>test[j]) {
					int temp;
					temp=test[j];
					test[j]=test[s];
					test[s]=temp;
				}
			}
		}
		for(int i=0;i<test.length;i++) {
			System.out.println("第"+(i+1)+"名的分數:"+test[i]);
		}
		
	}

}
