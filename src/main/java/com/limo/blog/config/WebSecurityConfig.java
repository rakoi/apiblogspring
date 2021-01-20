package com.limo.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Bean
	public BCryptPasswordEncoder byCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
//		http.csrf().disable().authorizeRequests().antMatchers("/products/*","/orders","/").permitAll().antMatchers("/order","/addOrder","/deleteOrder/*","/dashboard","/sales","/loss","/returns","/addProduct",
//				"deleteProduct/*","updateProduct/*").hasAnyAuthority("admin").and().formLogin().loginPage("/").loginProcessingUrl("/login").defaultSuccessUrl("/dashboard",true);
//		
	}

	
	


	
}
