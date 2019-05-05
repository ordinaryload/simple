package tk.mybatis.simple.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tk.mybatis.simple.bean.Country;
import java.util.List;

public class CountryMapperTest extends BaseMapperTest{

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = getSqlSession();
        List<Country> countryList = sqlSession.selectList("tk.mybatis.simple.mapper.CountryMapper.selectAll");
        printCountryList(countryList);
        sqlSession.close();
    }

    private void printCountryList(List<Country> countryList){
        for (Country country: countryList) {

            System.out.printf("%-4d%s%s\n",country.getId(),country.getCountryname(),country.getCountrycode());
        }
    }
}

