package com.w77996.springbootelasticsearch.mapper;

import com.w77996.springbootelasticsearch.bean.Media;

import java.util.List;

/**
 * Created by xiehao
 * Do:
 * Date: 2018/2/24 09:47
 */
public interface MediaMapper {


    List<Media> selectPublishMedias();


}
