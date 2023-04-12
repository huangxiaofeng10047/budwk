package com.budwk.app.device.models;

import com.budwk.starter.common.openapi.annotation.ApiModelProperty;
import com.budwk.starter.database.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.nutz.dao.entity.annotation.*;

import java.io.Serializable;

/**
 * @author wizzer.cn
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table
public class Device_info_latest_data extends BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Name
    @Column
    @ColDefine(type = ColType.VARCHAR, width = 32)
    @Comment("设备ID")
    @ApiModelProperty(description = "设备ID")
    private String deviceId;

    @Column
    @Comment("最新通讯连接时间")
    @ApiModelProperty(description = "最新通讯连接时间")
    private Long lastConnectionAt;

    @Column
    @ColDefine(type = ColType.TEXT)
    @Comment("属性数据(JSON)")
    @ApiModelProperty(description = "属性数据(JSON)")
    private String attrJson;
}
