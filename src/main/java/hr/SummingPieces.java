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
public class SummingPieces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try (Scanner in = new Scanner(System.in)){
			int n = in.nextInt();
			int[] arr = new int[n];
			int mod = 1000000009;
			int sum = 0;
			int mul =  (n * (n  + 1)) / 2;
			for (int i = 0; i < n; i++){
				arr[i] = in.nextInt();
				if (i <= n / 2){
					mul++;
				} else {
					mul--;
				}
				sum = (sum + arr[i] * mul ) % mod;
			}
			
			System.out.println(sum);
		}

		// TODO Auto-generated method stub


	}

}
