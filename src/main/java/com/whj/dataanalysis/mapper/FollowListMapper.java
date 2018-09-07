package com.whj.dataanalysis.mapper;

import com.whj.dataanalysis.dao.FollowList;
import com.whj.dataanalysis.dao.FollowListExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FollowListMapper {
    int countByExample(FollowListExample example);

    int deleteByExample(FollowListExample example);

    int deleteByPrimaryKey(String id);

    int insert(FollowList record);

    int insertSelective(FollowList record);

    List<FollowList> selectByExample(FollowListExample example);

    FollowList selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FollowList record, @Param("example") FollowListExample example);

    int updateByExample(@Param("record") FollowList record, @Param("example") FollowListExample example);

    int updateByPrimaryKeySelective(FollowList record);

    int updateByPrimaryKey(FollowList record);
    /**
     * 批量保存
     *
     * @param saveList
     * @return
     */
    int batchSaveFollowList(@Param("saveList") List<FollowList> saveList);
}