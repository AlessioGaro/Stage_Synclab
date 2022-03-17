package com.alessio.gestioneCandidatureStage.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity

public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	 @Autowired
	 @Qualifier("customUserDetailsService")
	 UserDetailsService userDetailsService;
	
	
	
	//add a reference to our security data source
	
	 @Autowired
	 public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
	        auth.userDetailsService(userDetailsService);
	        auth.authenticationProvider(authenticationProvider());
	    }
	 
	 @Bean
	 public PasswordEncoder passwordEncoder() {
		 return new BCryptPasswordEncoder();
	    }
	
	 @Bean
	 public DaoAuthenticationProvider authenticationProvider() {
	        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
	        authenticationProvider.setUserDetailsService(userDetailsService);
	        authenticationProvider.setPasswordEncoder(passwordEncoder());
	        return authenticationProvider;
	    }
	 
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http.authorizeRequests().antMatchers("/", "/list")
	                .access("hasRole('HR') or hasRole('ADMIN') or hasRole('MANAGER')")
	                .antMatchers("/newuser/**", "/delete-user-*").access("hasRole('ADMIN')").antMatchers("/edit-user-*")
	                .access("hasRole('ADMIN') or hasRole('HR') or hasRole('MANAGER')").and().formLogin().loginPage("/login")
	                .loginProcessingUrl("/login").usernameParameter("username").passwordParameter("password").and().csrf().disable()/*.and().logout().permitAll()*/;
	                
	    }
	
	

}
