/*******************************************************************************************************************************
MathLib.java

Copyright � 2020, TextCloud.AI Corporation. All rights reserved.
The Programs (which include both the software and documentation) contain proprietary information of TextCloud.AI Corporation;
they are provided under a license agreement containing restrictions on use and disclosure and are also protected by
copyright, patent and other intellectual and industrial property law. Reverse engineering, disassembly or de-compilation of
the programs is prohibited.
Program Documentation is licensed for use solely to support the deployment of the Programs and not for any other
purpose.
The information contained in this document is subject to change without notice. If you find any problems in the
documentation, please report them to us in writing. TextCloud.AI Corporation does not warrant that this document is error free.
Except as may be expressly permitted in your license agreement for these Programs, no part of these Programs may be
reproduced or transmitted in any form or by any means, electronic or mechanical, for any purpose, without the express
written permission of TextCloud.AI Corporation.

Author : ymohammad
Date   : May 17, 2020

Last modified by : ymohammad
Last modified on : May 17, 2020

*******************************************************************************************************************************/

package com.alysoft.java;

/**
* Class MathLib
*/
public class MathLib
{
	public static void main(String... args) {
		System.out.println("Program Execution starts..");
		//mathRandomTest();
		mathSqrtTest();
		
		Character ch = new Character('a');
		ch.isDigi
	}
	
	public static void mathSqrtTest() {
		System.out.println("Calling Math Sqrt..");
		int x = -25;
		double sqrtDouble = Math.sqrt(x);
		System.out.println(sqrtDouble);
	}
	public static void mathRandomTest() {
		System.out.println("Calling Random 5 times in a loop..");
		for (int i = 0; i<5; i++) {
			double random = Math.random();
			System.out.println(i + ">>> " + random);
		}
		
		System.out.println("Getting number between 1 and 10, 50 times in a loop..");
		for (int i = 0; i<5000000; i++) {
			int random = (int)(Math.random()*11) + 1;
			if (random == 0 || random > 10) {
				throw new IllegalArgumentException("Got invalid random number :" + random);
			}
			//System.out.println(i + ">>> " + random);
		}
	}
}
