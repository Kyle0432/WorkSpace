package com.kyle.crud.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.github.pagehelper.PageInfo;
import com.kyle.crud.bean.Employee;


/*
 * 使用spring测试模块提供测试的请求功能,测试crud请求的正确性
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration//表示直接整个ioc容器注入
@ContextConfiguration(locations={"classpath:applicationContext.xml","file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml"})
public class MvcTest {

	//传入SpringMvc的IOC容器
	@Autowired//只能注解ioc里面的
	WebApplicationContext context;
	
	//mockMvc是虚拟的mvc请求,获取到处理结果
	MockMvc mockMvc;
	@Before//进行初始化   
	public void initMockMvc(){
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void testPage() throws Exception{
		//模拟请求拿到返回值
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/emps").param("pn", "1")).andReturn();
	
		//请求成功以后,请求域中会有PageInfo,我们可以取出PageInfo进行验证
		MockHttpServletRequest request = result.getRequest();
		PageInfo  page = (PageInfo) request.getAttribute("PageInfo");
		System.out.println("当前页面:"+page.getPageNum());
		System.out.println("总页码:"+page.getPages());
		System.out.println("总记录数:"+page.getTotal());
		System.out.println("在页面需要连续显示的页码:");
		int nums[] = page.getNavigatepageNums();
           for (int i : nums) {
			 System.out.println(" "+i);
		}	
           //獲取员工数据
           List<Employee> list = page.getList();
           for (Employee employee : list) {
			  System.out.println("ID:"+employee.getdId()+"==>name"+employee.getEmpName());
		}
	}			
}
