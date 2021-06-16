package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.poi.hpsf.Decimal;

import java.math.BigDecimal;

@TableName(value = "t_salary", autoResultMap = true)
public class Salary extends Model<Salary> {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer uid;

    private BigDecimal base;

    private BigDecimal post;

    private BigDecimal age;

    private BigDecimal commi;

    private BigDecimal trans;

    private BigDecimal pincome;

    private BigDecimal pension;

    private BigDecimal house;

    private String date;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setBase(BigDecimal base) {
        this.base = base;
    }

    public void setPost(BigDecimal post) {
        this.post = post;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public void setCommi(BigDecimal commi) {
        this.commi = commi;
    }

    public void setTrans(BigDecimal trans) {
        this.trans = trans;
    }

    public void setPincome(BigDecimal pincome) {
        this.pincome = pincome;
    }

    public void setPension(BigDecimal pension) {
        this.pension = pension;
    }

    public void setHouse(BigDecimal house) {
        this.house = house;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUid() {
        return uid;
    }

    public BigDecimal getBase() {
        return base;
    }

    public BigDecimal getPost() {
        return post;
    }

    public BigDecimal getAge() {
        return age;
    }

    public BigDecimal getCommi() {
        return commi;
    }

    public BigDecimal getTrans() {
        return trans;
    }

    public BigDecimal getPincome() {
        return pincome;
    }

    public BigDecimal getPension() {
        return pension;
    }

    public BigDecimal getHouse() {
        return house;
    }

    public String getDate() {
        return date;
    }
}
