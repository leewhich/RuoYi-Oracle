package com.kingyun.common.core.domain;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * Created by yangcs on 2016/11/21.
 */
public class BootstrapSearchBean {

    private String search;
    private String order;
    private Integer offset;
    private Integer limit;
    private String filter;
    private Map filterMap;
    private Map initParam;


    //新增上传;删除
    private String deletedFiles;
    private String uploadFiles;


    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public Map getFilterMap() {
        return filterMap;
    }

    public void setFilterMap(Map filterMap) {
        if (this.filter != null) {
            JSONObject jsonObject = JSON.parseObject(filter);
            for (String str : jsonObject.keySet()) {
                filterMap.put(str, jsonObject.get(str));
            }
        }
        this.filterMap = filterMap;
    }

    public Map getInitParam() {
        return initParam;
    }

    public void setInitParam(Map initParam) {
        this.initParam = initParam;
    }


    public String getDeletedFiles() {
        return deletedFiles;
    }

    public void setDeletedFiles(String deletedFiles) {
        this.deletedFiles = deletedFiles;
    }

    public String getUploadFiles() {
        return uploadFiles;
    }

    public void setUploadFiles(String uploadFiles) {
        this.uploadFiles = uploadFiles;
    }
}
