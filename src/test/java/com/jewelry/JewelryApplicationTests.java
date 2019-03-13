package com.jewelry;

import com.jewelry.springdemo.config.CDPlayerConfig;
import com.jewelry.springdemo.day0313.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
@SpringBootTest
public class JewelryApplicationTests {
	@Autowired
	private CompactDisc compactDisc;

	@Test
	public void contextLoads() {
		compactDisc.play();

	}

}
