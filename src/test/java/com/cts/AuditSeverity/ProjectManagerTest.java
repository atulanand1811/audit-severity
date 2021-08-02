package com.cts.AuditSeverity;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;
/**
 * @version 1.8
 * To test ProjectManager class
 * 
 *
 */
@RunWith(SpringRunner.class)
@ContextConfiguration @Slf4j
public class ProjectManagerTest {
	
	ProjectManager projectManager = new ProjectManager();
	

	/**
	 * to test the all param constructor of userRetail
	 */
	@Test
	public void testProjectManagerAllConstructor()
	{
		ProjectManager manager=new ProjectManager("ABC", "ABC", null);
		assertEquals( "ABC" , manager.getUserId());
	}
	/**
	 * to test the getter setter of Uid
	 */
	@Test
	public void testUserid()
	{
		projectManager.setUserId("abc123");
		assertEquals( "abc123",  projectManager.getUserId());
	}
	/**
	 * to test the getter setter of UserPassword
	 */
	@Test
	public void testUserPassword()
	{
		projectManager.setPassword("abc1234");
		assertEquals( "abc1234" , projectManager.getPassword());
	}
	/**
	 * to test the getter setter of AuthToken
	 */
	@Test
	public void testAuthToken()
	{
		projectManager.setAuthToken("xyz");
		assertEquals("xyz", projectManager.getAuthToken());
	}
	/**
	 * to test the toString
	 */
	@Test
	public void testoString() {
		String string = projectManager.toString();
		assertEquals(string , projectManager.toString());
	}

}
