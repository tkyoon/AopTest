/**
 *  ++ JC1 Product ++
 */
package com.tk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tk.aop.service.TestService;
import com.tk.aop.vo.TestVO;

/**
 * <pre>
 * </pre>
 *
 * @title App
 * @desc
 * @programID App.java
 * @cdate 2014. 1. 29.
 * @version 1.0
 * @author 윤태경(tkyoon@jcone.co.kr)
 * @see
 *
 */
public class App {

	/**
	 * <pre>
	 * </pre>
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");

		TestService svr = (TestService)ac.getBean("testService");
		TestVO vo = new TestVO();
		vo.setAge("20");
		vo.setName("윤태경");
		svr.insertService(vo);



	}

}
