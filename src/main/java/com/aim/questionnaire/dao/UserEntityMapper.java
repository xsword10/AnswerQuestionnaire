package com.aim.questionnaire.dao;

import com.aim.questionnaire.dao.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserEntityMapper {
    /**
     * 根据用户名查找用户信息
     * @param username
     * @return
     */
	List<UserEntity> selectUserInfo(UserEntity userEntity);
    /**
     * 
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated
     */
    int insert(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated
     */
    int insertSelective(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated
     */
    UserEntity selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserEntity record);

    /**
     * 查询用户列表（模糊搜索）
     * @param map
     * @return
     */
    List<Map<String,Object>> queryUserList(Map<String,Object> map);

    /**
     * 创建用户的基本信息
     * @param map
     * @return
     */
    int addUserInfo(Map<String, Object> map);

    /**
     * 编辑用户的基本信息
     * @param map
     * @return
     */
    int modifyUserInfo(Map<String, Object> map);

    /**
     * 根据用户名查找用户信息
     * @param username
     * @return
     */
    UserEntity selectAllByName(String username);

    /**
     * 根据用户名查找用户id
     * @param username
     * @return
     */
    String selectIdByName(String username);

    /**
     * 修改用户状态
     * @param map
     * @return
     */
    int modifyUserStatus(Map<String, Object> map);

    /**
     * 根据id查询用户信息
     * @param userEntity
     * @return
     */
    Map<String,Object> selectUserInfoById(UserEntity userEntity);


    /**
     * 查询用户的权限
     * @param user
     * @return
     */
    String queryUserRole(String user);

    /**
     * 查询用户截止时间
     * @return
     */
    List<Map<String,Object>> selectAllEndTime();

    /**
     * 修改用户状态
     * @param modifyMap
     * @return
     */
    int modifyUserInfoStatus(Map<String, Object> modifyMap);

    /**
     * 查询用户密码是否存在
     * @param map
     * @return
     */
    int queryUserPassword(Map<String, Object> map);

    /**
     * 根据用户id查询用户名
     * @param id
     * @return
     */
    String selectUserNameInfoById(String id);

    /**
     * 判断用户名是否存在
     * @param map
     * @return
     */
    int queryExistUser(Map<String,Object> map);

    /**
     * 删除用户信息
     * @param userEntity
     * @return
     */
    int deteleUserInfoById(UserEntity userEntity);

    /**
     * 查询用户创建的项目
     * @param id
     * @return
     */
    int queryProjectByUser(String id);

    /**
     * 根据角色查询用户
     * @param map
     * @return
     */
    int queryUserCountByRole(Map<String, Object> map);
}