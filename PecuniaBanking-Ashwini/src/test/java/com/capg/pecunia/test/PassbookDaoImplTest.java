package com.capg.pecunia.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.pecunia.dao.IPassbookDao;
import com.capg.pecunia.entity.PassbookBean;
import com.capg.pecunia.service.PassbookServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
class PassbookDaoImplTest {

	@Autowired
	PassbookServiceImpl service;

	@Test
	void testGetAll() {
		List<PassbookBean> list = service.getAll();
		assertEquals(list.size(), 7);

	}

}
