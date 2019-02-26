package com.tom.aa;

import com.tom.Student;

public class Graduatestudent extends Student{
	public Graduatestudent() {
		super("無名氏" , 0 , 0 );
		/*在擴充這個類別，
		您可以一併初始父類別的建構方法，
		以完成相對應的初始動作，
		這可以使用 super() 方法來達到，
		它表示呼叫基底類別的建構方法，
		super() 必須在建構方法一開始就呼叫，
		在子類別的建構方法中，
		如果不用 super() 指定使用父類別中的哪個建構方法來初始，
		則預設會呼叫父類別中無參數的建構方法。*/
	}
}
