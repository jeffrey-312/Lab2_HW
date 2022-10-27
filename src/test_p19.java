import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class test_p19 {
	public static void main(String[] args)throws IOException {
		System.out.println("請問你是男生嗎？");
		System.out.println("請輸入Y or N");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char letter=str.charAt(0);
		
		if(letter=='y'||letter=='Y') {
			System.out.println("you are a man");
		}
		else if(letter=='n'||letter=='N') {
			System.out.println("you are a girl");
		}
		else {
			System.out.println("please input Y or N");
		}
	}

}
