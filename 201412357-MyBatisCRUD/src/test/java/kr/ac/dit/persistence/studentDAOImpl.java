package kr.ac.dit.persistence;

import java.util.List;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.ac.dit.domain.studentVO;;
@Repository
public class studentDAOImpl implements studentDAO {
 @Inject SqlSession sqlSession;
 @Override
 public void insertStudent(studentVO item) throws Exception {
  sqlSession.insert("StudentMapper.insertStudent",item);
 }
 public List<studentVO> selectStudent() throws Exception {
	 return sqlSession.selectList("StudentMapper.selectStudent");
 }
}
