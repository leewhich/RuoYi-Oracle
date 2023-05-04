package com.kingyun.gpsinspection.mapper;

import java.util.List;
import com.kingyun.gpsinspection.domain.AccountRole;

/**
 * (旧)账号角色关联Mapper接口
 * 
 * @author kingyun
 * @date 2023-04-28
 */
public interface AccountRoleMapper 
{
    /**
     * 查询(旧)账号角色关联
     * 
     * @param accountRoleId (旧)账号角色关联主键
     * @return (旧)账号角色关联
     */
    public AccountRole selectAccountRoleByAccountRoleId(String accountRoleId);

    /**
     * 查询(旧)账号角色关联列表
     * 
     * @param accountRole (旧)账号角色关联
     * @return (旧)账号角色关联集合
     */
    public List<AccountRole> selectAccountRoleList(AccountRole accountRole);

    /**
     * 新增(旧)账号角色关联
     * 
     * @param accountRole (旧)账号角色关联
     * @return 结果
     */
    public int insertAccountRole(AccountRole accountRole);

    /**
     * 修改(旧)账号角色关联
     * 
     * @param accountRole (旧)账号角色关联
     * @return 结果
     */
    public int updateAccountRole(AccountRole accountRole);

    /**
     * 删除(旧)账号角色关联
     * 
     * @param accountRoleId (旧)账号角色关联主键
     * @return 结果
     */
    public int deleteAccountRoleByAccountRoleId(String accountRoleId);

    /**
     * 批量删除(旧)账号角色关联
     * 
     * @param accountRoleIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAccountRoleByAccountRoleIds(String[] accountRoleIds);
}
