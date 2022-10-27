import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
public class test_p47 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("please input five numbers");
		Integer test[]=new Integer[5];
		
		for(int i=0;i<test.length;i++) {
			String str=br.readLine();
			test[i]=Integer.parseInt(str);
		}
		Arrays.sort(test,Collections.reverseOrder());
		
		for(int i=0;i<test.length;i++) {
			System.out.println("第"+(i+1)+"名的分數:"+test[i]);
		}
	}

}
