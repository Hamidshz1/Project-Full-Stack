package com.hamid.config;

public class SecurityConstants {
	
	public static final String SECRET = "SECRET_KEY";
	  public static final long EXPIRATION_TIME = 900_000; // 15 mins
	  public static final String TOKEN_PREFIX = "Bearer ";
	  public static final String HEADER_TYPE = "Authorization";
	  public static final String CLIENT_DOMAIN_URL = "http://localhost:4200/*";


}
