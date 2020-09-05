package com.lilili957.vhr.mapper;

import org.apache.ibatis.annotations.Param;

public interface HrRoleMapper {
    void deleteByHrid(Integer hrid);

    Integer addRole(@Param("hrid") Integer hrid, @Param("rids") Integer[] rids);
}
