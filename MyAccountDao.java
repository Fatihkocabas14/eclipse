package ibmtal.trendyol.databese;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.trendyol.entity.MyAccount;

public interface MyAccountDao extends JpaRepository<MyAccount, Integer> {

}
