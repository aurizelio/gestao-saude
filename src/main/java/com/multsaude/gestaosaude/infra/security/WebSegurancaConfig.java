/*

package com.multsaude.gestaosaude.infra.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSegurancaConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    LoginServiceImpl loginService;

@Bean
public UserDetailsService userDetailsService()
{
    PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    User.UserBuilder userBuilder = User.builder().passwordEncoder(encoder::encode);
    UserDetails user = userBuilder.username("user").password("password")
            .roles("USER").build();
    UserDetails admin = userBuilder.username("admin").password("password")
            .roles("USER","ADMIN").build();

    return new InMemoryUserDetailsManager(user, admin);
}
    @Override
    protected void configure(HttpSecurity web) throws Exception {
        web
                .httpBasic()
                .and()
                .authorizeHttpRequests()
                .anyRequest().permitAll();
    }


    @Bean
    protected PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
*/
