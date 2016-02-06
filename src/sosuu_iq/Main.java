package sosuu_iq;

import java.io.*;
class Main {
    public static void main(String args[])
    throws java.io.IOException {    // 入出力エラーがありうる
        //String c;    
    	int SosuuCount=0;
    	// 変数 c を作る
    	int c = 0;
        while ((c = System.in.read()) != -1)  // キー入力を c に
            System.out.println((char)c);  
    }
}
        //System.out.println(()49);// c を出力
    

		/*BufferedReader c = new BufferedReader(new InputStreamReader(System.in));
		// System.out.print("Input name:");
		String contents = c.readLine();
		c.close();

		//while ((contents = c2.readLine()) != null) { // while loop begins here
		
		// コンソールにて素数を入力
		BufferedReader c2 = new BufferedReader(new InputStreamReader(System.in));
		// System.out.print("Input name:");
		String contents = c2.readLine();
		c2.close();

		
	int i, n;
		
		int c1 = Integer.parseInt(contents);
		
		//素数計算
		for (n = 2; n <= c1; n++) {
			for (i = 2; i < n; i++) {
				if (n % i == 0)
					break;
			}
			if (n == i) {
				//素数を確認
				//System.out.println(n);
				SosuuCount++;
				
			}
		}
		System.out.println(SosuuCount);
	}
//	        System.out.println(SosuuCount);
	
//    }

}
*/