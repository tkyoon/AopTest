/**
 *  ++ JC1 Product ++
 */
package com.tk.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import com.tk.aop.vo.TestVO;

/**
 * <pre>
 * </pre>
 *
 * @title TestAdvice
 * @desc
 * @programID TestAdvice.java
 * @cdate 2014. 1. 29.
 * @version 1.0
 * @author 윤태경(tkyoon@jcone.co.kr)
 * @see
 *
 */
@Aspect
@Service
public class TestAdvice {

	@Pointcut("execution(* com.tk.aop.service.*.insert*(..))")
	public void post() {
	}

	@Pointcut("execution(* com.tk.aop.service.*.update*(..))")
	public void put() {
	}

	@Pointcut("execution(* com.tk.aop.service.*.delete*(..))")
	public void delete() {
	}

	@Pointcut("execution(* com.tk.aop.service.*.select*(..))")
	public void get() {
	}

	@Before("post()")
	public void insertBefore(JoinPoint joinPoint) {
		Object[] signatureArgs = joinPoint.getArgs();
		for (Object signatureArg : signatureArgs) {
			TestVO vo = (TestVO)signatureArg;
			System.out.println("Arg: " + signatureArg);
			System.out.println(vo.getAge());
			System.out.println(vo.getName());
		}
		//		TestVO vo = (TestVO)obj;
		//		System.out.println("* age =  *" + vo.getAge());
		//		System.out.println("* name =  *" + vo.getName());
		System.out.println("* insert before *");
	}

	@After("post()")
	public void insertAfter() {
		System.out.println("* insert after *");
	}
}
