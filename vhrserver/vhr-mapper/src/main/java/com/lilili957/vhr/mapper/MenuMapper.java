package com.lilili957.vhr.mapper;

import com.lilili957.vhr.model.Menu;

import java.util.List;

public interface MenuMapper {
    int deleteByPrimary(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu> getMenusByHrId(Integer hrid);

    List<Menu> getAllMenusWithRole();

    List<Integer> getMidsByRid(Integer rid);

}
