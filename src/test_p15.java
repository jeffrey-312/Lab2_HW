import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p15 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�п�J���");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		switch(num){
			case 1:
			{
				System.out.println("��J���Oone");
			}
			case 2:
			{
				System.out.println("��J���Otwo");
			}
			default:
			{
				System.out.println("not one or two");
			}
		}
	}

}