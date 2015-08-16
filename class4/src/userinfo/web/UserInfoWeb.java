package userinfo.web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import userinfo.UserInfo;
import userinfo.dao.IUserInfoDao;
import userinfo.dao.mysql.UserInfoDaoMySql;
import userinfo.dao.oracle.UserInfoDaoOracle;

public class UserInfoWeb {

	public static void main(String[] args) throws IOException {
		UserInfo user = new UserInfo();
		user.setUserId("dragon");
		user.setUserName("용가리");
		user.setUserPasswd("fire");
		
		FileInputStream fis = new FileInputStream("db.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String dbType = prop.getProperty("DBTYPE");
		
		IUserInfoDao db = null;
		if(dbType.equals("ORACLE")){
			db = new UserInfoDaoOracle();
		} else if(dbType.equals("MYSQL")){
			db = new UserInfoDaoMySql();
		} else {
			return;
		}
		
		db.insertUserInfo(user);
		db.updateUserInfo(user);
		db.deleteUserInfo(user);
		
	}

}