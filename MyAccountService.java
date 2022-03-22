package ibmtal.trendyol.bussiness.services;

import java.util.ArrayList;

import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.entity.MyAccount;
import ibmtal.trendyol.entity.User;

public interface MyAccountService<MyAccountAddDto> {
    ArrayList<MyAccount> getAll();
    Result<User> addUser(User user);
 	Result<User> addMyAccountDto(MyAccountAddDto myaccountAddDto);
 	Result<User> addCompany(User user);
 	Result<User> getCompany(Integer id);
 	Result<User> getUser(Integer id);
}
