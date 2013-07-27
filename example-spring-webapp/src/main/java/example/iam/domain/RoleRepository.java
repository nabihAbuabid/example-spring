package example.iam.domain;

import javax.persistence.QueryHint;

import org.springframework.data.jpa.repository.QueryHints;

import example.shared.ddd.DomainRepository;

public interface RoleRepository extends DomainRepository<Role> {

	@QueryHints(@QueryHint(name = org.hibernate.ejb.QueryHints.HINT_CACHEABLE, value = "true"))
	Role findByIdentifier(RoleIdentifier identifier);

}
