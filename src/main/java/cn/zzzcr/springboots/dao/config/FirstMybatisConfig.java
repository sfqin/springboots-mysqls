package cn.zzzcr.springboots.dao.config;

import lombok.Data;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Data
@ConfigurationProperties(prefix = "first.datasource")
@MapperScan(basePackages = "cn.zzzcr.springboots.dao.mapper.first", sqlSessionFactoryRef = "firstSqlSessionFactory")
@Configuration
public class FirstMybatisConfig extends AbstractMybatisConfig{

    @Override
    @Bean(name = "firstDataSource")
    public DataSource dataSource(){
        return super.dataSource();
    }
    @Override
    @Primary
    @Bean("firstTransactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("firstDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
    @Override
    @Primary
    @Bean("firstSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("firstDataSource") DataSource dataSource) throws Exception {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                        .getResources("classpath:mapper/first/*.xml"));

        return sqlSessionFactoryBean.getObject();
    }
}
