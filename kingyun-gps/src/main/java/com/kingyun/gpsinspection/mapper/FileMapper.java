package com.kingyun.gpsinspection.mapper;



import com.kingyun.gpsinspection.domain.File;

import java.util.List;

/**
 * 附件信息
 */
public interface FileMapper {
	/**
	 * 删除附件信息
	 *
	 * @param fileId
	 * @return
	 */
	int deleteByPrimaryKey(String fileId);

	/**
	 * 新增附件信息
	 *
	 * @param record
	 * @return
	 */
	int insert(File record);

	/**
	 * 新增附件信息
	 *
	 * @param record
	 * @return
	 */
	int insertSelective(File record);

	/**
	 * 查询附件信息
	 *
	 * @param fileId
	 * @return
	 */
	File selectByPrimaryKey(String fileId);

	/**
	 * 修改附件信息
	 *
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(File record);

	/**
	 * 修改附件信息
	 *
	 * @param record
	 * @return
	 */
	int updateByPrimaryKey(File record);

	/**
	 * 批量新增附件信息
	 *
	 * @param list
	 * @return
	 */
	int insertByList(List<File> list);

	/**
	 * 批量删除附件信息
	 *
	 * @param businessId
	 * @return
	 */
	int delByBusinessId(String businessId);

	/**
	 * 查询附件信息
	 *
	 * @param businessId
	 * @return
	 */
	List<File> queryByBusinessId(String businessId);

	/**
	 * 根据String数组集合，查询附件信息
	 *
	 * @param list
	 * @return
	 */
	List<File> queryByBusinessIdString(List<String> list);


	/**
	 * 根据文件名称修改附件信息
	 *
	 * @param record
	 * @return
	 */
	int updateByFileName(File record);


}
