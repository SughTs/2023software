package com.example.shop.mapper;

import com.example.shop.bean.UserBean;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {
    //接口：方法抽象
    @Select("select * from tbl_user where username=#{username} and password=#{password}")//MyBatis注解,注意取值操作的方法#{}
    UserBean getUser(@Param("username") String param1,
                     @Param("password") String param2);//编译器有时会更改形参的名字，需要用@Param注释来固定

}
