package com.spring.biz.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.biz.user.UserService;
import com.spring.biz.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired // 타입이 일치하는 객체(인스턴스) 주입
	private UserDAO userDAO;
	
	
	public UserServiceImpl() {
		System.out.println("==>>UserServiceImpl() 객체 생성");
		
	}
	
	

	@Override
	public void insertUser(UserVO vo) {
		
		
	}


	@Override
	public void updateUser(UserVO vo) {
		
	}


	@Override
	public void deleteUser(UserVO vo) {
		
	}

	

	@Override
	public UserVO getUser(UserVO vo) {
		
		return userDAO.getUser(vo);
	}

	

	@Override
	public List<UserVO> getUserList() {
		
		return null;
	}
	

}
