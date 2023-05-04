package com.kingyun.gpsinspection.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kingyun.gpsinspection.mapper.AccountRoleMapper;
import com.kingyun.gpsinspection.domain.AccountRole;
import com.kingyun.gpsinspection.service.IAccountRoleService;
import com.kingyun.common.core.text.Convert;

/**
 * (旧)账号角色关联Service业务层处理
 *
 * @author kingyun
 * @date 2023-04-28
 */
@Service
public class AccountRoleServiceImpl implements IAccountRoleService
{
    @Autowired
    private AccountRoleMapper accountRoleMapper;

    /**
     * 查询(旧)账号角色关联
     *
     * @param accountRoleId (旧)账号角色关联主键
     * @return (旧)账号角色关联
     */
    @Override
    public AccountRole selectAccountRoleByAccountRoleId(String accountRoleId)
    {
        return accountRoleMapper.selectAccountRoleByAccountRoleId(accountRoleId);
    }

    /**
     * 查询(旧)账号角色关联列表
     *
     * @param accountRole (旧)账号角色关联
     * @return (旧)账号角色关联
     */
    @Override
    public List<AccountRole> selectAccountRoleList(AccountRole accountRole)
    {
        return accountRoleMapper.selectAccountRoleList(accountRole);
    }

    /**
     * 新增(旧)账号角色关联
     *
     * @param accountRole (旧)账号角色关联
     * @return 结果
     */
    @Override
    public int insertAccountRole(AccountRole accountRole)
    {
        return accountRoleMapper.insertAccountRole(accountRole);
    }

    /**
     * 修改(旧)账号角色关联
     *
     * @param accountRole (旧)账号角色关联
     * @return 结果
     */
    @Override
    public int updateAccountRole(AccountRole accountRole)
    {
        return accountRoleMapper.updateAccountRole(accountRole);
    }

    /**
     * 批量删除(旧)账号角色关联
     *
     * @param accountRoleIds 需要删除的(旧)账号角色关联主键
     * @return 结果
     */
    @Override
    public int deleteAccountRoleByAccountRoleIds(String accountRoleIds)
    {
        return accountRoleMapper.deleteAccountRoleByAccountRoleIds(Convert.toStrArray(accountRoleIds));
    }

    /**
     * 删除(旧)账号角色关联信息
     *
     * @param accountRoleId (旧)账号角色关联主键
     * @return 结果
     */
    @Override
    public int deleteAccountRoleByAccountRoleId(String accountRoleId)
    {
        return accountRoleMapper.deleteAccountRoleByAccountRoleId(accountRoleId);
    }
}
