package com.kingyun.gpsinspection.mapper;

import java.util.List;
import java.util.Map;

import com.kingyun.gpsinspection.domain.OrgLevel;
import com.kingyun.gpsinspection.domain.Organization;
import com.kingyun.gpsinspection.vo.EmployeeSimpleVo;

/**
 * (旧)组织机构Mapper接口
 *
 * @author kingyun
 * @date 2023-04-28
 */
public interface OrganizationMapper
{
    /**
     * 查询(旧)组织机构
     *
     * @param orgId (旧)组织机构主键
     * @return (旧)组织机构
     */
    public Organization selectOrganizationByOrgId(String orgId);

    /**
     * 查询(旧)组织机构列表
     *
     * @param organization (旧)组织机构
     * @return (旧)组织机构集合
     */
    public List<Organization> selectOrganizationList(Organization organization);

    /**
     * 新增(旧)组织机构
     *
     * @param organization (旧)组织机构
     * @return 结果
     */
    public int insertOrganization(Organization organization);

    /**
     * 修改(旧)组织机构
     *
     * @param organization (旧)组织机构
     * @return 结果
     */
    public int updateOrganization(Organization organization);

    /**
     * 删除(旧)组织机构
     *
     * @param orgId (旧)组织机构主键
     * @return 结果
     */
    public int deleteOrganizationByOrgId(String orgId);

    /**
     * 批量删除(旧)组织机构
     *
     * @param orgIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOrganizationByOrgIds(String[] orgIds);


    /**
     * 根据条件查询集合
     *
     * @param param
     * @return
     */
    List<Organization> selectOrgTree(Organization param);

    /**
     * 根据条件查询集合
     *
     * @param param
     * @return
     */
    List<Organization> selectOrgTreeKeyword(Organization param);


    /**
     * 根据orgId数组查询
     *
     * @param record
     * @return List<Organization>
     * @Author 卢曼成
     */
    List<Organization> queryOrgIdByList(Organization record);

    /**
     * 查询小于给定层级的机构
     *
     * @param level
     * @return
     */
    List<Organization> selectOrgByLevel(String level);

    /**
     * @param resMap
     * @return
     */
    List<Organization> selectDingLevelOrganization(Map resMap);


    /**
     * 按给定的父机构ID查询下级机构list
     *
     * @param orgId
     * @return
     */
    List<Organization> selectOrgByOrgPId(String orgId);

    /**
     * 按给定的父机构ID查询下级机构list：去掉管线和井口
     *
     * @param orgId
     * @return
     */
    List<Organization> selectOrgWithoutPipelineWellByOrgPId(String orgId);

    /**
     * 按给定的机构ID查询机构详情
     *
     * @param orgId
     * @return
     */
    Organization selectOrgByOrgId(String orgId);


    /**
     * 按给定的机构ID查询机构详情
     *
     * @param orgId
     * @return
     */
    int deleteByPrimaryKey(String orgId);

    /**
     * 新增机构
     *
     * @param record
     * @return
     */
    int insert(Organization record);

    /**
     * 新增机构
     *
     * @param record
     * @return
     */
    int insertSelective(Organization record);

    /**
     * 获取机构详情
     *
     * @param orgId
     * @return
     */
    Organization selectByPrimaryKey(String orgId);

    /**
     * 删除机构
     *
     * @param orgId
     * @return
     */
    int deleteOrg(String orgId);

    /**
     * 更新机构
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(Organization record);

    /**
     * 判断是否为空.更新机构
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Organization record);

    /**
     * 获取机构层级
     *
     * @return
     */
    List<OrgLevel> selectOrgLevels();

    /**
     * 按机构名称查询机构信息
     *
     * @param orgName
     * @return
     */
    Organization selectOrgByName(String orgName);

    /**
     * 获取机构层级
     *
     * @param index
     * @return
     */
    List<OrgLevel> selectOrgLevelsByIndex(String index);

    /**
     * 查询组织机构下级机构数量
     *
     * @param orgId
     * @return
     */
    int selectCountByPOId(String orgId);

    /**
     * 查询组织机构下级机构数量
     *
     * @param orgId
     * @return
     */
    List<Organization> selectListByPOId(String orgId);

