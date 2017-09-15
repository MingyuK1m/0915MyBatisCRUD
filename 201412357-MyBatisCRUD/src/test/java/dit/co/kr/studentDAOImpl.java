package dit.co.kr;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import dit.co.kr.studentDAO;;
@Repository
public class studentDAOImpl implements studentDAO {
 @Inject SqlSession sqlSession;
 @Override
 public void insertStudent(studentVO item) throws Exception {
  sqlSession.insert("StudentMapper.insertStudent",item);
 }
}
