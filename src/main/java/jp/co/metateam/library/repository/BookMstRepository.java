package jp.co.metateam.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jp.co.metateam.library.model.BookMst;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Optional;

public interface BookMstRepository extends JpaRepository<BookMst, Long> {

	@Query(value = "SELECT * FROM book_mst LIMIT 1000", nativeQuery = true)
	List<BookMst> findLimitedBook();

	@Query(value = "SELECT * FROM book_mst WHERE id = ?1", nativeQuery = true)
	Optional<BookMst> selectById(Long id);

	

}

