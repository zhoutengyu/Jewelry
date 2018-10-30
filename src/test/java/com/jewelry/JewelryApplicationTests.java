package com.jewelry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JewelryApplicationTests {

	@Test
	public void contextLoads() {
		//LinkedHashMap;
		Map<String,Object> map=new HashMap<>();
		map.put(null,"ss");
		System.out.println(map.get(null));
	}

}
