package com.xworkz.springmanage.type;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component("chocolate class")
public class Chocolate {

	@Bean("buffer1")
	public String buffer() {
		System.out.println("running String buffer in chocoate class ");
		String buffer = new String();
		return buffer;
	}

	@Bean("sahana")
	public StringBuffer buffer1() {
		System.err.println("running String buffer1 in chocoate class ");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean("gn age")
	public StringBuffer buffer2() {
		System.out.println("running String buffer2 in chocoate class ");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean("gn name")
	public StringBuffer buffer3() {
		System.out.println("running String buffer3 in chocoate class ");
		StringBuffer buffer = new StringBuffer();
		// System.err.println(name);
		return buffer;
	}
	
	@Bean("builder1")
	public StringBuilder builder1() {
		System.out.println("running String builder 1 in chocoate class ");
		StringBuilder buffer = new StringBuilder();
		// System.err.println(name);
		return buffer;
	}
	
	@Bean("builder2")
	public StringBuilder builder2() {
		System.out.println("running String builder 2 in chocoate class ");
		StringBuilder buffer = new StringBuilder();
		// System.err.println(name);
		return buffer;
	}
	@Bean("builder3")
	public StringBuilder builder3() {
		System.out.println("running String builder 3 in chocoate class ");
		StringBuilder buffer = new StringBuilder();
		// System.err.println(name);
		return buffer;
	}
	
	@Bean("builder4")
	public StringBuilder builder4() {
		System.out.println("running String builder 4 in chocoate class ");
		StringBuilder buffer = new StringBuilder();
		// System.err.println(name);
		return buffer;
	}
	
	@Bean("builder5")
	public StringBuilder builder5() {
		System.out.println("running String builder 5 in chocoate class ");
		StringBuilder buffer = new StringBuilder();
		// System.err.println(name);
		return buffer;
	}
	
	
}
