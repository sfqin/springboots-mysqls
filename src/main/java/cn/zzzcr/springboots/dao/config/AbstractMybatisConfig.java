package cn.zzzcr.springboots.dao.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Data
public abstract class AbstractMybatisConfig {

    private String url;
    private String username;
    private String password;
    private String driverClass;

    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        return dataSource;
    }


    public abstract DataSourceTransactionManager transactionManager(DataSource dataSource);

    public abstract SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception;
}
