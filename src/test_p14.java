import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p14 {

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
				break;
			}
			case 2:
			{
				System.out.println("��J���Otwo");
				break;
			}
			default:
			{
				System.out.println("not one or two");
				break;
			}
		}
	}

}
