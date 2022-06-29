
package appstart.mymodappdemo;

import static appfuncs.simplefuncs.SimpleMathFuncs.*;
import static appsupport.supportfuncs.SupportFuncs.*;
import userfuncs.binaryfuncs.*;
import java.util.ServiceLoader;

class MyModAppDemo {
	
	public static void main(String... sth) {
		if (isFactor(2, 10)) System.out.println("2 is a factor of 10");

		System.out.println("Smallest factor common to both 35 and 105 is " + lcf(35, 105));
		System.out.println("Largest factor common to both 35 and 105 is " + gcf(35, 105));

		// service-based, user-defined operations

		// get a service loader for binary operations

		ServiceLoader<BinFuncProvider> loader = ServiceLoader.load(BinFuncProvider.class);

		BinaryFunc binOp = null;

		// find the provider for absPlus and obtain the function
		for (BinFuncProvider b : loader) {
			if(b.get().getName().equals("absPlus")) {
				binOp = b.get();
				break;
			}
		}

		if (binOp != null) System.out.println("Result of absPlus function: " + binOp.run(12, -4));
		else System.out.println("absPlus function not found");

		binOp = null;

		//find the provider for absMinus and provide the function
		for (BinFuncProvider b : loader) {
			if(b.get().getName().equals("absMinus")) {
				binOp = b.get();
				break;
			}
		}

		if (binOp != null) System.out.println("Result of absMinus function: " + binOp.run(12, -4));
		else System.out.println("absMinus function not found");
	}
}