/*******************************************************************************
 * Copyright (c) 2017 Roberto Medina
 * Written by Roberto Medina (rmedina@telecom-paristech.fr)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package fr.tpt.s3.ls_mxc.util;

/**
 * Utility Math class
 * @author roberto
 *
 */
public class MathMCDAG {
	
	public static int gcd (int a , int b) {
		while (b > 0) {
			int tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}
	
	public static int lcm (int a, int b) {
		return a * (b / gcd(a, b));
	}
	
	public static int lcm (int[] input) {
		int res = input[0];
		for (int i = 1; i < input.length; i ++)
			res = lcm(res, input[i]);
		
		return res;
	}
}
