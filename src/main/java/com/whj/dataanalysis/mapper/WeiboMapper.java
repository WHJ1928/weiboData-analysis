package com.whj.dataanalysis.mapper;

import com.whj.dataanalysis.dao.Weibo;
import com.whj.dataanalysis.dao.WeiboExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface WeiboMapper {
    int countByExample(WeiboExample example);

    int deleteByExample(WeiboExample example);

    int deleteByPrimaryKey(String userid);

    int insert(Weibo record);

    int insertSelective(Weibo record);

    List<Weibo> selectByExample(WeiboExample example);

    Weibo selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") Weibo record, @Param("example") WeiboExample example);

    int updateByExample(@Param("record") Weibo record, @Param("example") WeiboExample example);

    int updateByPrimaryKeySelective(Weibo record);

    int updateByPrimaryKey(Weibo record);

    @Select("select userId from weibo")
    List<String> selectUserId();
}