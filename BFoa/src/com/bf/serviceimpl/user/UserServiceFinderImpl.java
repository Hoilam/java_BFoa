package com.bf.serviceimpl.user;

import org.springframework.stereotype.Service;

import com.bf.base.AbstractFinder;
import com.bf.service.user.UserServiceFinder;
@Service
public class UserServiceFinderImpl<User> extends AbstractFinder<User> implements UserServiceFinder<User> {

}
