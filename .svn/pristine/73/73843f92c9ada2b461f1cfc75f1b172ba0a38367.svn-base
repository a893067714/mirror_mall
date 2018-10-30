package test.service;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;

import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.usr.entity.UserInfo;
import com.iwonder.tea.usr.service.IUserInfoService;
import com.iwonder.tea.usr.service.imp.UserInfoServiceImp;

public class UserInfoServiceTest {

	
	
	@Test
	public void insert(){
		IUserInfoService userInfoService = (IUserInfoService) ProxyServiceFactory.getProxyService(UserInfoServiceImp.class);
		
		UserInfo userInfo = new UserInfo();
		userInfo.setName("xz");
		userInfoService.insert(userInfo);
	}
	
	@Test
	public void update(){
		IUserInfoService userInfoService = (IUserInfoService) ProxyServiceFactory.getProxyService(UserInfoServiceImp.class);
		
		UserInfo userInfo = new UserInfo();
		userInfo.setName("cwq");
		userInfo.setNickName("fsd");
		userInfo.setGender("男");
		userInfo.setBirthday(new Date());
		userInfo.setIdCard("1515");
		userInfo.setMobile("1515");
		userInfo.setEmail("415145");
		userInfo.setPwdLogin("14515");
		userInfo.setBalance(new BigDecimal("1212"));
		userInfoService.update(userInfo);
	}
	
	@Test
	public void delete(){
		//动态代理
		IUserInfoService userInfoService = (IUserInfoService) ProxyServiceFactory.getProxyService(UserInfoServiceImp.class);
		
		userInfoService.delete("3");
	}
	
	@Test
	public void list(){
		
		//动态代理
		IUserInfoService userInfoService = (IUserInfoService) ProxyServiceFactory.getProxyService(UserInfoServiceImp.class);
		
		userInfoService.list();
	}
	
	@Test
	public void load(){
		IUserInfoService userInfoService = (IUserInfoService) ProxyServiceFactory.getProxyService(UserInfoServiceImp.class);
		
		userInfoService.load("2");
	}
	
}
