/**
 *  ++ JC1 Product ++
 */
package com.tk.aop.service;

import com.tk.aop.vo.TestVO;

/**
 * <pre>
 * </pre>
 *
 * @title TestService
 * @desc
 * @programID TestService.java
 * @cdate 2014. 1. 29.
 * @version 1.0
 * @author 윤태경(tkyoon@jcone.co.kr)
 * @see
 *
 */
public interface TestService {

    public void selectService();

    public void selectServiceList();

    public void insertService(TestVO vo);

    public void updateService();

    public void deleteService();

}
