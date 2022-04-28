/*
 * package br.com.luancassanho.loginsenha.config;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter;
 * 
 * @EnableWebSecurity public class SecurityConfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception { //
 * TODO Auto-generated method stub http.authorizeRequests()
 * .anyRequest().authenticated() .and() .httpBasic() ; }
 * 
 * public void configureGlobal(AuthenticationManagerBuilder auth) throws
 * Exception { auth.inMemoryAuthentication()
 * .withUser("user").password("1234").roles("ADMIN", "USER"); }
 * 
 * 
 * }
 */