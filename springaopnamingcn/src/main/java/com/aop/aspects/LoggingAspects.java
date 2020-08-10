package com.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
	/*
	 * //After Advice
	 * 
	 * @After("getAllCircleMeths()") public void startMeth(JoinPoint jp) {
	 * 
	 * System.out.println("Aspect one after method " + jp.toString()); }
	 */
	
	@Around("getAllCircleMeths()")
	public Object methAround(ProceedingJoinPoint proceedingJoinPoint)
	{Object returntype = null;
		try {
			System.out.println("Before execution");
			returntype = proceedingJoinPoint.proceed();
			System.out.println("After execution");
		} catch (Throwable e) {
			System.out.println("exception execution");
			e.printStackTrace();
		}
		return returntype;
	}
	
	
	/*
	 * //After Returning Advice (if any exception occured for respective methods it
	 * wont run
	 * 
	 * @AfterReturning("getAllCircleMeths()") public void startMethAR(JoinPoint jp)
	 * {
	 * 
	 * System.out.println("Aspect one after method " + jp.toString()); } //to handle
	 * exception and execute log method before it need to use after throwing
	 * 
	 * @AfterThrowing("args(name)") public void startMethThrow(String name) {
	 * 
	 * System.out.println("Aspect one after throwing method " + name); }
	 * 
	 * @AfterReturning(pointcut = "args(name)",returning = "return_val") public void
	 * startMethThrowRet(String name,String return_val) {
	 * 
	 * System.out.println("Aspect one after throwing method " +
	 * name+"return val"+return_val); }
	 * 
	 * 
	 * @Before("args(name)") public void startMethArgs(String name) {
	 * 
	 * System.out.println("Aspect one " + name); }
	 * 
	 * @AfterThrowing(pointcut = "args(name)",throwing = "ex") public void
	 * startMethThrowObj(String name,Exception ex) {
	 * 
	 * System.out.println("Aspect one after throwing method " + name + ex); }
	 */
	
	
	
	
	
	
	
	
	
	
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