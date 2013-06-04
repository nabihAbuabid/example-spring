package example.infrastructure.jpa;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import example.shared.date.DateTimeProvider;
import example.shared.ddd.EventPublisher;
import example.shared.security.AccountProvider;

@Configuration
public class JpaTestConfiguration {

	@Bean
	public AccountProvider accountProvider() {
		return Mockito.mock(AccountProvider.class);
	}

	@Bean
	public DateTimeProvider dateTimeProvider() {
		return Mockito.mock(DateTimeProvider.class);
	}

	@Bean
	public EventPublisher eventPublisher() {
		return Mockito.mock(EventPublisher.class);
	}

}
