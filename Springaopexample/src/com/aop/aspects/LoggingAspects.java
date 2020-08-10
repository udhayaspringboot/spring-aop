package com.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class LoggingAspects {
	@Before("execution (public String getName())")//works for all class which has getName()
	//loggingMeth runs before circles getname() only :-   @Before("execution (public String com.aop.model.Circle.getName()"
	//using wild card  - @Before("execution (public String *get())") the method executed before all get%a methods executed
	public void loggingMeth()
	{
		System.out.println("Aspects run");
	}
	
	//specifying exact method
	@Before("execution (public String com.aop.model.Circle.getName()")
	public void loggingMethShowClass()
	{
		System.out.println("Aspects run");
	}
	
	//*get for any method prefix get
	@Before("execution (public String *get())")
	public void loggingMethShowClassWildCard()
	{
		System.out.println("Aspects run");
	}
	
	//* for any return type here *get for any method prefix get
	@Before("execution (public * *get())")
	public void loggingMethShowClassWildCardtype()
	{
		System.out.println("Aspects run");
	}
	// .. for parameter spec   * for any return type here *get for any method prefix get
		@Before("execution (public * *get(..))")
		public void loggingMethShowClassWildCardtypeArgs()
		{
			System.out.println("Aspects run");
		}
		
		// locating to specific package and selecting all classes
				@Before("execution (* com.aop.model.*.*get(..))")
				public void loggingMethShowClassWildCardtypeArgsClass()
				{
					System.out.println("Aspects run");
				}
				// locating to specific package and selecting all classes
				@Before("execution (* *get())")
				public void loggingMethShowAll()
				{
					System.out.println("Aspects run");
				}
										
		
}
