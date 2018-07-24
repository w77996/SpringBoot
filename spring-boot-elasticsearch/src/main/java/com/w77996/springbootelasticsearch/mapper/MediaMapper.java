package com.w77996.springbootelasticsearch.mapper;

import com.w77996.springbootelasticsearch.bean.Media;

import java.util.List;

/**
 *
 * @author Ancon
 */
public interface MediaMapper {


    List<Media> selectPublishMedias();


}
