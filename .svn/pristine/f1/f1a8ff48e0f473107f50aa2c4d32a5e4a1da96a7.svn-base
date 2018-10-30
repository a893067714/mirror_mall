package test.service;

import org.junit.Test;

import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.usr.service.IAddressInfoService;
import com.iwonder.tea.usr.service.imp.AddressInfoServiceImp;

public class AddressInfoService {

	@Test
	public void delete(){
		//动态代理
		IAddressInfoService addressInfoService = (IAddressInfoService) ProxyServiceFactory.getProxyService(AddressInfoServiceImp.class);
		
		addressInfoService.delete("3");
	}
	
	@Test
	public void list(){
		
		//动态代理
		IAddressInfoService addressInfoService = (IAddressInfoService) ProxyServiceFactory.getProxyService(AddressInfoServiceImp.class);
		
		addressInfoService.list();
	}
	
}
