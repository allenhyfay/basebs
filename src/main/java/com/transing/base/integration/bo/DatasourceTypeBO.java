package com.transing.base.integration.bo;

import java.util.Date;

/**
 * 包: com.transing.base.integration.bo
 * 源文件:DatasourceTypeBO.java
 *
 * @author Allen  Copyright 2016 成都创行, Inc. All rights reserved.2017年09月19日
 */
public class DatasourceTypeBO
{
    private long datasourceId;

    private String datasourceTypeName;

    private int storageTypeId;

    private int sourceType;//类型

    private Date createTime;

    private Date lastmodifyTime;

    public long getDatasourceId()
    {
        return datasourceId;
    }

    public void setDatasourceId(long datasourceId)
    {
        this.datasourceId = datasourceId;
    }

    public String getDatasourceTypeName()
    {
        return datasourceTypeName;
    }

    public void setDatasourceTypeName(String datasourceTypeName)
    {
        this.datasourceTypeName = datasourceTypeName;
    }

    public int getStorageTypeId()
    {
        return storageTypeId;
    }

    public void setStorageTypeId(int storageTypeId)
    {
        this.storageTypeId = storageTypeId;
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