    /**
     * 按组织机构ID查询员工列表
     *
     * @param orgId
     * @return
     */
    List<EmployeeSimpleVo> selectEmpByOrgId(String orgId);

    /**
     * 按员工ID查询员工信息
     *
     * @param empId
     * @return
     */
    EmployeeSimpleVo selectEmpByEmpId(String empId);

    /**
     * 获取机构详情
     *
     * @param id
     * @return
     */
    Organization selectOrgById(String id);

    /**
     * 组织机构树查询初始化
     *
     * @param organization
     * @return
     */
    List<Organization> selectOrgList(Organization organization);

    /**
     * 组织机构树查询初始化
     *
     * @param organization
     * @return
     */
    List<Organization> selectOrgListLike(Organization organization);

    /**
     * @param list
     * @Author 卢曼成
     * @Description 批量添加
     * @Date 2017/2/8 17:17
     */
    int insertList(List<Organization> list);

    /**
     * @param list
     * @Author 卢曼成
     * @Description 批量修改
     * @Date 2017/2/8 17:17
     */
    int updateList(List<Organization> list);

    /**
     * @param list
     * @Author 卢曼成
     * @Description 批量逻辑删除
     * @Date 2017/2/8 17:18
     */
    int deleteList(List<Organization> list);

    /**
     * @return List<String>
     * @Author 卢曼成
     * @Description 查询所有子项
     */
    List<Organization> selectByOrgItem(Organization record);

    /**
     * 组织机构查询， 查询指定的组织机构层级 或者 小于组织机构层级
     *
     * @return
     */
    List<Organization> selectOrgListByEmployee(Map employeeMap);

    /**
     * @param list
     * @return List<String>
     * @Author 卢曼成
     * @Description 根据组织条件查询ID集合
     * @CreateDateTime 2017/3/23 18:21
     **/
    List<String> selectByListId(List<Organization> list);

    /**
     * @param list
     * @return List<Organization>
     * @Author 卢曼成
     * @Description 根据组织条件查询数据集合
     * @CreateDateTime 2017/3/23 18:21
     **/
    List<Organization> selectByOldIdListId(List<Organization> list);

    /**
     * 获取对应组织下有特性值
     *
     * @param orgId
     * @return
     */
    List<Organization> getOrgPorperties(String orgId);

    /**
     * 获取当前组织及祖先组织：向上遍历
     */
    List<Organization> selectUpByTree(String orgId);

    /**
     * 获取当前组织及后代组织：向下遍历
     */
    List<Organization> selectDownByTree(String orgId);

    /**
     * 获取场站对应的作业区
     * @param orgId
     * @return
     */
    String getUserOrgId(String orgId);
    /**
     * 获取作业区对应的矿级
     *
     * @param orgId
     * @return
     */
    String getUserOrgParentId(String orgId);

    List<Organization> selectBottomToTopOrgList(Map keyWorkMap);

    /**
     * 获取当前组织及后代组织：向下遍历，，去除管线和井口
     */
    List<Organization> selectDownByTreeWithoutPipelineWell(String orgId);


    List<Organization> selectOrgLists(Organization org);

    /**
     * 施工单位树
     * @return
     */
    List<Organization> queryPmZtrees();

    /**
     * 监理单位树
     * @return
     */
    List<Organization> querySmZtrees();


    /**
     * 查询有管道正在建设的作业区
     * @return
     */
    List<Organization> queryByChancesPipeLineBuiding();

    /**
     * 向上查找leve 为1 的组织
     * @param orgId
     * @return
     */
    Organization queryUpOrg(String orgId);


    /**
     * 查询外围单位根节点
     * @return
     */
    List<Organization> queryRoot();

    /**
     * 查询外围单位根节点
     * @return
     */
    List<Organization> queryRootItem(String orgId);


    /***
     * @Description: 查询所有作业区
     * @author: YANG
     * @date: 2021/2/7 9:10
     * @param
     * @return java.util.List<com.kingyun.gpsinspection.pipelineservice.facade.model.base.Organization>
     */
    List<Organization> queryAllOperationArea();
}
