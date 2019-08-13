package com.xcy.hospital;

import com.xcy.controller.SpeciaController;
import com.xcy.pojo.Department;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HospitalApplicationTests {



	@Test
	public void contextLoads() {
		SpeciaController speciaController = new SpeciaController();
		Department department = speciaController.showList(1);
		System.out.println(department);


	}

}
