package tk.mybatis.simple.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
import tk.mybatis.simple.bean.SysUser;

import java.util.List;

public class UserMapperTest extends BaseMapperTest{
    @Test
    public void testSelectById(){
        //获取sqlSession
        SqlSession sqlSession = getSqlSession();
        //获取UserMapper接口
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            //调用selectById方法，查询 id = 1 的用户
            SysUser user = userMapper.selectById(1l);
            //user不为空
            Assert.assertNotNull(user);
            //userName = admin
            Assert.assertEquals("admin",user.getUserName());
            sqlSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //调用selectAll方法查询所有用户
        List<SysUser> userList = userMapper.selectAll();
        //用户数量大于0个
        Assert.assertNotNull(userList);
        Assert.assertTrue(userList.size() > 0);
        sqlSession.close();
    }
}
