package userinfo.dao.mysql;

import userinfo.UserInfo;
import userinfo.dao.IUserInfoDao;

public class UserInfoDaoMySql implements IUserInfoDao{
	
	public void insertUserInfo(UserInfo userInfo){
		System.out.println("insrt UserInfo into MySQL "+userInfo.getUserId());
	}
	
	public void deleteUserInfo(UserInfo userInfo){
		System.out.println("delete UserInfo from MySQL "+userInfo.getUserId());
	}
	
	public void updateUserInfo(UserInfo userInfo){
		System.out.println("update UserInfo MySQL "+userInfo.getUserId());
	}
	
}
