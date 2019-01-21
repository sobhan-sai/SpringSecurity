package com.demo.jwt.SpringSecurity.security;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.demo.jwt.SpringSecurity.model.User;

public class JwtUserFactory {

	public static JwtUser create(User user) {
		// TODO Auto-generated method stub
		return new JwtUser(user.getId(),user.getEmail(),user.getPassword(),user, maptoGrantedAuthorities(new ArrayList<String>(Arrays.asList("ROLES_"+user.getRole()))),user.isEnabled());
	}
private static List<GrantedAuthority> maptoGrantedAuthorities(List<String> authorities){
	return authorities.stream().map(Authority->new SimpleGrantedAuthority(Authority)).collect(Collectors.toList());
}
}
