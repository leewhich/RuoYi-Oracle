package com.kingyun.gpsinspection.mapper;


import com.kingyun.gpsinspection.domain.PipeLineTypes;

import java.util.List;
import java.util.Map;

public interface PipeLineTypesMapper {
    int deleteByPrimaryKey(Map<String, Object> pipelineTypeId);

    int insert(PipeLineTypes record);

    int insertSelective(PipeLineTypes record);

    PipeLineTypes selectByPrimaryKey(String pipelineTypeId);

    int updateByPrimaryKeySelective(PipeLineTypes record);

    int updateByPrimaryKey(PipeLineTypes record);

    /**
     * 下拉列表
     * @param map
     * @return
     */
    List<PipeLineTypes> pullDownList(Map<String, Object> map);

    /**
     * 满足条件的总条数
     * @param pipeLineTypes
     * @return
     */
    Integer queryCount(PipeLineTypes pipeLineTypes);

    /**
     * 满足条件的对象
     * @param pipeLineTypes
     * @return
     */
    List<PipeLineTypes> queryList(PipeLineTypes pipeLineTypes);
}
