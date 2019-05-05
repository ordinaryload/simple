package tk.mybatis.simple.mapper;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import tk.mybatis.simple.bean.Country;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class CountryMapperTest {
    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void init(){
        try {
            Reader reader = Resources.getResourceAsReader("mybatis_config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Country> countryList = sqlSession.selectList("selectAll");
        printCountryList(countryList);
        sqlSession.close();
    }

    private void printCountryList(List<Country> countryList){
        System.out.println("编号\t" + "名字\t" + "代码");
        for (Country country: countryList){
            //System.out.printf("%-4d%4s%4s\n",country.getId(),country.getCountryname(),country.getCountrycode());
            System.out.println(country.getId()+"\t"+country.getCountryname()+"\t"+country.getCountrycode());
        }
    }
}

