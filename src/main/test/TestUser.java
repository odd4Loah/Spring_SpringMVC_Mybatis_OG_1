import com.lihoo.ssm.dao.UserDao;
import com.lihoo.ssm.model.User;
import com.lihoo.ssm.service.UserService;
import com.lihoo.ssm.util.Page;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author lihoo
 * @Title: TestUser
 * @ProjectName Spring_SpringMVC_Mybatis_OG_1
 * @Description: TODO
 * @date 2018/8/6-13:19
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestUser {
    private static Logger logger = Logger.getLogger(TestUser.class);

    @Autowired
    private UserDao userDao;

    @Test
    public void testAddUser() throws Exception  {
        logger.debug("开始增加");

        for (int i = 0; i < 100; i++) {
            User new_user = new User();

            new_user.setUsername("OG_" + i);
            new_user.setQq(483500+i);
            new_user.setJob("老学校"+i);
            new_user.setSchool("通利福尼亚大学"+i);
            new_user.setUrl("www.xxx"+ i +".com");
            userDao.addUser(new_user);

            logger.debug("添加学员:" + new_user);
        }
        logger.debug("增加成功！！！");

    }


    @Test
    public void testDeleteUser() throws Exception {
        logger.debug("开始删除");

        User de_user = new User();

        de_user.setId(31);

        userDao.deleteUser(de_user);
        logger.debug("删除成功！！！");
    }

    @Test
    public void testUpdateUser() throws Exception {
        logger.debug("开始更改");

        User up_user = new User();
        up_user.setId(17);
        up_user.setUsername("发际线");
        up_user.setQq(75398482);
        up_user.setJob("匪帮说唱");
        up_user.setSchool("阿拉斯加大学");
        up_user.setUrl("www.5673.net");

        userDao.updateUser(up_user);
        logger.debug(up_user);
        logger.debug("更新完毕！！！");
    }

    @Test
    public void testFindUserById() throws Exception {
        logger.debug("开始查询");
        User us_id = userDao.findUserById(7);
        logger.debug(us_id);
        logger.debug("查询成功！！！");
    }

    @Test
    public void testFindUserByName() throws Exception {
        logger.debug("开始查询姓名");
        User us_name = userDao.findUserByName("艾力扎心");
        logger.debug(us_name.getUsername());
        logger.debug("查询完毕！！！");
    }

    @Test
    public void testFindAllUsers() throws Exception {
        logger.debug("开始查询");
        List<User> list = userDao.findAllUsers();
        for (User userList : list ) {
            logger.debug(userList);
        }
        logger.debug("查询成功！！！");

    }

//    @Test
//    public void testFindAllUsersPage() throws Exception {
//        logger.debug("开始查询总页数");
//        Page p = new Page();
//        p.setStart(2);
//        p.setCount(3);
//        List<User> us = userDao.findAllUsers(p);
//        for (User u :
//                us) {
//            logger.debug(u.getUsername());
//        }
//    }
//
//    @Test
//    public void testListPage() throws Exception {
//        logger.debug("查询总数");
//        int total_page = userDao.total();
//        logger.debug("查询成功！！！");
//        logger.debug("一共有("+total_page+")条数据~");
//    }

}
