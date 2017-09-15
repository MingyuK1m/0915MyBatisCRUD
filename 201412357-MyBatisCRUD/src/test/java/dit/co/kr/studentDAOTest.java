package dit.co.kr;

import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import dit.co.kr.studentVO;
import dit.co.kr.studentDAO;
import org.springframework.test.context.ContextConfiguration;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class studentDAOTest {
 @Inject
 private studentDAO studentDao;
 @Test
 public void testInsert() throws Exception {
  studentVO item = new studentVO();
  item.setNumber("201412357");
  item.setName("MyBatisTest");
  studentDao.insertStudent(item);
 }
 @Test
 public void selectTest() throws Exception {
 
  }
 }
