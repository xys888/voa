package com.xys.yebserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xys.yebserver.mapper.AdminMapper;
import com.xys.yebserver.pojo.Admin;
import com.xys.yebserver.service.IAdminService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xys
 * @since 2021-11-24
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
