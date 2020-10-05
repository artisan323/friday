package cn.smartyouth.friday.common.domin;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 用户主表
 * </p>
 *
 * @author wnqn
 * @since 2020-10-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UsrInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户自增id
     */
    private Long usrId;

    /**
     * 用户编号
     */
    private String usrCde;

    /**
     * 用户姓名
     */
    private String usrName;

    /**
     * 微信号
     */
    private String usrWechat;

    /**
     * qq 号
     */
    private String usrQq;

    /**
     * 手机号
     */
    private String usrTel;

    /**
     * 邮箱
     */
    private String usrEmail;

    /**
     * 用户状态
     */
    private String usrStatus;

    /**
     * 是否已删除
     */
    private String isValid;

    /**
     * 创建人
     */
    private String crtUsr;

    /**
     * 创建时间
     */
    private String crtDate;

    /**
     * 更新人
     */
    private String updUsr;

    /**
     * 更新时间
     */
    private String updDate;


}
