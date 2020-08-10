package com.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class LoggingAspects {
	
	
	
	
	
	@Pointcut("within(com.aop.model.Circle)")
	
	public void getAllCircleMeths()
	{
		
	}
	@Before("getAllCircleMeths()")
	public void startMeth(JoinPoint jp)
	{
		
		System.out.println("Aspect one " + jp.toString());
	}
	
	@Before("args(name)")
	public void startMethArgs(String name)
	{
		
		System.out.println("Aspect one " + name);
	}
	
	
	
	
	
	
	
				// locating to specific package and selecting all classes
	
	/*
	 * @Before("getAll()") public void loggingMethShowAll() {
	 * System.out.println("Aspects run"); }
	 */

				
	/*
	 * @Pointcut("execution (* get*())") public void getAll() {
	 * 
	 * }
	 */
				
	/*
	 * //all methods under this package
	 * 
	 * @Pointcut("execution (* * com.aop.model.Circle.*(..))") public void
	 * getAllFromClass() {
	 * 
	 * } //above pc also same{execution (* * com.aop.model.Circle.*(..))}
	 * 
	 * @Pointcut("within( com.aop.model.Circle.*(..))") public void
	 * getAllFromClassWithin() {
	 * 
	 * } //subclass methods before advice excecutes
	 * 
	 * @Pointcut("within( com.aop.model.Circle..*(..))") public void
	 * getAllFromSubClassWithin() {
	 * 
	 * } //combining two pointcuts
	 * 
	 * @Before("getAll() && getAllFromSubClassWithin") public void
	 * loggingMethShowAllCombine() { System.out.println("Aspects run"); }
	 * 
	 * @Before("getAll() && getAllFromSubClassWithin") public void
	 * loggingMethPointCut() { System.out.println("Aspects run"); }
	 */
	/*
	 * @Pointcut("within(com.aop.model.Circle)") public void
	 * getAllFromSubClassWithin() {
	 * 
	 * }
	 * 
	 * 
	 * //join point
	 * 
	 * @Pointcut("getAllFromSubClassWithin()") public void getAllJoinPoint(JoinPoint
	 * jp) { System.out.println(jp.toString()); }
	 */
}


































/*@Before("execution (public String getName())")//works for all class which has getName()
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
// .. for parameter spec (0 or more args)  * for any return type here *get for any method prefix get
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
			}*/