/**
 * Copyright 2015-2016 Debmalya Jash
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package hr;

import java.util.Scanner;

/**
 * @author debmalyajash
 *
 */
public class AppleNOrange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)){
			int s = in.nextInt();
			int t = in.nextInt();
			
			int a = in.nextInt();
			int b = in.nextInt();
			
			int m = in.nextInt();
			int n = in.nextInt();
			
			int[] appleFalls = new int[m];
			int[] orangeFalls = new int[n];
			int count = 0;
			for (int i = 0; i < m; i++){
				appleFalls[i] = a + in.nextInt();
				if (appleFalls[i] >= s && appleFalls[i] <= t){
					count++;
				}
			}
			
			for (int i = 0; i < n; i++){
				orangeFalls[i] = b + in.nextInt();
				if (orangeFalls[i] >= s && orangeFalls[i] <= t){
					count++;
				}
			}
			
			System.out.println(count);
			
		}

	}

}
