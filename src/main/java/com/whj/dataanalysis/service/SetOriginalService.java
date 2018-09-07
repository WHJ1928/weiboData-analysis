package com.whj.dataanalysis.service;

import com.whj.dataanalysis.dao.Blog;
import com.whj.dataanalysis.dao.BlogExample;
import com.whj.dataanalysis.dao.Weibo;
import com.whj.dataanalysis.dao.WeiboExample;
import com.whj.dataanalysis.mapper.BlogMapper;
import com.whj.dataanalysis.mapper.WeiboMapper;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wanghaijun
 * @date 2018/9/6
 * @desc
 */
@Service
public class SetOriginalService {

    @Autowired
    private BlogMapper blogMapper;
    @Autowired
    private WeiboMapper weiboMapper;

    public void setOriginal(){
        List<String> strings =weiboMapper.selectUserId();
        for (String userId:strings){
            BlogExample example = new BlogExample();
            example.createCriteria().andUserIdEqualTo(userId).andOriginalFlagEqualTo("1");
            List<Blog> blogList = blogMapper.selectByExample(example);
            if (CollectionUtils.isNotEmpty(blogList)){
                WeiboExample weiboExample = new WeiboExample();
                weiboExample.createCriteria().andUseridEqualTo(userId);
                Weibo weibo = new Weibo();
                weibo.setOriginalblognum((long) blogList.size());
                weiboMapper.updateByExampleSelective(weibo, weiboExample);
            }

        }

    }
}
