package com.pack.config;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter
{
	
	@Autowired
	private UserDetailsService userDetailsService;
   

	
	 @Override
	  protected void configure(AuthenticationManagerBuilder auth) throws  Exception 
	  	  
	  {
			auth.userDetailsService(userDetailsService); 
	  }
	  
	  @Bean
	  public PasswordEncoder getPasswordEncoder() {
	  
	  return NoOpPasswordEncoder.getInstance(); }
	  
	  
	  @Override
	    protected void configure(HttpSecurity http) throws Exception {
			  
		  http.authorizeRequests()
		  .antMatchers("/pages/adminLogin").hasRole("ADMIN")
		  .antMatchers("/pages/Welcomeadmin.jsp").hasRole("ADMIN")
        .antMatchers("/pages/corporateLogin").hasAnyRole("USER","ADMIN")
        .antMatchers("/pages/Welcome.jsp").hasAnyRole("USER","ADMIN")
  	  
  	  .and()
  	  .formLogin();
  	  
	  http.logout(logout -> logout
			  .logoutSuccessUrl("/pages/index.jsp")
			  .invalidateHttpSession(true)
			  
			  
			  );
	  	  
	  }
	
	
	
	
	
	
	
	
	
	
}
