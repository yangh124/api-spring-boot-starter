package com.yh.api.dto.qywx.response;

import com.alibaba.fastjson2.annotation.JSONField;
import com.yh.api.dto.qywx.QywxBaseRespDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

@EqualsAndHashCode(callSuper = true)
@Data
public class JsApiTicketRespDTO extends QywxBaseRespDTO {

    @Serial
    private static final long serialVersionUID = 8516456470682548057L;

    /**
     * 生成签名所需的jsapi_ticket，最长为512字节
     */
    private String ticket;

    /**
     * 过期时间（秒）
     */
    @JSONField(name = "expires_in")
    private Long expiresIn;


}
