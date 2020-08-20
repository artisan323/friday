package cn.smartyouth.friday.common.domin;

import lombok.Data;

import java.io.Serializable;

@Data
public class user implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long userCde;
    private String userName;
    private String passWord;
    private String icon;
    private String email;
    private String wechat;
    private String createTime;
    private String loginTime;
    private String status;
}
