package com.transing.base.integration.bo;

/**
 * 包: com.transing.crawl.integration.bo
 * 源文件:StylePropertyBO.java
 * 输入参数
 *
 * @author Allen  Copyright 2016 成都创行, Inc. All rights reserved.2017年08月28日
 */
public class CrawlInputBO
{
    private long id;
    private long datasourceId;
    private long datasourceTypeId;
    private String paramCnName;
    private String paramEnName;
    private String prompt;
    private String styleId;
    private String restrictions;

    private String isRequired;

    private String controlProp;//属性的值

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDatasourceId() {
        return datasourceId;
    }

    public void setDatasourceId(long datasourceId) {
        this.datasourceId = datasourceId;
    }

    public long getDatasourceTypeId() {
        return datasourceTypeId;
    }

    public void setDatasourceTypeId(long datasourceTypeId) {
        this.datasourceTypeId = datasourceTypeId;
    }

    public String getParamCnName() {
        return paramCnName;
    }

    public void setParamCnName(String paramCnName) {
        this.paramCnName = paramCnName;
    }

    public String getParamEnName() {
        return paramEnName;
    }

    public void setParamEnName(String paramEnName) {
        this.paramEnName = paramEnName;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getStyleId() {
        return styleId;
    }

    public void setStyleId(String styleId) {
        this.styleId = styleId;
    }

    public String getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }

    public String getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(String isRequired) {
        this.isRequired = isRequired;
    }

    public String getControlProp()
    {
        return controlProp;
    }

    public void setControlProp(String controlProp)
    {
        this.controlProp = controlProp;
    }
}
