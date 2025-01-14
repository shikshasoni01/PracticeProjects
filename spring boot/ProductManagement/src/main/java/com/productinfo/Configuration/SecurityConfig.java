package com.productinfo.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	@Bean
	static PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	 SecurityFilterChain  securityFilterChain(HttpSecurity httpsecurity) throws Exception
	 {
		httpsecurity.csrf((csrf)->csrf.disable())
		.authorizeHttpRequests((authorize)->{
			authorize.requestMatchers(HttpMethod.POST,"/productapi/**").hasRole("ADMIN");
			authorize.requestMatchers(HttpMethod.PUT,"/productapi/**").hasAnyRole("ADMIN","MANAGER");
			authorize.anyRequest().authenticated();
		}).httpBasic(Customizer.withDefaults());
		
		return httpsecurity.build();
		
	 }
	@Bean
	UserDetailsService userDetailsService()
	{
		UserDetails admin= User.builder().username("admin")
				.password(passwordEncoder().encode("admin@123"))
				.roles("ADMIN").build();
		
		UserDetails manager= User.builder().username("shiksha")
				.password(passwordEncoder().encode("abc@123"))
				.roles("MANAGER").build();
		UserDetails user1= User.builder().username("amit")
				.password(passwordEncoder().encode("amit@123"))
				.roles("USER").build();
		
		UserDetails user2= User.builder().username("somi")
				.password(passwordEncoder().encode("somi@123"))
				.roles("USER").build();
		
		return new InMemoryUserDetailsManager(admin, manager,user1,user2);
		
	}
}
