package com.ls.smartfarm.device.service.impl;

import com.ls.smartfarm.common.utils.PageUtils;
import com.ls.smartfarm.common.utils.Query;
import com.ls.smartfarm.common.utils.R;
import com.ls.smartfarm.device.dao.DeviceDao;
import com.ls.smartfarm.device.dao.UserDeviceDao;
import com.ls.smartfarm.device.entity.DeviceEntity;
import com.ls.smartfarm.device.entity.UserDeviceEntity;
import com.ls.smartfarm.device.service.DeviceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ls.smartfarm.device.dao.UserDao;
import com.ls.smartfarm.device.entity.UserEntity;
import com.ls.smartfarm.device.service.UserService;

import javax.annotation.Resource;

@Slf4j
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {

    @Resource
    UserDao userDao;

    @Resource
    UserDeviceDao userDeviceDao;

    @Resource
    DeviceDao deviceDao;


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserEntity> page = this.page(
                new Query<UserEntity>().getPage(params),
                new QueryWrapper<UserEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public R login(String phone, String password) {

        UserEntity loginedUser = userDao.selectLogin(phone, password);

        if (loginedUser == null) {
            return R.error("用户名或密码错误");
        } else {
            return R.ok("登录成功").put("userInfo", loginedUser);
        }
    }

    @Override
    public R selectUserAllDevice(Integer uid) {

        List<UserDeviceEntity> userDeviceEntities = userDeviceDao.selectList(new QueryWrapper<UserDeviceEntity>().eq("user_id", uid));

        List<Integer> deviceIds = userDeviceEntities.stream().map(userDeviceEntity -> userDeviceEntity.getDeviceId()).collect(Collectors.toList());

        List<DeviceEntity> deviceEntityList = new ArrayList<DeviceEntity>();

        for (Integer deviceId : deviceIds) {

            deviceEntityList.add(deviceDao.selectById(deviceId));
        }

        return R.ok().put("data", deviceEntityList);
    }

}