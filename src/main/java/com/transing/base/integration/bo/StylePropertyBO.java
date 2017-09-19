package com.transing.base.integration.bo;


import java.util.Date;

/**
 * 包: com.transing.crawl.integration.bo
 * 源文件:StylePropertyBO.java
 * 样式的属性表
 *
 * @author Allen  Copyright 2016 成都创行, Inc. All rights reserved.2017年08月28日
 */
public class StylePropertyBO
{

    private long id;

    private String styleCode;//样式

    private String propName;//名称

    private String propValue;//值

    private int allowShow;//是否显示

    private Date createTime;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }


    public String getStyleCode()
    {
        return styleCode;
    }

    public void setStyleCode(String styleCode)
    {
        this.styleCode = styleCode;
    }

    public String getPropName()
    {
        return propName;
    }

    public void setPropName(String propName)
    {
        this.propName = propName;
    }

    public String getPropValue()
    {
        return propValue;
    }

    public void setPropValue(String propValue)
    {
        this.propValue = propValue;
    }

    public int getAllowShow()
    {
        return allowShow;
    }

    public void setAllowShow(int allowShow)
    {
        this.allowShow = allowShow;
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }


}
