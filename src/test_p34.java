
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p34 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("請問要在第幾次結束迴圈?(1~10)");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		int res = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=10;i++) {
			if(i==res) continue;
			System.out.println("第"+i+"次處理");
			
		}
	}

}
