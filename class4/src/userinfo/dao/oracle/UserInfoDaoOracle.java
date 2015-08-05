package userinfo.dao.oracle;

import userinfo.UserInfo;
import userinfo.dao.IUserInfoDao;

public class UserInfoDaoOracle implements IUserInfoDao {

	public void insertUserInfo(UserInfo userInfo){
		System.out.println("insrt UserInfo into ORACLE "+userInfo.getUserId());
	}
	
	public void deleteUserInfo(UserInfo userInfo){
		System.out.println("delete UserInfo from ORACLE "+userInfo.getUserId());
	}
	
	public void updateUserInfo(UserInfo userInfo){
		System.out.println("update UserInfo ORACLE "+userInfo.getUserId());
	}
}
