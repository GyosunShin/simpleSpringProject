package gyoseon.hellospring.repository;

import gyoseon.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


// 인터페이스가 인터페이스를 받을때는 extends라고 하고
// 인터페이스는 다중상속을 받을 수 있다.
// extends JpaRepository<T, id>를 통해 JpaRepository를 받고 있으면 구현체를 자동으로 만들어준다.
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    @Override
    Optional<Member> findByName(String name);

}
