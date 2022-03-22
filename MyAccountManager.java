package ibmtal.trendyol.business.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.trendyol.databese.UserDao;
import ibmtal.trendyol.entity.MyAccount;

@Service
public class MyAccountManager {
    private MyAccountManager myaccountDao;
    @Autowired
	public MyAccountManager(MyAccountManager myaccountDao) {
		super();
		this.myaccountDao = myaccountDao; } {
			
		}
}

