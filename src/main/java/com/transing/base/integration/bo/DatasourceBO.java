package com.transing.base.integration.bo;

import java.util.Date;

/**
 * 包: com.transing.base.integration.bo
 * 源文件:DatasourceBo.java
 * 数据源
 * @author Allen  Copyright 2016 成都创行, Inc. All rights reserved.2017年09月19日
 */
public class DatasourceBO
{
    private long id;

    private String datasourceName;

    private int status;

    private int sourceType;//类型

    private Date createTime;

    private Date lastmodifyTime;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getDatasourceName()
    {
        return datasourceName;
    }

    public void setDatasourceName(String datasourceName)
    {
        this.datasourceName = datasourceName;
    }

    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public Date getLastmodifyTime()
    {
        return lastmodifyTime;
    }

    public void setLastmodifyTime(Date lastmodifyTime)
    {
        this.lastmodifyTime = lastmodifyTime;
    }

    public int getSourceType()
    {
        return sourceType;
    }

    public void setSourceType(int sourceType)
    {
        this.sourceType = sourceType;
    }
}
