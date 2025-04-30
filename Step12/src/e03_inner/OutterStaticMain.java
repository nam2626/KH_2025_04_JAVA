package e03_inner;

import e03_inner.OutterStaticInnerClass.InnerStaticClass;

public class OutterStaticMain {

	public static void main(String[] args) {
		InnerStaticClass inStatic = new InnerStaticClass(100);
		System.out.println(inStatic.sum());
	}

}
