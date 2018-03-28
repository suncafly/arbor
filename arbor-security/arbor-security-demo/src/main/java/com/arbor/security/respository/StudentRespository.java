package com.arbor.security.respository;

import com.arbor.security.browser.modle.User;
import com.arbor.security.modle.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by apple on 2018/3/15.
 */

public interface StudentRespository extends JpaRepository<Student, Long> {
    List<Student> findAll();
}
