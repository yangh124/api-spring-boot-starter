package com.yh.api.dto.qywx.response;

import com.alibaba.fastjson2.annotation.JSONField;
import com.yh.api.dto.qywx.MemberDTO;
import com.yh.api.dto.qywx.QywxBaseRespDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TagGetRespDTO extends QywxBaseRespDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 6965548374951757640L;

    @JSONField(name = "tagname")
    private String tagName;

    @JSONField(name = "userlist")
    private List<MemberDTO> userList;
}
