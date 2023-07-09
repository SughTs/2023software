package com.example.shop.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tbl_product")
public class ProductBean {

    @TableId(type = IdType.AUTO)
    public Integer id;
    public String product;
    public Integer price;
    public String logo;
    public String hot;
    //public Datetime ctime;
    public Integer num;
    public Integer uid;
    public  Integer cid;
}
//产品表