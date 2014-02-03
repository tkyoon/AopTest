/**
 *  ++ JC1 Product ++
 */
package com.tk.aop.service.impl;

import org.springframework.stereotype.Service;

import com.tk.aop.service.TestService;
import com.tk.aop.vo.TestVO;

/**
 * <pre>
 * </pre>
 *
 * @title TestServiceImpl
 * @desc
 * @programID TestServiceImpl.java
 * @cdate 2014. 1. 29.
 * @version 1.0
 * @author 윤태경(tkyoon@jcone.co.kr)
 * @see
 *
 */
@Service("testService")
public class TestServiceImpl implements TestService {

    public void insertService(TestVO vo) {
         System.out.println("[ServiceServiceImpl] insertService = " + vo.getName() + ":" + vo.getAge());
     }

    public void selectService() {
         System.out.println("[ServiceServiceImpl] selectService");
     }

    public void deleteService() {
         System.out.println("[ServiceServiceImpl] deleteService");
     }

    public void selectServiceList() {
         System.out.println("[ServiceServiceImpl] selectServiceList");
     }

    public void updateService() {
         System.out.println("[ServiceServiceImpl] updateService");
     }


}
