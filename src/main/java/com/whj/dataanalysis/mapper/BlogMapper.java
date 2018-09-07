package com.whj.dataanalysis.mapper;

import com.whj.dataanalysis.dao.Blog;
import com.whj.dataanalysis.dao.BlogExample;
import com.whj.dataanalysis.dao.BlogWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BlogMapper {
    int countByExample(BlogExample example);

    int deleteByExample(BlogExample example);

    int deleteByPrimaryKey(String blogId);

    int insert(BlogWithBLOBs record);

    int insertSelective(BlogWithBLOBs record);

    List<BlogWithBLOBs> selectByExampleWithBLOBs(BlogExample example);

    List<Blog> selectByExample(BlogExample example);

    BlogWithBLOBs selectByPrimaryKey(String blogId);

    int updateByExampleSelective(@Param("record") BlogWithBLOBs record, @Param("example") BlogExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogWithBLOBs record, @Param("example") BlogExample example);

    int updateByExample(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByPrimaryKeySelective(BlogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BlogWithBLOBs record);

    int updateByPrimaryKey(Blog record);
    /**
     * 批量保存
     *
     * @param saveList
     * @return
     */
    int batchSave(@Param("saveList") List<BlogWithBLOBs> saveList);
}