package kr.ac.dit.persistence;

import java.util.List;

import kr.ac.dit.domain.studentVO;
public interface studentDAO {
 public void insertStudent(studentVO item) throws Exception;
 public List<studentVO> selectStudent() throws Exception;

}