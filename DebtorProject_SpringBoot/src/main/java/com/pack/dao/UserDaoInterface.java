package com.pack.dao;

import com.pack.model.User;

public interface UserDaoInterface
{
public int corporateLogin(User u);
public int adminLogin(User u);
public   int addUser(User u);
}
